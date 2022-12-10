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
		INDEC=17, MAYOR=18, MENOR=19, MAYORIGUAL=20, MENORIGUAL=21, IGUALIGUAL=22, 
		FINCONDICION=23, IF=24, ELSE=25, FINCOND=26, VALORES=27, ASIGNAR=28, MOSTRAR=29, 
		TEXTO=30, PLUS=31, MINUS=32, DIVISOR=33, POR=34, OPERADORESBOOL=35, OPERADORESBOOL2=36;
	public static final int
		RULE_prog = 0, RULE_fila = 1, RULE_campo = 2, RULE_asignacion = 3, RULE_actualizar = 4, 
		RULE_expr = 5, RULE_operacion = 6, RULE_comentario = 7, RULE_textos = 8, 
		RULE_condicionif = 9, RULE_operadorcondicional = 10, RULE_condicionfor = 11, 
		RULE_branch = 12, RULE_mostrar = 13, RULE_valorAmostrar = 14, RULE_if = 15, 
		RULE_for = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fila", "campo", "asignacion", "actualizar", "expr", "operacion", 
			"comentario", "textos", "condicionif", "operadorcondicional", "condicionfor", 
			"branch", "mostrar", "valorAmostrar", "if", "for"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", null, null, null, null, "';P'", null, 
			"'/*'", "'*/'", "'//'", "'#'", "','", "'\\r\\n'", null, "'>'", "'<'", 
			"'>='", "'<='", "'=='", null, null, null, "'terminar'", null, "'asignar'", 
			"'mostrar'", null, "'+'", "'-'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESPACIO", "NEWLINE", "PARENTESIS", "IGUAL", "BOOLTIPO", "FLOAT", 
			"NUMERO", "VARIABLE", "FINLINEA", "STRING", "COMENTARIOABRIR", "COMENTARIOCERRAR", 
			"COMENTARIOLINEA", "COMENTARIOALMOHADILLA", "SEPARADOR", "INTRO", "INDEC", 
			"MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "IGUALIGUAL", "FINCONDICION", 
			"IF", "ELSE", "FINCOND", "VALORES", "ASIGNAR", "MOSTRAR", "TEXTO", "PLUS", 
			"MINUS", "DIVISOR", "POR", "OPERADORESBOOL", "OPERADORESBOOL2"
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
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				fila();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(35);
					match(NEWLINE);
					}
				}

				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS) | (1L << NUMERO) | (1L << VARIABLE) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA) | (1L << ASIGNAR) | (1L << MOSTRAR))) != 0) );
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
			setState(42);
			campo();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINLINEA) {
				{
				{
				setState(43);
				match(FINLINEA);
				setState(44);
				campo();
				}
				}
				setState(49);
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
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				comentario();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				mostrar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				actualizar();
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
		public Token nombrevariable;
		public TerminalNode ASIGNAR() { return getToken(LenguajeInventadoParser.ASIGNAR, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
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
			setState(58);
			match(ASIGNAR);
			setState(59);
			((AsignacionContext)_localctx).nombrevariable = match(VARIABLE);
			setState(60);
			match(IGUAL);
			setState(61);
			expr(0);
			setState(62);
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

	public static class ActualizarContext extends ParserRuleContext {
		public Token nombrevariable;
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public ActualizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterActualizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitActualizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitActualizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizarContext actualizar() throws RecognitionException {
		ActualizarContext _localctx = new ActualizarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actualizar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((ActualizarContext)_localctx).nombrevariable = match(VARIABLE);
			setState(65);
			match(IGUAL);
			setState(66);
			expr(0);
			setState(67);
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
		public OperadorcondicionalContext operadorcondicional() {
			return getRuleContext(OperadorcondicionalContext.class,0);
		}
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(70);
				operacion(0);
				}
				break;
			case 2:
				{
				setState(71);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(72);
				match(PARENTESIS);
				setState(73);
				expr(0);
				setState(74);
				match(PARENTESIS);
				}
				break;
			case 4:
				{
				setState(76);
				match(VARIABLE);
				}
				break;
			case 5:
				{
				setState(77);
				match(VARIABLE);
				setState(78);
				match(OPERADORESBOOL);
				setState(79);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(80);
				match(BOOLTIPO);
				setState(81);
				match(OPERADORESBOOL);
				setState(82);
				match(BOOLTIPO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
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
					setState(85);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					{
					setState(86);
					operadorcondicional();
					}
					setState(87);
					expr(7);
					}
					} 
				}
				setState(93);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95);
				((NumberContext)_localctx).number = match(NUMERO);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperacionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lef = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(99);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(100);
						match(PLUS);
						setState(101);
						((PlusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new OperacionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						match(MINUS);
						setState(104);
						((MinusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new OperacionContext(_parentctx, _parentState));
						((MulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						match(POR);
						setState(107);
						((MulContext)_localctx).right = match(NUMERO);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new OperacionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						match(DIVISOR);
						setState(110);
						((DivContext)_localctx).right = match(NUMERO);
						}
						break;
					}
					} 
				}
				setState(115);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(COMENTARIOABRIR);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(117);
					textos();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(COMENTARIOLINEA);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(125);
					textos();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case COMENTARIOALMOHADILLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(COMENTARIOALMOHADILLA);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(132);
					textos();
					}
					}
					setState(137);
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
		public OperadorcondicionalContext operadorcondicional() {
			return getRuleContext(OperadorcondicionalContext.class,0);
		}
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						match(TEXTO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(MINUS);
				}
				break;
			case DIVISOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(DIVISOR);
				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(POR);
				}
				break;
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUALIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				operadorcondicional();
				}
				break;
			case FINCONDICION:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(FINCONDICION);
				}
				break;
			case OPERADORESBOOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
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

	public static class CondicionifContext extends ParserRuleContext {
		public Token varIzquierda;
		public OperadorcondicionalContext operadorcond;
		public Token varDerecha;
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public OperadorcondicionalContext operadorcondicional() {
			return getRuleContext(OperadorcondicionalContext.class,0);
		}
		public CondicionifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCondicionif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCondicionif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCondicionif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionifContext condicionif() throws RecognitionException {
		CondicionifContext _localctx = new CondicionifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicionif);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((CondicionifContext)_localctx).varIzquierda = match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((CondicionifContext)_localctx).varIzquierda = match(VARIABLE);
				setState(156);
				((CondicionifContext)_localctx).operadorcond = operadorcondicional();
				setState(157);
				((CondicionifContext)_localctx).varDerecha = match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((CondicionifContext)_localctx).varIzquierda = match(VARIABLE);
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

	public static class OperadorcondicionalContext extends ParserRuleContext {
		public OperadorcondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorcondicional; }
	 
		public OperadorcondicionalContext() { }
		public void copyFrom(OperadorcondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MayorContext extends OperadorcondicionalContext {
		public TerminalNode MAYORIGUAL() { return getToken(LenguajeInventadoParser.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(LenguajeInventadoParser.MAYOR, 0); }
		public MayorContext(OperadorcondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualigualContext extends OperadorcondicionalContext {
		public TerminalNode IGUALIGUAL() { return getToken(LenguajeInventadoParser.IGUALIGUAL, 0); }
		public IgualigualContext(OperadorcondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterIgualigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitIgualigual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitIgualigual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorContext extends OperadorcondicionalContext {
		public TerminalNode MENORIGUAL() { return getToken(LenguajeInventadoParser.MENORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(LenguajeInventadoParser.MENOR, 0); }
		public MenorContext(OperadorcondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorcondicionalContext operadorcondicional() throws RecognitionException {
		OperadorcondicionalContext _localctx = new OperadorcondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operadorcondicional);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYORIGUAL:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(MAYORIGUAL);
				}
				break;
			case MENORIGUAL:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(MENORIGUAL);
				}
				break;
			case IGUALIGUAL:
				_localctx = new IgualigualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(IGUALIGUAL);
				}
				break;
			case MENOR:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(MENOR);
				}
				break;
			case MAYOR:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(MAYOR);
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

	public static class CondicionforContext extends ParserRuleContext {
		public Token nombrevariable;
		public Token valornum;
		public Token valorlim;
		public List<TerminalNode> PARENTESIS() { return getTokens(LenguajeInventadoParser.PARENTESIS); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(LenguajeInventadoParser.PARENTESIS, i);
		}
		public TerminalNode ASIGNAR() { return getToken(LenguajeInventadoParser.ASIGNAR, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeInventadoParser.IGUAL, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(LenguajeInventadoParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(LenguajeInventadoParser.SEPARADOR, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(LenguajeInventadoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LenguajeInventadoParser.VARIABLE, i);
		}
		public OperadorcondicionalContext operadorcondicional() {
			return getRuleContext(OperadorcondicionalContext.class,0);
		}
		public TerminalNode INDEC() { return getToken(LenguajeInventadoParser.INDEC, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LenguajeInventadoParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LenguajeInventadoParser.NUMERO, i);
		}
		public CondicionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCondicionfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCondicionfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCondicionfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionforContext condicionfor() throws RecognitionException {
		CondicionforContext _localctx = new CondicionforContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicionfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PARENTESIS);
			setState(170);
			match(ASIGNAR);
			setState(171);
			((CondicionforContext)_localctx).nombrevariable = match(VARIABLE);
			setState(172);
			match(IGUAL);
			setState(173);
			((CondicionforContext)_localctx).valornum = match(NUMERO);
			setState(174);
			match(SEPARADOR);
			setState(175);
			match(VARIABLE);
			setState(176);
			operadorcondicional();
			setState(177);
			((CondicionforContext)_localctx).valorlim = match(NUMERO);
			setState(178);
			match(SEPARADOR);
			setState(179);
			match(VARIABLE);
			setState(180);
			match(INDEC);
			setState(181);
			match(PARENTESIS);
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

	public static class BranchContext extends ParserRuleContext {
		public Token positivo;
		public Token negativo;
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public TerminalNode IF() { return getToken(LenguajeInventadoParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(LenguajeInventadoParser.ELSE, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_branch);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((BranchContext)_localctx).positivo = match(IF);
				setState(184);
				actualizar();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((BranchContext)_localctx).negativo = match(ELSE);
				setState(186);
				actualizar();
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(LenguajeInventadoParser.MOSTRAR, 0); }
		public ValorAmostrarContext valorAmostrar() {
			return getRuleContext(ValorAmostrarContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MOSTRAR);
			setState(190);
			valorAmostrar();
			setState(191);
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

	public static class ValorAmostrarContext extends ParserRuleContext {
		public ValorAmostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorAmostrar; }
	 
		public ValorAmostrarContext() { }
		public void copyFrom(ValorAmostrarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatMostrarContext extends ValorAmostrarContext {
		public Token valor;
		public TerminalNode FLOAT() { return getToken(LenguajeInventadoParser.FLOAT, 0); }
		public FloatMostrarContext(ValorAmostrarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterFloatMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitFloatMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitFloatMostrar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumMostrarContext extends ValorAmostrarContext {
		public Token valor;
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public NumMostrarContext(ValorAmostrarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterNumMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitNumMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitNumMostrar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringMostrarContext extends ValorAmostrarContext {
		public Token valor;
		public TerminalNode STRING() { return getToken(LenguajeInventadoParser.STRING, 0); }
		public StringMostrarContext(ValorAmostrarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterStringMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitStringMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitStringMostrar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarMostrarContext extends ValorAmostrarContext {
		public Token valor;
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public VarMostrarContext(ValorAmostrarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterVarMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitVarMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitVarMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorAmostrarContext valorAmostrar() throws RecognitionException {
		ValorAmostrarContext _localctx = new ValorAmostrarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valorAmostrar);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				_localctx = new NumMostrarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((NumMostrarContext)_localctx).valor = match(NUMERO);
				}
				break;
			case STRING:
				_localctx = new StringMostrarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((StringMostrarContext)_localctx).valor = match(STRING);
				}
				break;
			case FLOAT:
				_localctx = new FloatMostrarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((FloatMostrarContext)_localctx).valor = match(FLOAT);
				}
				break;
			case VARIABLE:
				_localctx = new VarMostrarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				((VarMostrarContext)_localctx).valor = match(VARIABLE);
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

	public static class IfContext extends ParserRuleContext {
		public CondicionifContext condicionif() {
			return getRuleContext(CondicionifContext.class,0);
		}
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public TerminalNode FINCOND() { return getToken(LenguajeInventadoParser.FINCOND, 0); }
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			condicionif();
			setState(200);
			match(FINCONDICION);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				branch();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==ELSE );
			setState(206);
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

	public static class ForContext extends ParserRuleContext {
		public CondicionforContext condicionfor() {
			return getRuleContext(CondicionforContext.class,0);
		}
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public TerminalNode FINCOND() { return getToken(LenguajeInventadoParser.FINCOND, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
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
		enterRule(_localctx, 32, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			condicionfor();
			setState(209);
			match(FINCONDICION);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				campo();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS) | (1L << NUMERO) | (1L << VARIABLE) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA) | (1L << ASIGNAR) | (1L << MOSTRAR))) != 0) );
			setState(215);
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
		"\u0004\u0001$\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0004\u0000\'\b\u0000\u000b\u0000\f\u0000(\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00029\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006p\b"+
		"\u0006\n\u0006\f\u0006s\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007w\b"+
		"\u0007\n\u0007\f\u0007z\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u007f\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0086\b\u0007\n\u0007\f\u0007\u0089\t\u0007\u0003\u0007\u008b"+
		"\b\u0007\u0001\b\u0004\b\u008e\b\b\u000b\b\f\b\u008f\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0099\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00a8\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00bc\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c6\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00cb\b\u000f\u000b\u000f\f"+
		"\u000f\u00cc\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u00d4\b\u0010\u000b\u0010\f\u0010\u00d5\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0000\u0002\n\f\u0011\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000\u00f4"+
		"\u0000&\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00048"+
		"\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nS\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000\u000e"+
		"\u008a\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000\u0000\u0000\u0012"+
		"\u00a0\u0001\u0000\u0000\u0000\u0014\u00a7\u0001\u0000\u0000\u0000\u0016"+
		"\u00a9\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000\u0000\u0000\u001a"+
		"\u00bd\u0001\u0000\u0000\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e"+
		"\u00c7\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#%\u0005\u0002\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*/\u0003\u0004\u0002\u0000"+
		"+,\u0005\t\u0000\u0000,.\u0003\u0004\u0002\u0000-+\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000029\u0003"+
		"\u0006\u0003\u000039\u0003\u000e\u0007\u000049\u0003\u001a\r\u000059\u0003"+
		"\u001e\u000f\u000069\u0003 \u0010\u000079\u0003\b\u0004\u000082\u0001"+
		"\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u0000"+
		"85\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000"+
		"\u00009\u0005\u0001\u0000\u0000\u0000:;\u0005\u001c\u0000\u0000;<\u0005"+
		"\b\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005"+
		"\t\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000AB"+
		"\u0005\u0004\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005\t\u0000\u0000D"+
		"\t\u0001\u0000\u0000\u0000EF\u0006\u0005\uffff\uffff\u0000FT\u0003\f\u0006"+
		"\u0000GT\u0005\u0007\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0003\n\u0005"+
		"\u0000JK\u0005\u0003\u0000\u0000KT\u0001\u0000\u0000\u0000LT\u0005\b\u0000"+
		"\u0000MN\u0005\b\u0000\u0000NO\u0005#\u0000\u0000OT\u0005\b\u0000\u0000"+
		"PQ\u0005\u0005\u0000\u0000QR\u0005#\u0000\u0000RT\u0005\u0005\u0000\u0000"+
		"SE\u0001\u0000\u0000\u0000SG\u0001\u0000\u0000\u0000SH\u0001\u0000\u0000"+
		"\u0000SL\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SP\u0001\u0000"+
		"\u0000\u0000T[\u0001\u0000\u0000\u0000UV\n\u0006\u0000\u0000VW\u0003\u0014"+
		"\n\u0000WX\u0003\n\u0005\u0007XZ\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0006\u0006\uffff\uffff\u0000_b\u0005\u0007\u0000\u0000`b\u0005"+
		"\b\u0000\u0000a^\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bq\u0001"+
		"\u0000\u0000\u0000cd\n\u0006\u0000\u0000de\u0005\u001f\u0000\u0000ep\u0005"+
		"\u0007\u0000\u0000fg\n\u0005\u0000\u0000gh\u0005 \u0000\u0000hp\u0005"+
		"\u0007\u0000\u0000ij\n\u0004\u0000\u0000jk\u0005\"\u0000\u0000kp\u0005"+
		"\u0007\u0000\u0000lm\n\u0003\u0000\u0000mn\u0005!\u0000\u0000np\u0005"+
		"\u0007\u0000\u0000oc\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000"+
		"oi\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\r\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tx\u0005\u000b\u0000\u0000uw\u0003"+
		"\u0010\b\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{\u008b\u0005\f\u0000\u0000|\u0080\u0005\r\u0000"+
		"\u0000}\u007f\u0003\u0010\b\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u008b\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0087\u0005\u000e\u0000\u0000\u0084\u0086\u0003"+
		"\u0010\b\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008at\u0001\u0000\u0000\u0000\u008a|\u0001\u0000\u0000\u0000"+
		"\u008a\u0083\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0005\u001e\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0099\u0001\u0000\u0000\u0000"+
		"\u0091\u0099\u0005\u001f\u0000\u0000\u0092\u0099\u0005 \u0000\u0000\u0093"+
		"\u0099\u0005!\u0000\u0000\u0094\u0099\u0005\"\u0000\u0000\u0095\u0099"+
		"\u0003\u0014\n\u0000\u0096\u0099\u0005\u0017\u0000\u0000\u0097\u0099\u0005"+
		"#\u0000\u0000\u0098\u008d\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000"+
		"\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0093\u0001\u0000"+
		"\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u00a1\u0005\u0007"+
		"\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009d\u0003\u0014\n"+
		"\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0005\b\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000"+
		"\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a8\u0005\u0014\u0000\u0000"+
		"\u00a3\u00a8\u0005\u0015\u0000\u0000\u00a4\u00a8\u0005\u0016\u0000\u0000"+
		"\u00a5\u00a8\u0005\u0013\u0000\u0000\u00a6\u00a8\u0005\u0012\u0000\u0000"+
		"\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\u001c\u0000\u0000"+
		"\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0007\u0000\u0000\u00ae\u00af\u0005\u000f\u0000\u0000\u00af"+
		"\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0003\u0014\n\u0000\u00b1\u00b2"+
		"\u0005\u0007\u0000\u0000\u00b2\u00b3\u0005\u000f\u0000\u0000\u00b3\u00b4"+
		"\u0005\b\u0000\u0000\u00b4\u00b5\u0005\u0011\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0003\u0000\u0000\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0018\u0000\u0000\u00b8\u00bc\u0003\b\u0004\u0000\u00b9\u00ba\u0005\u0019"+
		"\u0000\u0000\u00ba\u00bc\u0003\b\u0004\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u0019\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be\u00bf\u0003\u001c\u000e"+
		"\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c6\u0005\u0007\u0000\u0000\u00c2\u00c6\u0005\n\u0000\u0000\u00c3"+
		"\u00c6\u0005\u0006\u0000\u0000\u00c4\u00c6\u0005\b\u0000\u0000\u00c5\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u001d"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0012\t\u0000\u00c8\u00ca\u0005"+
		"\u0017\u0000\u0000\u00c9\u00cb\u0003\u0018\f\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf\u001f\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1\u00d3\u0005\u0017"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005\u001a\u0000\u0000\u00d8!\u0001\u0000\u0000"+
		"\u0000\u0015$(/8S[aoqx\u0080\u0087\u008a\u008f\u0098\u00a0\u00a7\u00bb"+
		"\u00c5\u00cc\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}