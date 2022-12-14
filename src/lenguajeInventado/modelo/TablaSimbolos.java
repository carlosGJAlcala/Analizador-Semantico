package lenguajeInventado.modelo;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {
    Map<String, Variable> tablaExpansion;
    TablaSimbolos sig, anterior;
    int contador;
    int contVarBucle;

    public TablaSimbolos() {
        this.tablaExpansion = new HashMap();
        this.anterior = null;
        this.sig = null;
        this.contador = -1;
        this.contVarBucle = 0;
    }

    public int getContVarBucle() {
        return contVarBucle;
    }

    public void setContVarBucle(int contVarBucle) {
        this.contVarBucle = contVarBucle;
    }

    public Map<String, Variable> getTablaExpansion() {
        return tablaExpansion;
    }

    public void setTablaExpansion(Map<String, Variable> tablaExpansion) {
        this.tablaExpansion = tablaExpansion;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public TablaSimbolos getSig() {
        return sig;
    }

    public void setSig(TablaSimbolos sig) {
        this.sig = sig;
    }

    public TablaSimbolos getAnterior() {
        return anterior;
    }

    public void setAnterior(TablaSimbolos anterior) {
        this.anterior = anterior;
    }

    public void Insertar(Variable var) {
        this.contador = contador + 1;
        var.setContador(contador);
        tablaExpansion.put(var.getNombre(), var);

    }

    public void Eliminar(String clave) {
        tablaExpansion.remove(clave);

    }

    public void Actualizar(Variable var) {
        tablaExpansion.put(var.getNombre(), var);

    }

    public boolean isExist(String var) {
        if (tablaExpansion.get(var) != null) {
            return true;
        } else {
            return false;
        }
    }

    //busca y trae el objecto Variable
    public Variable fecth(String clave) {

        return tablaExpansion.get(clave);
    }
}
