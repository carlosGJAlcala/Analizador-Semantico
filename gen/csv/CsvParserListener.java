// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/csv\CsvParser.g4 by ANTLR 4.10.1
package csv;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void enterCsvFile(CsvParser.CsvFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void exitCsvFile(CsvParser.CsvFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(CsvParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(CsvParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#fieldCabecera}.
	 * @param ctx the parse tree
	 */
	void enterFieldCabecera(CsvParser.FieldCabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#fieldCabecera}.
	 * @param ctx the parse tree
	 */
	void exitFieldCabecera(CsvParser.FieldCabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CsvParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CsvParser.FieldContext ctx);
}