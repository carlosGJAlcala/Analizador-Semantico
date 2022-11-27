// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/PL3Compiladores/AnalizadorSemantico/src/csv\g.g4 by ANTLR 4.10.1
package csv;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, LISTDEFINITION=3, SEPARADOR=4, TEXTO=5;
	public static final int
		RULE_csvFile = 0, RULE_hdr = 1, RULE_definition = 2, RULE_row = 3, RULE_fieldCabecera = 4, 
		RULE_field = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"csvFile", "hdr", "definition", "row", "fieldCabecera", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "')'", null, "'List-Definition('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "LISTDEFINITION", "SEPARADOR", "TEXTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CsvFileContext extends ParserRuleContext {
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public CsvFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCsvFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCsvFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCsvFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvFileContext csvFile() throws RecognitionException {
		CsvFileContext _localctx = new CsvFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csvFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTDEFINITION) {
				{
				setState(12);
				definition();
				}
			}

			setState(15);
			hdr();
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				row();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO );
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrContext extends ParserRuleContext {
		public List<FieldCabeceraContext> fieldCabecera() {
			return getRuleContexts(FieldCabeceraContext.class);
		}
		public FieldCabeceraContext fieldCabecera(int i) {
			return getRuleContext(FieldCabeceraContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(gParser.NEWLINE, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(gParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(gParser.SEPARADOR, i);
		}
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHdr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			fieldCabecera();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(24);
				match(SEPARADOR);
				setState(25);
				fieldCabecera();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode LISTDEFINITION() { return getToken(gParser.LISTDEFINITION, 0); }
		public TerminalNode SEPARADOR() { return getToken(gParser.SEPARADOR, 0); }
		public TerminalNode NEWLINE() { return getToken(gParser.NEWLINE, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LISTDEFINITION);
			setState(34);
			match(SEPARADOR);
			setState(35);
			match(T__0);
			setState(36);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(gParser.NEWLINE, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(gParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(gParser.SEPARADOR, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			field();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(39);
				match(SEPARADOR);
				setState(40);
				field();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldCabeceraContext extends ParserRuleContext {
		public Token texto;
		public TerminalNode TEXTO() { return getToken(gParser.TEXTO, 0); }
		public FieldCabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldCabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFieldCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFieldCabecera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFieldCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldCabeceraContext fieldCabecera() throws RecognitionException {
		FieldCabeceraContext _localctx = new FieldCabeceraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldCabecera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((FieldCabeceraContext)_localctx).texto = match(TEXTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public Token texto;
		public TerminalNode TEXTO() { return getToken(gParser.TEXTO, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((FieldContext)_localctx).texto = match(TEXTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00055\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001"+
		"\n\u0001\f\u0001\u001e\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003*\b\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000"+
		"\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00002\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u0006&\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0004\u0002\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0011\u0003\u0002\u0001\u0000\u0010\u0012\u0003\u0006\u0003\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001"+
		"\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u001c\u0003\b\u0004\u0000\u0018"+
		"\u0019\u0005\u0004\u0000\u0000\u0019\u001b\u0003\b\u0004\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f"+
		"\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005"+
		"\u0002\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000"+
		"\u0000\"#\u0005\u0004\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u0002"+
		"\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&+\u0003\n\u0005\u0000\'(\u0005"+
		"\u0004\u0000\u0000(*\u0003\n\u0005\u0000)\'\u0001\u0000\u0000\u0000*-"+
		"\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0002"+
		"\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u0000"+
		"1\t\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u00003\u000b\u0001\u0000"+
		"\u0000\u0000\u0004\r\u0013\u001c+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}