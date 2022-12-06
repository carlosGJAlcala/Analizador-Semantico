package lenguajeInventado;


import lenguajeInventado.modelo.GeneradorJasmin;
import lenguajeInventado.modelo.TablaSimbolos;
import lenguajeInventado.modelo.Variable;

public class MyVisitor extends LenguajeInventadoBaseVisitor<String> {
    GeneradorJasmin gj;
    String comando;
    Variable varTemporal;
    TablaSimbolos ts;
    int inttemporal;

    public MyVisitor() {
        super();
        gj = new GeneradorJasmin();
        ts = new TablaSimbolos();
        comando = "";
    }

    public GeneradorJasmin getGenerador() {
        return gj;
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
        visitChildren(ctx);
        varTemporal = new Variable();
        varTemporal.setNombre(ctx.nombrevariable.getText());
        ts.Insertar(varTemporal);

        comando="istore "+varTemporal.getContador();
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitActualizar(LenguajeInventadoParser.ActualizarContext ctx) {
        visitChildren(ctx);
        varTemporal = new Variable();
        varTemporal.setNombre(ctx.nombrevariable.getText());
        ts.Insertar(varTemporal);

        comando="istore "+varTemporal.getContador();
        gj.setComandos(comando);
        return null;
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
        inttemporal = Integer.parseInt(ctx.number.getText());
        comando = "ldc " + inttemporal;
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitDiv(LenguajeInventadoParser.DivContext ctx) {
        visitChildren(ctx);
        inttemporal = inttemporal / Integer.parseInt(ctx.right.getText());

        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal);

        comando = visitChildren(ctx) + "\nldc " + ctx.right.getText() + "\n" + "idiv";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMul(LenguajeInventadoParser.MulContext ctx) {

        visitChildren(ctx);
        inttemporal = inttemporal * Integer.parseInt(ctx.right.getText());

        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal);

        comando = "\nldc " + ctx.right.getText() + "\n" + "imul";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitPlus(LenguajeInventadoParser.PlusContext ctx) {

        visitChildren(ctx);
        inttemporal = inttemporal + Integer.parseInt(ctx.right.getText());


        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal);

        comando = "\nldc " + ctx.right.getText() + "\n" + "iadd";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMinus(LenguajeInventadoParser.MinusContext ctx) {
        visitChildren(ctx);
        inttemporal = inttemporal - Integer.parseInt(ctx.right.getText());

        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal);

        comando = "\nldc " + ctx.right.getText() + "\n" + "ineg"
                + "\n" + "iadd";
        gj.setComandos(comando);
        return null;
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
        visitChildren(ctx);
        comando = "\nldc " + ctx.variableFor.getText() + "\n";
        gj.setComandos(comando);
        ts.setContador(ts.getContador()+1);
        comando="istore "+ts.getContador();
        gj.setComandos(comando);
        return null;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }


}


