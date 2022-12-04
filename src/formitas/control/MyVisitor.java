package formitas.control;

import formitas.gen.FormitasParser;
import formitas.gen.FormitasParserBaseVisitor;
import formitas.modelo.GeneradorPython;

public class MyVisitor extends FormitasParserBaseVisitor {
    GeneradorPython ts;
    public MyVisitor() {
        super();
        ts=new GeneradorPython();
    }

    @Override public Object visitFormitasFile(FormitasParser.FormitasFileContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFila(FormitasParser.FilaContext ctx) {

        String valimgdim, valshpdim,strimgdim,strshpdim;
        valimgdim= ctx.imgdim.getText();
        valshpdim= ctx.shpdim.getText();
        strimgdim="ancho="+valimgdim;
        ts.setComandos(strimgdim);
        strimgdim="altura="+valimgdim;
        ts.setComandos(strimgdim);
        strshpdim="self.tamCanvas="+valshpdim;
        ts.setComandos(strshpdim);
        ts.setComandos("self.geometry(str(ancho) + \"x\" + str(altura))");

        return visitChildren(ctx); }

    @Override public Object visitRow(FormitasParser.RowContext ctx) { return visitChildren(ctx); }
    @Override public Object visitSaltoLinea(FormitasParser.SaltoLineaContext ctx) {
        //System.out.println("saltoLinea()");
        ts.setComandos("self.saltoLinea()");
        return visitChildren(ctx); }
    @Override public Object visitCampo(FormitasParser.CampoContext ctx) {

        String resultado="self.dibujar(";
        String figura=ctx.figura.getText();
        resultado+='"'+figura+'"';
        if(ctx.color!=null&&ctx.size!=null){
            String color="color="+'"'+ctx.color.getText()+'"';
            String size="tamanio="+ctx.size.getText();
            resultado+=","+color+","+size;
        }
        else if(ctx.color!=null){
            String color="color="+'"'+ctx.color.getText()+'"';
            resultado+=","+color;

        }else if(ctx.size!=null){
            String size="tamanio="+ctx.size.getText();
            resultado+=","+size;

        }

        resultado+=")";
        ts.setComandos(resultado);
        //System.out.println(resultado);
        return resultado; }

    public GeneradorPython getGenerador() {
        return ts;
    }
}
