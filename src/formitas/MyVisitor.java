package formitas;

public class MyVisitor extends formitasBaseVisitor {
    @Override public Object visitFormitasFile(formitasParser.FormitasFileContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFila(formitasParser.FilaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRow(formitasParser.RowContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCampo(formitasParser.CampoContext ctx) { return visitChildren(ctx); }
}
