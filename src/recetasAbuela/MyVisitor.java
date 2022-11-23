package recetasAbuela;

public class MyVisitor extends recetasBaseVisitor<Object> {
    RecetaTS ts,tsSig;


    @Override public Object visitProg(recetasParser.ProgContext ctx) {

        ts = new RecetaTS();

        return visitChildren(ctx); }

    @Override public Object visitFila(recetasParser.FilaContext ctx) {
        tsSig = new RecetaTS();
        ts.setSig(tsSig);
        tsSig.setAnterior(ts);
        ts=tsSig;
        return visitChildren(ctx); }

    @Override public Object visitReceta(recetasParser.RecetaContext ctx) {
        String utensilio,cubierto,ingrediente;

        utensilio= (ctx.utensilios!=null)?ctx.utensilios.getText():"";
        cubierto= (ctx.cubiertos !=null)?ctx.cubiertos.getText():"";
        ingrediente=(ctx.ingredientes!=null)?ctx.ingredientes.getText():"";
        ts.setCubierto(cubierto);
        ts.setIngrediente(ingrediente);
        ts.setUtensilio(utensilio);

        return visitChildren(ctx); }

    @Override public Object visitConclusion(recetasParser.ConclusionContext ctx) { return visitChildren(ctx); }

    public RecetaTS getTs() {
        return ts;
    }
}
