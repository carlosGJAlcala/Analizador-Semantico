package recetasAbuela;

public class RecetaTS {
    String cubierto,utensilio,ingrediente;
    RecetaTS sig;
    RecetaTS anterior;
    public RecetaTS(){
        anterior=null;
        sig=null;
        cubierto="";
        utensilio="";
        ingrediente="";
    }

    public String getCubierto() {
        return cubierto;
    }

    public void setCubierto(String cubierto) {
        this.cubierto = cubierto;
    }

    public String getUtensilio() {
        return utensilio;
    }

    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public RecetaTS getSig() {
        return sig;
    }

    public void setSig(RecetaTS sig) {
        this.sig = sig;
    }

    public RecetaTS getAnterior() {
        return anterior;
    }

    public void setAnterior(RecetaTS anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "\nRecetaTS{" +
                "cubiertos='" + cubierto + '\'' +
                ", utensilios='" + utensilio + '\'' +
                ", ingredientes='" + ingrediente + '\'' +

                '}';
    }
}
