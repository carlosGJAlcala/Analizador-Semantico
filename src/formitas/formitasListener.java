// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/pl3/src/formitas\formitas.g4 by ANTLR 4.10.1
package formitas;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link formitasParser}.
 */
public interface formitasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link formitasParser#formitasFile}.
	 * @param ctx the parse tree
	 */
	void enterFormitasFile(formitasParser.FormitasFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link formitasParser#formitasFile}.
	 * @param ctx the parse tree
	 */
	void exitFormitasFile(formitasParser.FormitasFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link formitasParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(formitasParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link formitasParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(formitasParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link formitasParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(formitasParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link formitasParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(formitasParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link formitasParser#saltoLinea}.
	 * @param ctx the parse tree
	 */
	void enterSaltoLinea(formitasParser.SaltoLineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link formitasParser#saltoLinea}.
	 * @param ctx the parse tree
	 */
	void exitSaltoLinea(formitasParser.SaltoLineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link formitasParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(formitasParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link formitasParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(formitasParser.CampoContext ctx);
}