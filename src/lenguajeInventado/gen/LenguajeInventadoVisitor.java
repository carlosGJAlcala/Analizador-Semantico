// Generated from Q:/Compiladores/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado.gen;
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
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#exprcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcond(LenguajeInventadoParser.ExprcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LenguajeInventadoParser.CondicionContext ctx);
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
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LenguajeInventadoParser.ForContext ctx);
}