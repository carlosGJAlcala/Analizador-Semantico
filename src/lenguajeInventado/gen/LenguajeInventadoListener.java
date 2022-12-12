// Generated from D:/Universidad/Compiladores/PL3/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeInventadoParser}.
 */
public interface LenguajeInventadoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LenguajeInventadoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LenguajeInventadoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(LenguajeInventadoParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(LenguajeInventadoParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(LenguajeInventadoParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(LenguajeInventadoParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LenguajeInventadoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LenguajeInventadoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void enterActualizar(LenguajeInventadoParser.ActualizarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void exitActualizar(LenguajeInventadoParser.ActualizarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LenguajeInventadoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LenguajeInventadoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LenguajeInventadoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LenguajeInventadoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LenguajeInventadoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LenguajeInventadoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LenguajeInventadoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LenguajeInventadoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterMul(LenguajeInventadoParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitMul(LenguajeInventadoParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterPlus(LenguajeInventadoParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitPlus(LenguajeInventadoParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LenguajeInventadoParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LenguajeInventadoParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LenguajeInventadoParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LenguajeInventadoParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(LenguajeInventadoParser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(LenguajeInventadoParser.TextosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#condicionif}.
	 * @param ctx the parse tree
	 */
	void enterCondicionif(LenguajeInventadoParser.CondicionifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#condicionif}.
	 * @param ctx the parse tree
	 */
	void exitCondicionif(LenguajeInventadoParser.CondicionifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void enterMayorigualif(LenguajeInventadoParser.MayorigualifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void exitMayorigualif(LenguajeInventadoParser.MayorigualifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void enterMenorigualif(LenguajeInventadoParser.MenorigualifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void exitMenorigualif(LenguajeInventadoParser.MenorigualifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igualigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void enterIgualigualif(LenguajeInventadoParser.IgualigualifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void exitIgualigualif(LenguajeInventadoParser.IgualigualifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void enterMenorif(LenguajeInventadoParser.MenorifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void exitMenorif(LenguajeInventadoParser.MenorifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void enterMayorif(LenguajeInventadoParser.MayorifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 */
	void exitMayorif(LenguajeInventadoParser.MayorifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void enterMayorigualfor(LenguajeInventadoParser.MayorigualforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void exitMayorigualfor(LenguajeInventadoParser.MayorigualforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void enterMenorigualfor(LenguajeInventadoParser.MenorigualforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void exitMenorigualfor(LenguajeInventadoParser.MenorigualforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igualigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void enterIgualigualfor(LenguajeInventadoParser.IgualigualforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void exitIgualigualfor(LenguajeInventadoParser.IgualigualforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void enterMenorfor(LenguajeInventadoParser.MenorforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void exitMenorfor(LenguajeInventadoParser.MenorforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void enterMayorfor(LenguajeInventadoParser.MayorforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 */
	void exitMayorfor(LenguajeInventadoParser.MayorforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void enterMayorigualwhile(LenguajeInventadoParser.MayorigualwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void exitMayorigualwhile(LenguajeInventadoParser.MayorigualwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void enterMenorigualwhile(LenguajeInventadoParser.MenorigualwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void exitMenorigualwhile(LenguajeInventadoParser.MenorigualwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igualigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void enterIgualigualwhile(LenguajeInventadoParser.IgualigualwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void exitIgualigualwhile(LenguajeInventadoParser.IgualigualwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void enterMenorwhile(LenguajeInventadoParser.MenorwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void exitMenorwhile(LenguajeInventadoParser.MenorwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mayorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void enterMayorwhile(LenguajeInventadoParser.MayorwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 */
	void exitMayorwhile(LenguajeInventadoParser.MayorwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#condicionfor}.
	 * @param ctx the parse tree
	 */
	void enterCondicionfor(LenguajeInventadoParser.CondicionforContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#condicionfor}.
	 * @param ctx the parse tree
	 */
	void exitCondicionfor(LenguajeInventadoParser.CondicionforContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#condicionwhile}.
	 * @param ctx the parse tree
	 */
	void enterCondicionwhile(LenguajeInventadoParser.CondicionwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#condicionwhile}.
	 * @param ctx the parse tree
	 */
	void exitCondicionwhile(LenguajeInventadoParser.CondicionwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(LenguajeInventadoParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(LenguajeInventadoParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(LenguajeInventadoParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(LenguajeInventadoParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void enterNumMostrar(LenguajeInventadoParser.NumMostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void exitNumMostrar(LenguajeInventadoParser.NumMostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void enterStringMostrar(LenguajeInventadoParser.StringMostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void exitStringMostrar(LenguajeInventadoParser.StringMostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void enterFloatMostrar(LenguajeInventadoParser.FloatMostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void exitFloatMostrar(LenguajeInventadoParser.FloatMostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void enterVarMostrar(LenguajeInventadoParser.VarMostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 */
	void exitVarMostrar(LenguajeInventadoParser.VarMostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(LenguajeInventadoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(LenguajeInventadoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LenguajeInventadoParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LenguajeInventadoParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LenguajeInventadoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LenguajeInventadoParser.WhileContext ctx);
}