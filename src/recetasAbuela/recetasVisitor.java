// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladoresfinal/AnalizadorSintactico/src/recetasAbuela\recetas.g4 by ANTLR 4.10.1
package recetasAbuela;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link recetasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface recetasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link recetasParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(recetasParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link recetasParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(recetasParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link recetasParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(recetasParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link recetasParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(recetasParser.ConclusionContext ctx);
}