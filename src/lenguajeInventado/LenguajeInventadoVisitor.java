// Generated from D:/Universidad/Compiladores/PL3/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeInventadoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeInventadoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LenguajeInventadoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(LenguajeInventadoParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(LenguajeInventadoParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeInventadoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#actualizar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizar(LenguajeInventadoParser.ActualizarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LenguajeInventadoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LenguajeInventadoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LenguajeInventadoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LenguajeInventadoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LenguajeInventadoParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(LenguajeInventadoParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link LenguajeInventadoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LenguajeInventadoParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LenguajeInventadoParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#textos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextos(LenguajeInventadoParser.TextosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#condicionif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionif(LenguajeInventadoParser.CondicionifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorigualif(LenguajeInventadoParser.MayorigualifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorigualif(LenguajeInventadoParser.MenorigualifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Igualigualif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualigualif(LenguajeInventadoParser.IgualigualifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorif(LenguajeInventadoParser.MenorifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorif}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorif(LenguajeInventadoParser.MayorifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorigualfor(LenguajeInventadoParser.MayorigualforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorigualfor(LenguajeInventadoParser.MenorigualforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Igualigualfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualigualfor(LenguajeInventadoParser.IgualigualforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorfor(LenguajeInventadoParser.MenorforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorfor}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorfor(LenguajeInventadoParser.MayorforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorigualwhile(LenguajeInventadoParser.MayorigualwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorigualwhile(LenguajeInventadoParser.MenorigualwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Igualigualwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualigualwhile(LenguajeInventadoParser.IgualigualwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorwhile(LenguajeInventadoParser.MenorwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorwhile}
	 * labeled alternative in {@link LenguajeInventadoParser#operadorcondicionalwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorwhile(LenguajeInventadoParser.MayorwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#condicionfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionfor(LenguajeInventadoParser.CondicionforContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#condicionwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionwhile(LenguajeInventadoParser.CondicionwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(LenguajeInventadoParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(LenguajeInventadoParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumMostrar(LenguajeInventadoParser.NumMostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMostrar(LenguajeInventadoParser.StringMostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatMostrar(LenguajeInventadoParser.FloatMostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarMostrar}
	 * labeled alternative in {@link LenguajeInventadoParser#valorAmostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMostrar(LenguajeInventadoParser.VarMostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LenguajeInventadoParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LenguajeInventadoParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LenguajeInventadoParser.WhileContext ctx);
}