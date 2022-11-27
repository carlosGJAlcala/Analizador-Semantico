package formitas;

public class MyVisitor extends formitasBaseVisitor {
    TSgeneradorPY ts;
    public MyVisitor() {
        super();
        ts=new TSgeneradorPY();
    }

    @Override public Object visitFormitasFile(formitasParser.FormitasFileContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFila(formitasParser.FilaContext ctx) {



        return visitChildren(ctx); }

    @Override public Object visitRow(formitasParser.RowContext ctx) { return visitChildren(ctx); }
    @Override public Object visitSaltoLinea(formitasParser.SaltoLineaContext ctx) {
        //System.out.println("saltoLinea()");
        ts.setComandos("self.saltoLinea()");
        return visitChildren(ctx); }
    @Override public Object visitCampo(formitasParser.CampoContext ctx) {

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

    public TSgeneradorPY getTs() {
        return ts;
    }
}
