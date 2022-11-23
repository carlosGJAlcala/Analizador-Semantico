// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladoresfinal/AnalizadorSintactico/src/recetasAbuela\recetas.g4 by ANTLR 4.10.1
package recetasAbuela;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class recetasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNIDADES=1, CONCLUSION=2, INGREDIENTES=3, UTENSILIOS=4, CUBIERTOS=5, ACCIONES=6, 
		CANTIDAD=7, DETERMINANTES=8, PREPOSICIONES=9, TIEMPO=10, SEPARADOR=11, 
		ESPACIO=12, NEWLINE=13;
	public static final int
		RULE_prog = 0, RULE_fila = 1, RULE_receta = 2, RULE_conclusion = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fila", "receta", "conclusion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Listo para comer'", null, null, null, null, null, null, 
			null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UNIDADES", "CONCLUSION", "INGREDIENTES", "UTENSILIOS", "CUBIERTOS", 
			"ACCIONES", "CANTIDAD", "DETERMINANTES", "PREPOSICIONES", "TIEMPO", "SEPARADOR", 
			"ESPACIO", "NEWLINE"
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
	public String getGrammarFileName() { return "recetas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public recetasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(recetasParser.EOF, 0); }
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof recetasVisitor ) return ((recetasVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				fila();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACCIONES );
			setState(13);
			conclusion();
			setState(14);
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
		public List<RecetaContext> receta() {
			return getRuleContexts(RecetaContext.class);
		}
		public RecetaContext receta(int i) {
			return getRuleContext(RecetaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(recetasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(recetasParser.NEWLINE, i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof recetasVisitor ) return ((recetasVisitor<? extends T>)visitor).visitFila(this);
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
			setState(16);
			receta();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(17);
				match(NEWLINE);
				setState(18);
				receta();
				}
				}
				setState(23);
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

	public static class RecetaContext extends ParserRuleContext {
		public Token ingredientes;
		public Token utensilios;
		public Token cubiertos;
		public TerminalNode ACCIONES() { return getToken(recetasParser.ACCIONES, 0); }
		public List<TerminalNode> PREPOSICIONES() { return getTokens(recetasParser.PREPOSICIONES); }
		public TerminalNode PREPOSICIONES(int i) {
			return getToken(recetasParser.PREPOSICIONES, i);
		}
		public List<TerminalNode> DETERMINANTES() { return getTokens(recetasParser.DETERMINANTES); }
		public TerminalNode DETERMINANTES(int i) {
			return getToken(recetasParser.DETERMINANTES, i);
		}
		public TerminalNode CANTIDAD() { return getToken(recetasParser.CANTIDAD, 0); }
		public TerminalNode UNIDADES() { return getToken(recetasParser.UNIDADES, 0); }
		public TerminalNode INGREDIENTES() { return getToken(recetasParser.INGREDIENTES, 0); }
		public TerminalNode UTENSILIOS() { return getToken(recetasParser.UTENSILIOS, 0); }
		public TerminalNode TIEMPO() { return getToken(recetasParser.TIEMPO, 0); }
		public TerminalNode CUBIERTOS() { return getToken(recetasParser.CUBIERTOS, 0); }
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).enterReceta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).exitReceta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof recetasVisitor ) return ((recetasVisitor<? extends T>)visitor).visitReceta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_receta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ACCIONES);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETERMINANTES) {
				{
				setState(25);
				match(DETERMINANTES);
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CANTIDAD) {
				{
				setState(28);
				match(CANTIDAD);
				setState(29);
				match(UNIDADES);
				setState(30);
				match(PREPOSICIONES);
				}
			}

			{
			setState(33);
			((RecetaContext)_localctx).ingredientes = match(INGREDIENTES);
			}
			setState(34);
			match(PREPOSICIONES);
			setState(35);
			match(DETERMINANTES);
			{
			setState(36);
			((RecetaContext)_localctx).utensilios = match(UTENSILIOS);
			}
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(37);
				match(PREPOSICIONES);
				{
				setState(38);
				((RecetaContext)_localctx).cubiertos = match(CUBIERTOS);
				}
				}
				break;
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREPOSICIONES) {
				{
				setState(41);
				match(PREPOSICIONES);
				setState(42);
				match(TIEMPO);
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

	public static class ConclusionContext extends ParserRuleContext {
		public TerminalNode CONCLUSION() { return getToken(recetasParser.CONCLUSION, 0); }
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof recetasListener ) ((recetasListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof recetasVisitor ) return ((recetasVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CONCLUSION);
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
		"\u0004\u0001\r0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000"+
		"1\u0000\t\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000"+
		"\u0004\u0018\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b"+
		"\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000\u000e"+
		"\u000f\u0005\u0000\u0000\u0001\u000f\u0001\u0001\u0000\u0000\u0000\u0010"+
		"\u0015\u0003\u0004\u0002\u0000\u0011\u0012\u0005\r\u0000\u0000\u0012\u0014"+
		"\u0003\u0004\u0002\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0005\u0006\u0000\u0000\u0019\u001b"+
		"\u0005\b\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u001f\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0007\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e \u0005\t"+
		"\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000\u0000\"#\u0005\t"+
		"\u0000\u0000#$\u0005\b\u0000\u0000$\'\u0005\u0004\u0000\u0000%&\u0005"+
		"\t\u0000\u0000&(\u0005\u0005\u0000\u0000\'%\u0001\u0000\u0000\u0000\'"+
		"(\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)*\u0005\t\u0000\u0000"+
		"*,\u0005\n\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u0005\u0001\u0000\u0000\u0000-.\u0005\u0002\u0000\u0000.\u0007\u0001"+
		"\u0000\u0000\u0000\u0006\u000b\u0015\u001a\u001f\'+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}