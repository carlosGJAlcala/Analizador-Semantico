package lenguajeInventado.modelo;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {
    Map<String, Variable> tablaExpansion;
    TablaSimbolos sig, anterior;

    public TablaSimbolos() {
        this.tablaExpansion = new HashMap();
        this.anterior = null;
        this.sig = null;
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
        tablaExpansion.put(var.getNombre(), var);

    }

    public void Eliminar(String clave) {
        tablaExpansion.remove(clave);

    }

    public void Aztualiza(Variable var) {
        tablaExpansion.put(var.getNombre(), var);

    }

    //busca y trae el objecto Variable
    public Variable fecth(String clave) {

        return tablaExpansion.get(clave);
    }
}
