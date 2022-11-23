// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladores/AnalizadorSintactico/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LenguajeInventadoParser.ExprContext ctx);
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
	 * Visit a parse tree produced by {@link LenguajeInventadoParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LenguajeInventadoParser.ForContext ctx);
}