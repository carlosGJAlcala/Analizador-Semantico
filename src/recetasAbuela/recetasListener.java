// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladoresfinal/AnalizadorSintactico/src/recetasAbuela\recetas.g4 by ANTLR 4.10.1
package recetasAbuela;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link recetasParser}.
 */
public interface recetasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link recetasParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(recetasParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link recetasParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(recetasParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link recetasParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(recetasParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link recetasParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(recetasParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link recetasParser#receta}.
	 * @param ctx the parse tree
	 */
	void enterReceta(recetasParser.RecetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link recetasParser#receta}.
	 * @param ctx the parse tree
	 */
	void exitReceta(recetasParser.RecetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link recetasParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(recetasParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link recetasParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(recetasParser.ConclusionContext ctx);
}