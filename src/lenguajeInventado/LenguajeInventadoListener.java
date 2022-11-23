// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladores/AnalizadorSintactico/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado;
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