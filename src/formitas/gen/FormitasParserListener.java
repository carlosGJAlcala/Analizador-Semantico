// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/formitas\FormitasParser.g4 by ANTLR 4.10.1
package formitas.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormitasParser}.
 */
public interface FormitasParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormitasParser#formitasFile}.
	 * @param ctx the parse tree
	 */
	void enterFormitasFile(FormitasParser.FormitasFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormitasParser#formitasFile}.
	 * @param ctx the parse tree
	 */
	void exitFormitasFile(FormitasParser.FormitasFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormitasParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(FormitasParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormitasParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(FormitasParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormitasParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(FormitasParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormitasParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(FormitasParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormitasParser#saltoLinea}.
	 * @param ctx the parse tree
	 */
	void enterSaltoLinea(FormitasParser.SaltoLineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormitasParser#saltoLinea}.
	 * @param ctx the parse tree
	 */
	void exitSaltoLinea(FormitasParser.SaltoLineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormitasParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(FormitasParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormitasParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(FormitasParser.CampoContext ctx);
}