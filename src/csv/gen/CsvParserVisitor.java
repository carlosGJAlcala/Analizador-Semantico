// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/csv\CsvParser.g4 by ANTLR 4.10.1
package csv.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvParser#csvFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvFile(CsvParser.CsvFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(CsvParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CsvParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#fieldCabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldCabecera(CsvParser.FieldCabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CsvParser.FieldContext ctx);
}