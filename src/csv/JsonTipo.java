package csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTipo {
    Map<String,String> datovalor;
    List<String> cabecera,fila;
    JsonTipo sig, anterior;
    public JsonTipo() {
        cabecera= new ArrayList();
        fila=new ArrayList();
        sig=null;
        anterior=null;
    }

    public void setCabecera(List<String> cabecera) {
        this.cabecera = cabecera;
    }

    public void setFila(List<String> fila) {
        this.fila = fila;
    }

    public void setSig(JsonTipo sig) {
        this.sig = sig;
    }

    public void setAnterior(JsonTipo anterior) {
        this.anterior = anterior;
    }

    public JsonTipo getSig() {
        return sig;
    }

    public JsonTipo getAnterior() {
        return anterior;
    }

    @Override
    public String toString() {
        String resultado="{}";
        if(cabecera.size()==fila.size()){
            resultado="";
            resultado+="{";
            for(int  i= 0;i<cabecera.size();i++){
                resultado+=cabecera.get(i)+":"+"'"+fila.get(i)+"'";
                if(i<cabecera.size()-1){
                    resultado+=",";
                }

            }
            resultado+="}";
        }
        return resultado;
    }
}
