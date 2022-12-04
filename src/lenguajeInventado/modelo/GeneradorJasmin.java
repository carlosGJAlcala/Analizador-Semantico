package lenguajeInventado.modelo;

public class GeneradorJasmin {
    String comandos, cabecera, funciones;


    public GeneradorJasmin() {
        this.comandos = "\n";
        this.cabecera = ".class public Sumar\n"
                + ".super java/lang/Object\n"
                + "\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "   .limit stack 100\n"
                + "   .limit locals 100\n"
                + "\n";
        this.funciones = "return\n"
                + "\n"
                + ".end method";
    }

    public void setComandos(String comandos) {
        this.comandos += comandos + "\n";
    }

    @Override
    public String toString() {
        String resultado = cabecera + comandos + funciones;
        return resultado;
    }

}
