// Generated from D:/Universidad/Compiladores/Lab/PL3/src/lenguajeInventado\LenguajeInventado.g4 by ANTLR 4.10.1
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
		RULE_condicionwhile = 12, RULE_branch = 13, RULE_mostrar = 14, RULE_valorAmostrar = 15, 
		RULE_if = 16, RULE_for = 17, RULE_while = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fila", "campo", "asignacion", "actualizar", "expr", "operacion", 
			"comentario", "textos", "condicionif", "operadorcondicional", "condicionfor", 
			"condicionwhile", "branch", "mostrar", "valorAmostrar", "if", "for", 
			"while"
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
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				fila();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(39);
					match(NEWLINE);
					}
				}

				}
				}
				setState(44); 
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
			setState(46);
			campo();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINLINEA) {
				{
				{
				setState(47);
				match(FINLINEA);
				setState(48);
				campo();
				}
				}
				setState(53);
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
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				comentario();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				mostrar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
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
			setState(63);
			match(ASIGNAR);
			setState(64);
			((AsignacionContext)_localctx).nombrevariable = match(VARIABLE);
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
			setState(69);
			((ActualizarContext)_localctx).nombrevariable = match(VARIABLE);
			setState(70);
			match(IGUAL);
			setState(71);
			expr(0);
			setState(72);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(75);
				operacion(0);
				}
				break;
			case 2:
				{
				setState(76);
				match(NUMERO);
				}
				break;
			case 3:
				{
				setState(77);
				match(PARENTESIS);
				setState(78);
				expr(0);
				setState(79);
				match(PARENTESIS);
				}
				break;
			case 4:
				{
				setState(81);
				match(VARIABLE);
				}
				break;
			case 5:
				{
				setState(82);
				match(VARIABLE);
				setState(83);
				match(OPERADORESBOOL);
				setState(84);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(85);
				match(BOOLTIPO);
				setState(86);
				match(OPERADORESBOOL);
				setState(87);
				match(BOOLTIPO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
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
					setState(90);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					{
					setState(91);
					operadorcondicional();
					}
					setState(92);
					expr(7);
					}
					} 
				}
				setState(98);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(100);
				((NumberContext)_localctx).number = match(NUMERO);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperacionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lef = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						match(PLUS);
						setState(106);
						((PlusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new OperacionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						match(MINUS);
						setState(109);
						((MinusContext)_localctx).right = match(NUMERO);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new OperacionContext(_parentctx, _parentState));
						((MulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						match(POR);
						setState(112);
						((MulContext)_localctx).right = match(NUMERO);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new OperacionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(DIVISOR);
						setState(115);
						((DivContext)_localctx).right = match(NUMERO);
						}
						break;
					}
					} 
				}
				setState(120);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(COMENTARIOABRIR);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(122);
					textos();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(COMENTARIOLINEA);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(130);
					textos();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case COMENTARIOALMOHADILLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(COMENTARIOALMOHADILLA);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUALIGUAL) | (1L << FINCONDICION) | (1L << TEXTO) | (1L << PLUS) | (1L << MINUS) | (1L << DIVISOR) | (1L << POR) | (1L << OPERADORESBOOL))) != 0)) {
					{
					{
					setState(137);
					textos();
					}
					}
					setState(142);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						match(TEXTO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(MINUS);
				}
				break;
			case DIVISOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(DIVISOR);
				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
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
				setState(154);
				operadorcondicional();
				}
				break;
			case FINCONDICION:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(FINCONDICION);
				}
				break;
			case OPERADORESBOOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((CondicionifContext)_localctx).varIzquierda = match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((CondicionifContext)_localctx).varIzquierda = match(VARIABLE);
				setState(161);
				((CondicionifContext)_localctx).operadorcond = operadorcondicional();
				setState(162);
				((CondicionifContext)_localctx).varDerecha = match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYORIGUAL:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(MAYORIGUAL);
				}
				break;
			case MENORIGUAL:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(MENORIGUAL);
				}
				break;
			case IGUALIGUAL:
				_localctx = new IgualigualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(IGUALIGUAL);
				}
				break;
			case MENOR:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(MENOR);
				}
				break;
			case MAYOR:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
			setState(174);
			match(PARENTESIS);
			setState(175);
			match(ASIGNAR);
			setState(176);
			((CondicionforContext)_localctx).nombrevariable = match(VARIABLE);
			setState(177);
			match(IGUAL);
			setState(178);
			((CondicionforContext)_localctx).valornum = match(NUMERO);
			setState(179);
			match(SEPARADOR);
			setState(180);
			match(VARIABLE);
			setState(181);
			operadorcondicional();
			setState(182);
			((CondicionforContext)_localctx).valorlim = match(NUMERO);
			setState(183);
			match(SEPARADOR);
			setState(184);
			match(VARIABLE);
			setState(185);
			match(INDEC);
			setState(186);
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

	public static class CondicionwhileContext extends ParserRuleContext {
		public Token varIzquierda;
		public OperadorcondicionalContext operadorcond;
		public Token varDerecha;
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public OperadorcondicionalContext operadorcondicional() {
			return getRuleContext(OperadorcondicionalContext.class,0);
		}
		public CondicionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCondicionwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCondicionwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCondicionwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionwhileContext condicionwhile() throws RecognitionException {
		CondicionwhileContext _localctx = new CondicionwhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicionwhile);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((CondicionwhileContext)_localctx).varIzquierda = match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((CondicionwhileContext)_localctx).varIzquierda = match(VARIABLE);
				setState(190);
				((CondicionwhileContext)_localctx).operadorcond = operadorcondicional();
				setState(191);
				((CondicionwhileContext)_localctx).varDerecha = match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((CondicionwhileContext)_localctx).varIzquierda = match(VARIABLE);
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
		enterRule(_localctx, 26, RULE_branch);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((BranchContext)_localctx).positivo = match(IF);
				setState(197);
				actualizar();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((BranchContext)_localctx).negativo = match(ELSE);
				setState(199);
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
		enterRule(_localctx, 28, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(MOSTRAR);
			setState(203);
			valorAmostrar();
			setState(204);
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
		enterRule(_localctx, 30, RULE_valorAmostrar);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				_localctx = new NumMostrarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((NumMostrarContext)_localctx).valor = match(NUMERO);
				}
				break;
			case STRING:
				_localctx = new StringMostrarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((StringMostrarContext)_localctx).valor = match(STRING);
				}
				break;
			case FLOAT:
				_localctx = new FloatMostrarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				((FloatMostrarContext)_localctx).valor = match(FLOAT);
				}
				break;
			case VARIABLE:
				_localctx = new VarMostrarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
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
		enterRule(_localctx, 32, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			condicionif();
			setState(213);
			match(FINCONDICION);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				branch();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==ELSE );
			setState(219);
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
		enterRule(_localctx, 34, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			condicionfor();
			setState(222);
			match(FINCONDICION);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				campo();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS) | (1L << NUMERO) | (1L << VARIABLE) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA) | (1L << ASIGNAR) | (1L << MOSTRAR))) != 0) );
			setState(228);
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

	public static class WhileContext extends ParserRuleContext {
		public CondicionwhileContext condicionwhile() {
			return getRuleContext(CondicionwhileContext.class,0);
		}
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public TerminalNode FINCOND() { return getToken(LenguajeInventadoParser.FINCOND, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			condicionwhile();
			setState(231);
			match(FINCONDICION);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				campo();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS) | (1L << NUMERO) | (1L << VARIABLE) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA) | (1L << ASIGNAR) | (1L << MOSTRAR))) != 0) );
			setState(237);
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
		"\u0004\u0001$\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0004\u0000+\b\u0000\u000b"+
		"\u0000\f\u0000,\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00012\b\u0001"+
		"\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006"+
		"x\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007|\b\u0007\n\u0007\f\u0007"+
		"\u007f\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0084\b"+
		"\u0007\n\u0007\f\u0007\u0087\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u008b\b\u0007\n\u0007\f\u0007\u008e\t\u0007\u0003\u0007\u0090\b\u0007"+
		"\u0001\b\u0004\b\u0093\b\b\u000b\b\f\b\u0094\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ad\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00c3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00d8\b\u0010\u000b\u0010\f\u0010"+
		"\u00d9\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00e1\b\u0011\u000b\u0011\f\u0011\u00e2\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00ea\b\u0012\u000b\u0012"+
		"\f\u0012\u00eb\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0002\n\f\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0000\u010c\u0000*\u0001\u0000\u0000\u0000\u0002"+
		".\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006?\u0001"+
		"\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000"+
		"\ff\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010"+
		"\u009d\u0001\u0000\u0000\u0000\u0012\u00a5\u0001\u0000\u0000\u0000\u0014"+
		"\u00ac\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018"+
		"\u00c2\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000\u0000\u001c"+
		"\u00ca\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d4"+
		"\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u00e6\u0001"+
		"\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\')\u0005\u0002\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*&\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0001\u0001\u0000\u0000\u0000"+
		".3\u0003\u0004\u0002\u0000/0\u0005\t\u0000\u000002\u0003\u0004\u0002\u0000"+
		"1/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006>\u0003\u0006\u0003\u00007>\u0003\u000e\u0007\u0000"+
		"8>\u0003\u001c\u000e\u00009>\u0003 \u0010\u0000:>\u0003\"\u0011\u0000"+
		";>\u0003$\u0012\u0000<>\u0003\b\u0004\u0000=6\u0001\u0000\u0000\u0000"+
		"=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000"+
		"\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005\u001c\u0000\u0000"+
		"@A\u0005\b\u0000\u0000AB\u0005\u0004\u0000\u0000BC\u0003\n\u0005\u0000"+
		"CD\u0005\t\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\b\u0000"+
		"\u0000FG\u0005\u0004\u0000\u0000GH\u0003\n\u0005\u0000HI\u0005\t\u0000"+
		"\u0000I\t\u0001\u0000\u0000\u0000JK\u0006\u0005\uffff\uffff\u0000KY\u0003"+
		"\f\u0006\u0000LY\u0005\u0007\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0003"+
		"\n\u0005\u0000OP\u0005\u0003\u0000\u0000PY\u0001\u0000\u0000\u0000QY\u0005"+
		"\b\u0000\u0000RS\u0005\b\u0000\u0000ST\u0005#\u0000\u0000TY\u0005\b\u0000"+
		"\u0000UV\u0005\u0005\u0000\u0000VW\u0005#\u0000\u0000WY\u0005\u0005\u0000"+
		"\u0000XJ\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000\u0000XM\u0001\u0000"+
		"\u0000\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XU\u0001"+
		"\u0000\u0000\u0000Y`\u0001\u0000\u0000\u0000Z[\n\u0006\u0000\u0000[\\"+
		"\u0003\u0014\n\u0000\\]\u0003\n\u0005\u0007]_\u0001\u0000\u0000\u0000"+
		"^Z\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cd\u0006\u0006\uffff\uffff\u0000dg\u0005\u0007\u0000"+
		"\u0000eg\u0005\b\u0000\u0000fc\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gv\u0001\u0000\u0000\u0000hi\n\u0006\u0000\u0000ij\u0005\u001f\u0000"+
		"\u0000ju\u0005\u0007\u0000\u0000kl\n\u0005\u0000\u0000lm\u0005 \u0000"+
		"\u0000mu\u0005\u0007\u0000\u0000no\n\u0004\u0000\u0000op\u0005\"\u0000"+
		"\u0000pu\u0005\u0007\u0000\u0000qr\n\u0003\u0000\u0000rs\u0005!\u0000"+
		"\u0000su\u0005\u0007\u0000\u0000th\u0001\u0000\u0000\u0000tk\u0001\u0000"+
		"\u0000\u0000tn\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\r\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y}\u0005\u000b\u0000"+
		"\u0000z|\u0003\u0010\b\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0090\u0005"+
		"\f\u0000\u0000\u0081\u0085\u0005\r\u0000\u0000\u0082\u0084\u0003\u0010"+
		"\b\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0090\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0005\u000e\u0000\u0000\u0089\u008b\u0003\u0010\b\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008fy\u0001\u0000\u0000\u0000\u008f\u0081\u0001\u0000\u0000\u0000\u008f"+
		"\u0088\u0001\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0005\u001e\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u009e\u0001\u0000\u0000\u0000\u0096"+
		"\u009e\u0005\u001f\u0000\u0000\u0097\u009e\u0005 \u0000\u0000\u0098\u009e"+
		"\u0005!\u0000\u0000\u0099\u009e\u0005\"\u0000\u0000\u009a\u009e\u0003"+
		"\u0014\n\u0000\u009b\u009e\u0005\u0017\u0000\u0000\u009c\u009e\u0005#"+
		"\u0000\u0000\u009d\u0092\u0001\u0000\u0000\u0000\u009d\u0096\u0001\u0000"+
		"\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000"+
		"\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a6\u0005\u0007"+
		"\u0000\u0000\u00a0\u00a1\u0005\b\u0000\u0000\u00a1\u00a2\u0003\u0014\n"+
		"\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005\b\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00ad\u0005\u0014\u0000\u0000"+
		"\u00a8\u00ad\u0005\u0015\u0000\u0000\u00a9\u00ad\u0005\u0016\u0000\u0000"+
		"\u00aa\u00ad\u0005\u0013\u0000\u0000\u00ab\u00ad\u0005\u0012\u0000\u0000"+
		"\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0015\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0005\u001c\u0000\u0000"+
		"\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u00b2\u0005\u0004\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4\u0005\u000f\u0000\u0000\u00b4"+
		"\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0003\u0014\n\u0000\u00b6\u00b7"+
		"\u0005\u0007\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9"+
		"\u0005\b\u0000\u0000\u00b9\u00ba\u0005\u0011\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0003\u0000\u0000\u00bb\u0017\u0001\u0000\u0000\u0000\u00bc\u00c3\u0005"+
		"\u0007\u0000\u0000\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0003\u0014"+
		"\n\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0005\b\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u0019\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000"+
		"\u00c5\u00c9\u0003\b\u0004\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7"+
		"\u00c9\u0003\b\u0004\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u001d\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd"+
		"\u0005\t\u0000\u0000\u00cd\u001d\u0001\u0000\u0000\u0000\u00ce\u00d3\u0005"+
		"\u0007\u0000\u0000\u00cf\u00d3\u0005\n\u0000\u0000\u00d0\u00d3\u0005\u0006"+
		"\u0000\u0000\u00d1\u00d3\u0005\b\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u001f\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0003\u0012\t\u0000\u00d5\u00d7\u0005\u0017\u0000\u0000"+
		"\u00d6\u00d8\u0003\u001a\r\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005\u001a\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0003\u0016\u000b\u0000\u00de\u00e0\u0005\u0017\u0000\u0000\u00df\u00e1"+
		"\u0003\u0004\u0002\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u001a\u0000\u0000\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003"+
		"\u0018\f\u0000\u00e7\u00e9\u0005\u0017\u0000\u0000\u00e8\u00ea\u0003\u0004"+
		"\u0002\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u001a"+
		"\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000\u0017(,3=X`ftv}\u0085\u008c"+
		"\u008f\u0094\u009d\u00a5\u00ac\u00c2\u00c8\u00d2\u00d9\u00e2\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}