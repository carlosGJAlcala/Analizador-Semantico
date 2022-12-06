package lenguajeInventado.modelo;

public class Variable {
    String nombre;
    String valor;
    String tipo;
    int contador;
    public Variable() {
        this.nombre ="" ;
        this.tipo="";
        this.valor=null;
        contador=0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
