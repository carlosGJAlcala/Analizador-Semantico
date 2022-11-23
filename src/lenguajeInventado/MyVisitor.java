package lenguajeInventado;

public class MyVisitor extends LenguajeInventadoBaseVisitor <Object>{

    @Override public Object visitProg(LenguajeInventadoParser.ProgContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFila(LenguajeInventadoParser.FilaContext ctx) { return visitChildren(ctx); }
    @Override public Object visitCampo(LenguajeInventadoParser.CampoContext ctx) { return visitChildren(ctx); }
    @Override public Object visitAsignacion(LenguajeInventadoParser.AsignacionContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExpr(LenguajeInventadoParser.ExprContext ctx) { return visitChildren(ctx); }
    @Override public Object visitComentario(LenguajeInventadoParser.ComentarioContext ctx) { return visitChildren(ctx); }
    @Override public Object visitTextos(LenguajeInventadoParser.TextosContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprcond(LenguajeInventadoParser.ExprcondContext ctx) { return visitChildren(ctx); }
    @Override public Object visitCondicion(LenguajeInventadoParser.CondicionContext ctx) { return visitChildren(ctx); }
    @Override public Object visitMostrar(LenguajeInventadoParser.MostrarContext ctx) { return visitChildren(ctx); }



}
