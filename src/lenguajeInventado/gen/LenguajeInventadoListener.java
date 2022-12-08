// Generated from Q:/Compiladores/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void enterExprcond(LenguajeInventadoParser.ExprcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void exitExprcond(LenguajeInventadoParser.ExprcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(LenguajeInventadoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(LenguajeInventadoParser.CondicionContext ctx);
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
	 * Enter a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LenguajeInventadoParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LenguajeInventadoParser.ForContext ctx);
}