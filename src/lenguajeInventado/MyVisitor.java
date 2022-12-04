package lenguajeInventado;


import lenguajeInventado.modelo.GeneradorJasmin;

public class MyVisitor extends LenguajeInventadoBaseVisitor<String> {
    GeneradorJasmin ts;
    String comando;
    public MyVisitor() {
        super();
        ts = new GeneradorJasmin();
        comando="";
    }

    public GeneradorJasmin getGenerador() {
        return ts;
    }


    @Override
    public String visitProg(LenguajeInventadoParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFila(LenguajeInventadoParser.FilaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCampo(LenguajeInventadoParser.CampoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAsignacion(LenguajeInventadoParser.AsignacionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAztulizar(LenguajeInventadoParser.AztulizarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExpr(LenguajeInventadoParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitVariable(LenguajeInventadoParser.VariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitNumber(LenguajeInventadoParser.NumberContext ctx) {
        visitChildren(ctx);
        comando="ldc " + ctx.number.getText();
        ts.setComandos(comando);
        return null;
    }

    @Override
    public String visitDiv(LenguajeInventadoParser.DivContext ctx) {
        visitChildren(ctx);
        comando=visitChildren(ctx) + "\nldc " + ctx.right.getText() + "\n" + "idiv";
        ts.setComandos(comando);
        return null;
    }

    @Override
    public String visitMul(LenguajeInventadoParser.MulContext ctx) {
        visitChildren(ctx);
        comando="\nldc " + ctx.right.getText() + "\n" + "imul";
        ts.setComandos(comando);
        return null;
    }

    @Override
    public String visitPlus(LenguajeInventadoParser.PlusContext ctx) {
        visitChildren(ctx);
        comando="\nldc " + ctx.right.getText() + "\n" + "iadd";
        ts.setComandos(comando);
        return null;
    }

    @Override
    public String visitMinus(LenguajeInventadoParser.MinusContext ctx) {
        visitChildren(ctx);
        comando= "\nldc " + ctx.right.getText() + "\n" + "ineg"
                + "\n" + "iadd";
        ts.setComandos(comando);
        return null;
    }

    @Override
    public String visitComentario(LenguajeInventadoParser.ComentarioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTextos(LenguajeInventadoParser.TextosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExprcond(LenguajeInventadoParser.ExprcondContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCondicion(LenguajeInventadoParser.CondicionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitMostrar(LenguajeInventadoParser.MostrarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFor(LenguajeInventadoParser.ForContext ctx) {
        return visitChildren(ctx);
    }

}


