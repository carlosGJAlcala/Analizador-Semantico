package lenguajeInventado.modelo;

public class Variable {
    String nombre;
    Object valor;
    String tipo;

    public Variable() {
        this.nombre ="" ;
        this.tipo="";
        this.valor=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
