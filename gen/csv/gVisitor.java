// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/csv\g.g4 by ANTLR 4.10.1
package csv;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#csvFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvFile(gParser.CsvFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(gParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(gParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldCabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldCabecera(gParser.FieldCabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(gParser.FieldContext ctx);
}