package csv;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends  gBaseVisitor<Object>{
    List<String> cabecera,fila;
    JsonTipo primero,ultimo,siguiente;

    public MyVisitor() {
        super();
        primero= new JsonTipo();
        ultimo=primero;
    }

    @Override public Object visitCsvFile(gParser.CsvFileContext ctx) {



        return visitChildren(ctx); }

    @Override public Object visitHdr(gParser.HdrContext ctx) {
        cabecera=new ArrayList<>();
        return visitChildren(ctx); }

    @Override public Object visitRow(gParser.RowContext ctx) {

        if(ultimo!=primero){
            fila=new ArrayList();
            siguiente= new JsonTipo();
            ultimo.setSig(siguiente);
            ultimo.setFila(fila);
            ultimo.setCabecera(cabecera);
            ultimo=siguiente;
        }else {
            fila=new ArrayList();
            siguiente= new JsonTipo();
            primero.setSig(siguiente);
            primero.setFila(fila);
            primero.setCabecera(cabecera);
            ultimo=siguiente;

        }



        return visitChildren(ctx); }

    @Override public Object visitField(gParser.FieldContext ctx) {
        String dato= ctx.texto.getText();
        fila.add(dato);
        return ctx.texto.getText(); }
    @Override public Object visitFieldCabecera(gParser.FieldCabeceraContext ctx) {
        String dato =ctx.texto.getText();
        cabecera.add(dato);
        return visitChildren(ctx); }

    public JsonTipo getPrimero() {
        return primero;
    }
}
