// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeInventadoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIO=1, NEWLINE=2, PARENTESIS=3, IGUAL=4, BOOLTIPO=5, FLOAT=6, NUMERO=7, 
		VARIABLE=8, FINLINEA=9, STRING=10, COMENTARIOABRIR=11, COMENTARIOCERRAR=12, 
		COMENTARIOLINEA=13, COMENTARIOALMOHADILLA=14, SEPARADOR=15, INTRO=16, 
		INDEC=17, OPERADORESCOND=18, FINCONDICION=19, IF=20, ELSE=21, FINCOND=22, 
		VALORES=23, ASIGNAR=24, MOSTRAR=25, TEXTO=26, PLUS=27, MINUS=28, DIVISOR=29, 
		POR=30, OPERADORESBOOL=31, OPERADORESBOOL2=32;
	public static final int
		RULE_prog = 0, RULE_fila = 1, RULE_campo = 2, RULE_asignacion = 3, RULE_aztulizar = 4, 
		RULE_expr = 5, RULE_operacion = 6, RULE_comentario = 7, RULE_textos = 8, 
		RULE_exprcond = 9, RULE_condicion = 10, RULE_mostrar = 11, RULE_for = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fila", "campo", "asignacion", "aztulizar", "expr", "operacion", 
			"comentario", "textos", "exprcond", "condicion", "mostrar", "for"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", null, null, null, null, "';P'", null, 
			"'/*'", "'*/'", "'//'", "'#'", "','", "'\\r\\n'", null, null, null, null, 
			null, "'terminar'", null, "'asignar'", "'mostrar'", null, "'+'", "'-'", 
			"'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESPACIO", "NEWLINE", "PARENTESIS", "IGUAL", "BOOLTIPO", "FLOAT", 
			"NUMERO", "VARIABLE", "FINLINEA", "STRING", "COMENTARIOABRIR", "COMENTARIOCERRAR", 
			"COMENTARIOLINEA", "COMENTARIOALMOHADILLA", "SEPARADOR", "INTRO", "INDEC", 
			"OPERADORESCOND", "FINCONDICION", "IF", "ELSE", "FINCOND", "VALORES", 
			"ASIGNAR", "MOSTRAR", "TEXTO", "PLUS", "MINUS", "DIVISOR", "POR", "OPERADORESBOOL", 
			"OPERADORESBOOL2"
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
	public String getGrammarFileName() { return "LenguajeInventado.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeInventadoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LenguajeInventadoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LenguajeInventadoParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitProg(this);
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
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				fila();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(27);
					match(NEWLINE);
					}
				}

				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS) | (1L << FLOAT) | (1L << NUMERO) | (1L << VARIABLE) | (1L << STRING) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA) | (1L << IF) | (1L << ELSE) | (1L << FINCOND) | (1L << ASIGNAR) | (1L << MOSTRAR))) != 0) );
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
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> FINLINEA() { return getTokens(LenguajeInventadoParser.FINLINEA); }
		public TerminalNode FINLINEA(int i) {
			return getToken(LenguajeInventadoParser.FINLINEA, i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitFila(this);
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
			setState(34);
			campo();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINLINEA) {
				{
				{
				setState(35);
				match(FINLINEA);
				setState(36);
				campo();
				}
				}
				setState(41);
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

	public static class CampoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public ExprcondContext exprcond() {
			return getRuleContext(ExprcondContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_campo);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				asignacion();
				setState(43);
				match(FINLINEA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				comentario();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				exprcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				mostrar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				for_();
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(LenguajeInventadoParser.ASIGNAR, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ASIGNAR);
			setState(52);
			match(VARIABLE);
			setState(53);
			match(IGUAL);
			setState(54);
			expr(0);
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

	public static class AztulizarContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public AztulizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aztulizar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterAztulizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitAztulizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitAztulizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AztulizarContext aztulizar() throws RecognitionException {
		AztulizarContext _localctx = new AztulizarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aztulizar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(VARIABLE);
			setState(57);
			match(IGUAL);
			setState(58);
			expr(0);
			setState(59);
			match(FINLINEA);
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

	public static class ExprContext extends ParserRuleContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public List<TerminalNode> PARENTESIS() { return getTokens(LenguajeInventadoParser.PARENTESIS); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(LenguajeInventadoParser.PARENTESIS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(LenguajeInventadoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LenguajeInventadoParser.VARIABLE, i);
		}
		public TerminalNode OPERADORESBOOL() { return getToken(LenguajeInventadoParser.OPERADORESBOOL, 0); }
		public List<TerminalNode> BOOLTIPO() { return getTokens(LenguajeInventadoParser.BOOLTIPO); }
		public TerminalNode BOOLTIPO(int i) {
			return getToken(LenguajeInventadoParser.BOOLTIPO, i);
		}
		public TerminalNode OPERADORESCOND() { return getToken(LenguajeInventadoParser.OPERADORESCOND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				operacion(0);
				}
				break;
			case 2:
				{
				setState(63);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(64);
				match(PARENTESIS);
				setState(65);
				expr(0);
				setState(66);
				match(PARENTESIS);
				}
				break;
			case 4:
				{
				setState(68);
				match(VARIABLE);
				}
				break;
			case 5:
				{
				setState(69);
				match(VARIABLE);
				setState(70);
				match(OPERADORESBOOL);
				setState(71);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(72);
				match(BOOLTIPO);
				setState(73);
				match(OPERADORESBOOL);
				setState(74);
				match(BOOLTIPO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(77);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					{
					setState(78);
					match(OPERADORESCOND);
					}
					setState(79);
					expr(7);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends OperacionContext {
		public OperacionContext left;
		public Token right;
		public TerminalNode DIVISOR() { return getToken(LenguajeInventadoParser.DIVISOR, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public DivContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends OperacionContext {
		public Token variable;
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public VariableContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends OperacionContext {
		public Token number;
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public NumberContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends OperacionContext {
		public OperacionContext left;
		public Token right;
		public TerminalNode POR() { return getToken(LenguajeInventadoParser.POR, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public MulContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends OperacionContext {
		public OperacionContext lef;
		public Token right;
		public TerminalNode PLUS() { return getToken(LenguajeInventadoParser.PLUS, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public PlusContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends OperacionContext {
		public OperacionContext left;
		public Token right;
		public TerminalNode MINUS() { return getToken(LenguajeInventadoParser.MINUS, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public MinusContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				((NumberContext)_localctx).number = match(NUMERO);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperacionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lef = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						match(PLUS);
						setState(92);
						((PlusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new OperacionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						match(MINUS);
						setState(95);
						((MinusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new OperacionContext(_parentctx, _parentState));
						((MulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						match(POR);
						setState(98);
						((MulContext)_localctx).right = match(NUMERO);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new OperacionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(99);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(100);
						match(DIVISOR);
						setState(101);
						((DivContext)_localctx).right = match(NUMERO);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(LenguajeInventadoParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(LenguajeInventadoParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(LenguajeInventadoParser.COMENTARIOLINEA, 0); }
		public TerminalNode COMENTARIOALMOHADILLA() { return getToken(LenguajeInventadoParser.COMENTARIOALMOHADILLA, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comentario);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(COMENTARIOABRIR);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADORESCOND) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(108);
					textos();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(COMENTARIOLINEA);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADORESCOND) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(116);
					textos();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case COMENTARIOALMOHADILLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(COMENTARIOALMOHADILLA);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADORESCOND) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(123);
					textos();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(LenguajeInventadoParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(LenguajeInventadoParser.TEXTO, i);
		}
		public TerminalNode PLUS() { return getToken(LenguajeInventadoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LenguajeInventadoParser.MINUS, 0); }
		public TerminalNode DIVISOR() { return getToken(LenguajeInventadoParser.DIVISOR, 0); }
		public TerminalNode POR() { return getToken(LenguajeInventadoParser.POR, 0); }
		public TerminalNode OPERADORESCOND() { return getToken(LenguajeInventadoParser.OPERADORESCOND, 0); }
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public TerminalNode OPERADORESBOOL() { return getToken(LenguajeInventadoParser.OPERADORESBOOL, 0); }
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitTextos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitTextos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textos);
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(131);
						match(TEXTO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(MINUS);
				}
				break;
			case DIVISOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(DIVISOR);
				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(POR);
				}
				break;
			case OPERADORESCOND:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(OPERADORESCOND);
				}
				break;
			case FINCONDICION:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(FINCONDICION);
				}
				break;
			case OPERADORESBOOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(OPERADORESBOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprcondContext extends ParserRuleContext {
		public TerminalNode FINCOND() { return getToken(LenguajeInventadoParser.FINCOND, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode IF() { return getToken(LenguajeInventadoParser.IF, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> FINLINEA() { return getTokens(LenguajeInventadoParser.FINLINEA); }
		public TerminalNode FINLINEA(int i) {
			return getToken(LenguajeInventadoParser.FINLINEA, i);
		}
		public List<AztulizarContext> aztulizar() {
			return getRuleContexts(AztulizarContext.class);
		}
		public AztulizarContext aztulizar(int i) {
			return getRuleContext(AztulizarContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LenguajeInventadoParser.ELSE, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterExprcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitExprcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitExprcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprcondContext exprcond() throws RecognitionException {
		ExprcondContext _localctx = new ExprcondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(145);
				condicion();
				}
				break;
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(148);
				match(IF);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE || _la==ASIGNAR) {
				{
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASIGNAR:
					{
					setState(151);
					asignacion();
					setState(152);
					match(FINLINEA);
					}
					break;
				case VARIABLE:
					{
					setState(154);
					aztulizar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(160);
				match(ELSE);
				{
				setState(161);
				match(VARIABLE);
				setState(162);
				match(IGUAL);
				setState(163);
				expr(0);
				setState(164);
				match(FINLINEA);
				}
				}
			}

			setState(168);
			match(FINCOND);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(LenguajeInventadoParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LenguajeInventadoParser.FLOAT, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(LenguajeInventadoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LenguajeInventadoParser.VARIABLE, i);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public TerminalNode OPERADORESCOND() { return getToken(LenguajeInventadoParser.OPERADORESCOND, 0); }
		public TerminalNode OPERADORESBOOL() { return getToken(LenguajeInventadoParser.OPERADORESBOOL, 0); }
		public TerminalNode BOOLTIPO() { return getToken(LenguajeInventadoParser.BOOLTIPO, 0); }
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(170);
				match(VARIABLE);
				setState(171);
				match(OPERADORESCOND);
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(174);
				match(VARIABLE);
				setState(175);
				match(OPERADORESBOOL);
				}
				break;
			}
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(178);
				match(VARIABLE);
				setState(179);
				match(BOOLTIPO);
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(182);
				match(NUMERO);
				}
				break;
			case STRING:
				{
				setState(183);
				match(STRING);
				}
				break;
			case FLOAT:
				{
				setState(184);
				match(FLOAT);
				}
				break;
			case VARIABLE:
				{
				setState(185);
				match(VARIABLE);
				setState(186);
				match(FINLINEA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINCONDICION) {
				{
				setState(189);
				match(FINCONDICION);
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(LenguajeInventadoParser.MOSTRAR, 0); }
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(LenguajeInventadoParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LenguajeInventadoParser.FLOAT, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(MOSTRAR);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(193);
				match(NUMERO);
				}
				break;
			case 2:
				{
				setState(194);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(195);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(196);
				match(VARIABLE);
				setState(197);
				match(FINLINEA);
				}
				break;
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

	public static class ForContext extends ParserRuleContext {
		public List<TerminalNode> PARENTESIS() { return getTokens(LenguajeInventadoParser.PARENTESIS); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(LenguajeInventadoParser.PARENTESIS, i);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(LenguajeInventadoParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(LenguajeInventadoParser.SEPARADOR, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode INDEC() { return getToken(LenguajeInventadoParser.INDEC, 0); }
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public ExprcondContext exprcond() {
			return getRuleContext(ExprcondContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PARENTESIS);
			setState(201);
			asignacion();
			setState(202);
			match(SEPARADOR);
			setState(203);
			condicion();
			setState(204);
			match(SEPARADOR);
			setState(205);
			match(VARIABLE);
			setState(206);
			match(INDEC);
			setState(207);
			match(PARENTESIS);
			setState(208);
			match(FINCONDICION);
			setState(209);
			exprcond();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0004\u0000"+
		"\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005Q\b\u0005\n\u0005\f\u0005T\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006g\b\u0006\n\u0006\f\u0006"+
		"j\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007n\b\u0007\n\u0007\f\u0007"+
		"q\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007v\b\u0007\n\u0007"+
		"\f\u0007y\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007"+
		"\f\u0007\u0080\t\u0007\u0003\u0007\u0082\b\u0007\u0001\b\u0004\b\u0085"+
		"\b\b\u000b\b\f\b\u0086\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0090\b\b\u0001\t\u0003\t\u0093\b\t\u0001\t\u0003\t\u0096"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009c\b\t\n\t\f\t\u009f\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a7\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\n\u00ad\b\n\u0001\n\u0001\n\u0003\n\u00b1"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00b5\b\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00bc\b\n\u0001\n\u0003\n\u00bf\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c7"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0002\n\f\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u00f5\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u00041"+
		"\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b8\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e"+
		"\u0081\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012"+
		"\u0092\u0001\u0000\u0000\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016"+
		"\u00c0\u0001\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001d\u0005\u0002\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"\'\u0003\u0004\u0002\u0000"+
		"#$\u0005\t\u0000\u0000$&\u0003\u0004\u0002\u0000%#\u0001\u0000\u0000\u0000"+
		"&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(\u0003\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0006\u0003\u0000+,\u0005\t\u0000\u0000,2\u0001\u0000\u0000\u0000-2\u0003"+
		"\u000e\u0007\u0000.2\u0003\u0012\t\u0000/2\u0003\u0016\u000b\u000002\u0003"+
		"\u0018\f\u00001*\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"2\u0005\u0001\u0000\u0000\u000034\u0005\u0018\u0000\u000045\u0005\b\u0000"+
		"\u000056\u0005\u0004\u0000\u000067\u0003\n\u0005\u00007\u0007\u0001\u0000"+
		"\u0000\u000089\u0005\b\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0003\n"+
		"\u0005\u0000;<\u0005\t\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0006"+
		"\u0005\uffff\uffff\u0000>L\u0003\f\u0006\u0000?L\u0005\u0007\u0000\u0000"+
		"@A\u0005\u0003\u0000\u0000AB\u0003\n\u0005\u0000BC\u0005\u0003\u0000\u0000"+
		"CL\u0001\u0000\u0000\u0000DL\u0005\b\u0000\u0000EF\u0005\b\u0000\u0000"+
		"FG\u0005\u001f\u0000\u0000GL\u0005\b\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0005\u001f\u0000\u0000JL\u0005\u0005\u0000\u0000K=\u0001\u0000\u0000"+
		"\u0000K?\u0001\u0000\u0000\u0000K@\u0001\u0000\u0000\u0000KD\u0001\u0000"+
		"\u0000\u0000KE\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000LR\u0001"+
		"\u0000\u0000\u0000MN\n\u0006\u0000\u0000NO\u0005\u0012\u0000\u0000OQ\u0003"+
		"\n\u0005\u0007PM\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UV\u0006\u0006\uffff\uffff\u0000VY\u0005"+
		"\u0007\u0000\u0000WY\u0005\b\u0000\u0000XU\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Yh\u0001\u0000\u0000\u0000Z[\n\u0006\u0000\u0000[\\"+
		"\u0005\u001b\u0000\u0000\\g\u0005\u0007\u0000\u0000]^\n\u0005\u0000\u0000"+
		"^_\u0005\u001c\u0000\u0000_g\u0005\u0007\u0000\u0000`a\n\u0004\u0000\u0000"+
		"ab\u0005\u001e\u0000\u0000bg\u0005\u0007\u0000\u0000cd\n\u0003\u0000\u0000"+
		"de\u0005\u001d\u0000\u0000eg\u0005\u0007\u0000\u0000fZ\u0001\u0000\u0000"+
		"\u0000f]\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ko\u0005\u000b\u0000\u0000ln\u0003\u0010\b\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r\u0082\u0005"+
		"\f\u0000\u0000sw\u0005\r\u0000\u0000tv\u0003\u0010\b\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u0082\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z~\u0005\u000e\u0000\u0000{}\u0003\u0010\b\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081k\u0001\u0000\u0000\u0000\u0081s\u0001\u0000\u0000"+
		"\u0000\u0081z\u0001\u0000\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0005\u001a\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0090\u0001\u0000\u0000\u0000"+
		"\u0088\u0090\u0005\u001b\u0000\u0000\u0089\u0090\u0005\u001c\u0000\u0000"+
		"\u008a\u0090\u0005\u001d\u0000\u0000\u008b\u0090\u0005\u001e\u0000\u0000"+
		"\u008c\u0090\u0005\u0012\u0000\u0000\u008d\u0090\u0005\u0013\u0000\u0000"+
		"\u008e\u0090\u0005\u001f\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000"+
		"\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000"+
		"\u008f\u008a\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000"+
		"\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0003\u0014\n\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0005\u0014\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u009d\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0003\u0006\u0003\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0003\b\u0004\u0000\u009b\u0097\u0001"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a6\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\u0015\u0000\u0000\u00a1\u00a2\u0005"+
		"\b\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0003\n"+
		"\u0005\u0000\u00a4\u00a5\u0005\t\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0016\u0000"+
		"\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000"+
		"\u00ab\u00ad\u0005\u0012\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\b\u0000\u0000\u00af\u00b1\u0005\u001f\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b5"+
		"\u0005\u0005\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00bb\u0001\u0000\u0000\u0000\u00b6\u00bc"+
		"\u0005\u0007\u0000\u0000\u00b7\u00bc\u0005\n\u0000\u0000\u00b8\u00bc\u0005"+
		"\u0006\u0000\u0000\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00bc\u0005\t"+
		"\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bf\u0005\u0013"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0\u00c6\u0005\u0019"+
		"\u0000\u0000\u00c1\u00c7\u0005\u0007\u0000\u0000\u00c2\u00c7\u0005\n\u0000"+
		"\u0000\u00c3\u00c7\u0005\u0006\u0000\u0000\u00c4\u00c5\u0005\b\u0000\u0000"+
		"\u00c5\u00c7\u0005\t\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u0017\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9"+
		"\u00ca\u0003\u0006\u0003\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb"+
		"\u00cc\u0003\u0014\n\u0000\u00cc\u00cd\u0005\u000f\u0000\u0000\u00cd\u00ce"+
		"\u0005\b\u0000\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0003\u0000\u0000\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0003"+
		"\u0012\t\u0000\u00d2\u0019\u0001\u0000\u0000\u0000\u001a\u001c \'1KRX"+
		"fhow~\u0081\u0086\u008f\u0092\u0095\u009b\u009d\u00a6\u00ac\u00b0\u00b4"+
		"\u00bb\u00be\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}