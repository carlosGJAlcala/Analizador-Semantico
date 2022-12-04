// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/formitas\FormitasParser.g4 by ANTLR 4.10.1
package formitas.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormitasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormitasParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FormitasParser#formitasFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormitasFile(FormitasParser.FormitasFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormitasParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(FormitasParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormitasParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(FormitasParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormitasParser#saltoLinea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaltoLinea(FormitasParser.SaltoLineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormitasParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(FormitasParser.CampoContext ctx);
}