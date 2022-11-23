package csv;

public class MyVisitor extends  gBaseVisitor<Object>{
    @Override public Object visitCsvFile(gParser.CsvFileContext ctx) {



        return visitChildren(ctx); }

    @Override public Object visitHdr(gParser.HdrContext ctx) {

        return visitChildren(ctx); }

    @Override public Object visitRow(gParser.RowContext ctx) {

        return visitChildren(ctx); }

    @Override public Object visitField(gParser.FieldContext ctx) {

        return visitChildren(ctx); }
}
