package lenguajeInventado;


import lenguajeInventado.modelo.GeneradorJasmin;
import lenguajeInventado.modelo.TablaSimbolos;
import lenguajeInventado.modelo.Variable;

public class MyVisitor extends LenguajeInventadoBaseVisitor<String> {
    GeneradorJasmin gj;
    String comando;
    Variable varTemporal;
    TablaSimbolos ts;
    Variable operando1, operando2;
    //para for
    String pos1, pos2;
    int inttemporal, intContBucle,intContIf;

    public MyVisitor() {
        super();
        gj = new GeneradorJasmin();
        ts = new TablaSimbolos();
        comando = "";
        intContBucle = 0;
        intContIf=0;
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
        varTemporal = new Variable();
        visitChildren(ctx);

        varTemporal.setNombre(ctx.nombrevariable.getText());
        varTemporal.setValor(inttemporal + "");
        ts.Insertar(varTemporal);

        comando = "istore " + varTemporal.getContador();
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitActualizar(LenguajeInventadoParser.ActualizarContext ctx) {
        varTemporal = ts.fecth(ctx.nombrevariable.getText());
        visitChildren(ctx);

        comando = "istore " + varTemporal.getContador();
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitExpr(LenguajeInventadoParser.ExprContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public String visitVariable(LenguajeInventadoParser.VariableContext ctx) {
        visitChildren(ctx);
        String nombreVarible = ctx.variable.getText();
        Variable var = ts.fecth(nombreVarible);
        inttemporal = Integer.parseInt(var.getValor());
        comando = "ldc " + inttemporal;
        gj.setComandos(comando);
        return null;
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
        varTemporal.setValor(inttemporal + "");

        comando = visitChildren(ctx) + "\nldc " + ctx.right.getText() + "\n" + "idiv";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMul(LenguajeInventadoParser.MulContext ctx) {

        visitChildren(ctx);
        inttemporal = inttemporal * Integer.parseInt(ctx.right.getText());

        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal + "");

        comando = "\nldc " + ctx.right.getText() + "\n" + "imul";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitPlus(LenguajeInventadoParser.PlusContext ctx) {

        visitChildren(ctx);
        inttemporal = inttemporal + Integer.parseInt(ctx.right.getText());


        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal + "");

        comando = "\nldc " + ctx.right.getText() + "\n" + "iadd";
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMinus(LenguajeInventadoParser.MinusContext ctx) {
        visitChildren(ctx);
        inttemporal = inttemporal - Integer.parseInt(ctx.right.getText());

        varTemporal.setTipo("int");
        varTemporal.setValor(inttemporal + "");

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
    public String visitMayor(LenguajeInventadoParser.MayorContext ctx) {
        comando = "if_icmplt noEntra"+intContIf;
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMenor(LenguajeInventadoParser.MenorContext ctx) {
        comando = "if_icmpgt noEntra"+intContIf;
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitIgualigual(LenguajeInventadoParser.IgualigualContext ctx) {
        comando = "if_icmpne noEntra"+intContIf;
        gj.setComandos(comando);
        return null;
    }

    @Override
    public String visitMostrar(LenguajeInventadoParser.MostrarContext ctx) {
        comando = "getstatic java/lang/System/out Ljava/io/PrintStream;";
        gj.setComandos(comando);
        visitChildren(ctx);

        comando = "invokevirtual java/io/PrintStream/print(" + comando + ")V";
        gj.setComandos(comando);


        return null;
    }

    @Override
    public String visitNumMostrar(LenguajeInventadoParser.NumMostrarContext ctx) {
        visitChildren(ctx);
        comando = "\nldc " + ctx.valor.getText() + "\n";
        gj.setComandos(comando);
        comando = "I";
        return null;
    }

    @Override
    public String visitStringMostrar(LenguajeInventadoParser.StringMostrarContext ctx) {
        visitChildren(ctx);
        comando = "\nldc " + ctx.valor.getText() + "\n";
        gj.setComandos(comando);
        comando = "Ljava/lang/String;";
        return null;
    }

    @Override
    public String visitFloatMostrar(LenguajeInventadoParser.FloatMostrarContext ctx) {
        visitChildren(ctx);
        comando = "\nldc " + ctx.valor.getText() + "\n";
        gj.setComandos(comando);

        comando = "F";
        return null;
    }

    @Override
    public String visitVarMostrar(LenguajeInventadoParser.VarMostrarContext ctx) {
        visitChildren(ctx);
        Variable var = ts.fecth(ctx.valor.getText());
        comando = "\niload " + var.getContador() + "\n";
        gj.setComandos(comando);
        if (var.getTipo().equals("String")) {
            comando = "Ljava/lang/String;";
        } else if (var.getTipo().equals("int")) {
            comando = "I";
        } else if (var.getTipo().equals("Float")) {
            comando = "F";
        }
        return null;
    }


    public String comprobarVarIf(String var1) {
        //comprueba si es una memoria o es un numero,
        varTemporal = new Variable();
        if (var1.matches("[A-Za-z].*")) {
            varTemporal = ts.fecth(var1);
            var1 = varTemporal.getContador() + "";
            this.comando = "ldc " + var1;
            gj.setComandos(comando);
            this.comando = "istore " + varTemporal.getContador();
        } else {

            this.comando = "ldc " + var1;
            gj.setComandos(comando);
            varTemporal.setTipo("int");
            this.intContBucle = intContBucle + 1;
            varTemporal.setNombre(intContBucle + "");
            ts.Insertar(varTemporal);
            this.comando = "istore " + varTemporal.getContador();
            gj.setComandos(comando);


        }
        return varTemporal.getContador() + "";
    }
    @Override
    public String visitIf(LenguajeInventadoParser.IfContext ctx) {
        intContIf++;
        visitChildren(ctx);

        comando = "noEntra"+intContIf+":";
        gj.setComandos(comando);

        return null;
    }

    @Override
    public String visitCondicionif(LenguajeInventadoParser.CondicionifContext ctx) {
        String var1 = ctx.varDerecha.getText();
        String var2 = ctx.varIzquierda.getText();
        String pos1, pos2;
        varTemporal = new Variable();
        pos1 = comprobarVarIf(var1);
        pos2 = comprobarVarIf(var2);


        this.comando = "iload " + pos1;
        gj.setComandos(comando);
        this.comando = "iload "  + pos2;
        gj.setComandos(comando);

        visitChildren(ctx);
        return null;
    }
    @Override
    public String visitFor(LenguajeInventadoParser.ForContext ctx) {

        visitChildren(ctx);
        this.comando="    iload "+pos1+"\n" +
                "    ldc "+pos1+" \n" +
                "    iadd\n" +
                "    istore "+pos2+"\n" +
                "    iload "+pos2+"\n" +
                "    iload "+pos1;
        gj.setComandos(comando);
        this.comando = "if_icmplt bucleWhile"+intContBucle ;
        gj.setComandos(comando);
        comando = "noEntra"+intContBucle+":";
        gj.setComandos(comando);
        return null;
    }
    @Override
    public String visitCondicionfor(LenguajeInventadoParser.CondicionforContext ctx) {

        String var1 = ctx.nombrevariable.getText();
        String var2 = (intContBucle++) + "";
        String valor1 = ctx.valornum.getText();
        String valor2 = ctx.valorlim.getText();


        pos1 = comprobarVarFor(var1, valor1);
        pos2 = comprobarVarFor(var2, valor2);


        this.comando = "iload " + pos1;
        gj.setComandos(comando);
        this.comando = "iload " + pos2;
        gj.setComandos(comando);

        this.comando = "if_icmpge noEntra"+intContBucle ;
        gj.setComandos(comando);
        this.comando = "bucleWhile"+intContBucle +":";
        gj.setComandos(comando);
        return null;
    }

    private String comprobarVarFor(String var1, String valor1) {

        //comprueba si es una memoria o es un numero,
        varTemporal = new Variable();


        this.comando = "ldc " + valor1;
        gj.setComandos(comando);
        varTemporal.setTipo("int");
        this.intContBucle = intContBucle + 1;
        varTemporal.setNombre(var1);
        ts.Insertar(varTemporal);
        this.comando = "istore " + varTemporal.getContador();
        gj.setComandos(comando);


        return varTemporal.getContador() + "";

    }

    private void cambioContextoSig() {
        //cambiamos de contexto
        TablaSimbolos tstemp = new TablaSimbolos();
        tstemp.setAnterior(ts);
        ts.setSig(tstemp);
        ts = tstemp;

    }

    private void cambioContextoAnt() {
        //cambiamos de contexto
        if (ts.getAnterior() != null)
            ts = ts.getAnterior();

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


