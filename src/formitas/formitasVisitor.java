// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladoresfinal/AnalizadorSintactico/src/formitas\formitas.g4 by ANTLR 4.10.1
package formitas;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link formitasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface formitasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link formitasParser#formitasFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormitasFile(formitasParser.FormitasFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link formitasParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(formitasParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link formitasParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(formitasParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link formitasParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(formitasParser.CampoContext ctx);
}