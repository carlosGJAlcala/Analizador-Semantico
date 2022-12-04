// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/formitas\formitas.g4 by ANTLR 4.10.1
package formitas;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class formitasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ESPACIO=6, NEWLINE=7, COLOR=8, 
		FIGURA=9, APERTURA=10, CERRADURA=11, TXTDIM=12, TXTSHPDIM=13, SEPARADOR=14, 
		NUMERO=15;
	public static final int
		RULE_formitasFile = 0, RULE_fila = 1, RULE_row = 2, RULE_saltoLinea = 3, 
		RULE_campo = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"formitasFile", "fila", "row", "saltoLinea", "campo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'(color:'", "')'", "'(size:'", "'px)'", null, null, null, 
			null, "'>>>'", "'<<<'", "'imgdim:'", "'shpdim:'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ESPACIO", "NEWLINE", "COLOR", "FIGURA", 
			"APERTURA", "CERRADURA", "TXTDIM", "TXTSHPDIM", "SEPARADOR", "NUMERO"
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
	public String getGrammarFileName() { return "formitas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public formitasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FormitasFileContext extends ParserRuleContext {
		public FilaContext fila() {
			return getRuleContext(FilaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(formitasParser.EOF, 0); }
		public FormitasFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formitasFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).enterFormitasFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).exitFormitasFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof formitasVisitor ) return ((formitasVisitor<? extends T>)visitor).visitFormitasFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormitasFileContext formitasFile() throws RecognitionException {
		FormitasFileContext _localctx = new FormitasFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formitasFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			fila();
			setState(11);
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

	public static class FilaContext extends ParserRuleContext {
		public Token imgdim;
		public Token shpdim;
		public TerminalNode TXTDIM() { return getToken(formitasParser.TXTDIM, 0); }
		public TerminalNode SEPARADOR() { return getToken(formitasParser.SEPARADOR, 0); }
		public TerminalNode TXTSHPDIM() { return getToken(formitasParser.TXTSHPDIM, 0); }
		public TerminalNode APERTURA() { return getToken(formitasParser.APERTURA, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TerminalNode CERRADURA() { return getToken(formitasParser.CERRADURA, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(formitasParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(formitasParser.NUMERO, i);
		}
		public List<SaltoLineaContext> saltoLinea() {
			return getRuleContexts(SaltoLineaContext.class);
		}
		public SaltoLineaContext saltoLinea(int i) {
			return getRuleContext(SaltoLineaContext.class,i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof formitasVisitor ) return ((formitasVisitor<? extends T>)visitor).visitFila(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fila);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(TXTDIM);
			setState(14);
			((FilaContext)_localctx).imgdim = match(NUMERO);
			setState(15);
			match(SEPARADOR);
			setState(16);
			match(TXTSHPDIM);
			setState(17);
			((FilaContext)_localctx).shpdim = match(NUMERO);
			setState(18);
			match(APERTURA);
			setState(19);
			row();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				saltoLinea();
				setState(21);
				row();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(CERRADURA);
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
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(formitasParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(formitasParser.SEPARADOR, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof formitasVisitor ) return ((formitasVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			campo();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(31);
				match(SEPARADOR);
				setState(32);
				campo();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SaltoLineaContext extends ParserRuleContext {
		public SaltoLineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltoLinea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).enterSaltoLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).exitSaltoLinea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof formitasVisitor ) return ((formitasVisitor<? extends T>)visitor).visitSaltoLinea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaltoLineaContext saltoLinea() throws RecognitionException {
		SaltoLineaContext _localctx = new SaltoLineaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_saltoLinea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
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

	public static class CampoContext extends ParserRuleContext {
		public Token figura;
		public Token color;
		public Token size;
		public TerminalNode FIGURA() { return getToken(formitasParser.FIGURA, 0); }
		public TerminalNode COLOR() { return getToken(formitasParser.COLOR, 0); }
		public TerminalNode NUMERO() { return getToken(formitasParser.NUMERO, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof formitasListener ) ((formitasListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof formitasVisitor ) return ((formitasVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((CampoContext)_localctx).figura = match(FIGURA);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(41);
				match(T__1);
				setState(42);
				((CampoContext)_localctx).color = match(COLOR);
				setState(43);
				match(T__2);
				}
			}

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(46);
				match(T__3);
				setState(47);
				((CampoContext)_localctx).size = match(NUMERO);
				setState(48);
				match(T__4);
				}
			}

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
		"\u0004\u0001\u000f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002"+
		"\n\u0002\f\u0002%\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u00002\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\r\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006&"+
		"\u0001\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0005\f\u0000\u0000\u000e\u000f\u0005\u000f\u0000\u0000"+
		"\u000f\u0010\u0005\u000e\u0000\u0000\u0010\u0011\u0005\r\u0000\u0000\u0011"+
		"\u0012\u0005\u000f\u0000\u0000\u0012\u0013\u0005\n\u0000\u0000\u0013\u0019"+
		"\u0003\u0004\u0002\u0000\u0014\u0015\u0003\u0006\u0003\u0000\u0015\u0016"+
		"\u0003\u0004\u0002\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0014"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u000b\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e#\u0003"+
		"\b\u0004\u0000\u001f \u0005\u000e\u0000\u0000 \"\u0003\b\u0004\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'\u0007\u0001\u0000"+
		"\u0000\u0000(,\u0005\t\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\b"+
		"\u0000\u0000+-\u0005\u0003\u0000\u0000,)\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-1\u0001\u0000\u0000\u0000./\u0005\u0004\u0000\u0000"+
		"/0\u0005\u000f\u0000\u000002\u0005\u0005\u0000\u00001.\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u00002\t\u0001\u0000\u0000\u0000\u0004\u0019"+
		"#,1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}