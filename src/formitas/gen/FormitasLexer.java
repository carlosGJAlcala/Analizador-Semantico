// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl3Compiladores/src/formitas\FormitasLexer.g4 by ANTLR 4.10.1
package formitas.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormitasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIO=1, NEWLINE=2, COLOR=3, FIGURA=4, APERTURA=5, CERRADURA=6, TXTDIM=7, 
		TXTSHPDIM=8, SEPARADOR=9, BARRA=10, CERRAPARENTESIS=11, TXTCOL=12, TXTSIZE=13, 
		CERRARSIZE=14, NUMERO=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESPACIO", "NEWLINE", "COLOR", "FIGURA", "APERTURA", "CERRADURA", "TXTDIM", 
			"TXTSHPDIM", "SEPARADOR", "BARRA", "CERRAPARENTESIS", "TXTCOL", "TXTSIZE", 
			"CERRARSIZE", "NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'>>>'", "'<<<'", "'imgdim:'", "'shpdim:'", 
			"','", "'|'", "')'", "'(color:'", "'(size:'", "'px)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ESPACIO", "NEWLINE", "COLOR", "FIGURA", "APERTURA", "CERRADURA", 
			"TXTDIM", "TXTSHPDIM", "SEPARADOR", "BARRA", "CERRAPARENTESIS", "TXTCOL", 
			"TXTSIZE", "CERRARSIZE", "NUMERO"
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


	public FormitasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FormitasLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u00bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001,\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002g\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0081\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00b5"+
		"\b\u000e\u0001\u000e\u0003\u000e\u00b8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u0001\u0000\u0002\u0002\u0000\t\t  \u0001\u0000"+
		"09\u00cc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u0005f\u0001\u0000\u0000\u0000\u0007\u0080\u0001\u0000"+
		"\u0000\u0000\t\u0082\u0001\u0000\u0000\u0000\u000b\u0086\u0001\u0000\u0000"+
		"\u0000\r\u008a\u0001\u0000\u0000\u0000\u000f\u0092\u0001\u0000\u0000\u0000"+
		"\u0011\u009a\u0001\u0000\u0000\u0000\u0013\u009c\u0001\u0000\u0000\u0000"+
		"\u0015\u009e\u0001\u0000\u0000\u0000\u0017\u00a0\u0001\u0000\u0000\u0000"+
		"\u0019\u00a8\u0001\u0000\u0000\u0000\u001b\u00af\u0001\u0000\u0000\u0000"+
		"\u001d\u00b4\u0001\u0000\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0000"+
		"\u0000\u0000%\u0002\u0001\u0000\u0000\u0000&(\u0005\r\u0000\u0000\'&\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		"),\u0005\n\u0000\u0000*,\u0005\r\u0000\u0000+\'\u0001\u0000\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0001"+
		"\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005r\u0000\u000023\u0005"+
		"e\u0000\u00003g\u0005d\u0000\u000045\u0005o\u0000\u000056\u0005r\u0000"+
		"\u000067\u0005a\u0000\u000078\u0005n\u0000\u000089\u0005g\u0000\u0000"+
		"9g\u0005e\u0000\u0000:;\u0005y\u0000\u0000;<\u0005e\u0000\u0000<=\u0005"+
		"l\u0000\u0000=>\u0005l\u0000\u0000>?\u0005o\u0000\u0000?g\u0005w\u0000"+
		"\u0000@A\u0005c\u0000\u0000AB\u0005y\u0000\u0000BC\u0005a\u0000\u0000"+
		"Cg\u0005n\u0000\u0000DE\u0005b\u0000\u0000EF\u0005l\u0000\u0000FG\u0005"+
		"u\u0000\u0000Gg\u0005e\u0000\u0000HI\u0005g\u0000\u0000IJ\u0005r\u0000"+
		"\u0000JK\u0005e\u0000\u0000KL\u0005e\u0000\u0000Lg\u0005n\u0000\u0000"+
		"MN\u0005p\u0000\u0000NO\u0005u\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005"+
		"p\u0000\u0000QR\u0005l\u0000\u0000Rg\u0005e\u0000\u0000ST\u0005b\u0000"+
		"\u0000TU\u0005r\u0000\u0000UV\u0005o\u0000\u0000VW\u0005w\u0000\u0000"+
		"Wg\u0005n\u0000\u0000XY\u0005b\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005"+
		"a\u0000\u0000[\\\u0005c\u0000\u0000\\g\u0005k\u0000\u0000]^\u0005g\u0000"+
		"\u0000^_\u0005r\u0000\u0000_`\u0005e\u0000\u0000`g\u0005y\u0000\u0000"+
		"ab\u0005w\u0000\u0000bc\u0005h\u0000\u0000cd\u0005i\u0000\u0000de\u0005"+
		"t\u0000\u0000eg\u0005e\u0000\u0000f1\u0001\u0000\u0000\u0000f4\u0001\u0000"+
		"\u0000\u0000f:\u0001\u0000\u0000\u0000f@\u0001\u0000\u0000\u0000fD\u0001"+
		"\u0000\u0000\u0000fH\u0001\u0000\u0000\u0000fM\u0001\u0000\u0000\u0000"+
		"fS\u0001\u0000\u0000\u0000fX\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000"+
		"\u0000fa\u0001\u0000\u0000\u0000g\u0006\u0001\u0000\u0000\u0000hi\u0005"+
		"c\u0000\u0000ij\u0005i\u0000\u0000jk\u0005r\u0000\u0000kl\u0005c\u0000"+
		"\u0000lm\u0005u\u0000\u0000mn\u0005l\u0000\u0000n\u0081\u0005o\u0000\u0000"+
		"op\u0005t\u0000\u0000pq\u0005r\u0000\u0000qr\u0005i\u0000\u0000rs\u0005"+
		"a\u0000\u0000st\u0005n\u0000\u0000tu\u0005g\u0000\u0000uv\u0005u\u0000"+
		"\u0000vw\u0005l\u0000\u0000w\u0081\u0005o\u0000\u0000xy\u0005c\u0000\u0000"+
		"yz\u0005u\u0000\u0000z{\u0005a\u0000\u0000{|\u0005d\u0000\u0000|}\u0005"+
		"r\u0000\u0000}~\u0005a\u0000\u0000~\u007f\u0005d\u0000\u0000\u007f\u0081"+
		"\u0005o\u0000\u0000\u0080h\u0001\u0000\u0000\u0000\u0080o\u0001\u0000"+
		"\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0081\b\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005>\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u0084"+
		"\u0085\u0005>\u0000\u0000\u0085\n\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005<\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u0089\u0005<"+
		"\u0000\u0000\u0089\f\u0001\u0000\u0000\u0000\u008a\u008b\u0005i\u0000"+
		"\u0000\u008b\u008c\u0005m\u0000\u0000\u008c\u008d\u0005g\u0000\u0000\u008d"+
		"\u008e\u0005d\u0000\u0000\u008e\u008f\u0005i\u0000\u0000\u008f\u0090\u0005"+
		"m\u0000\u0000\u0090\u0091\u0005:\u0000\u0000\u0091\u000e\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094\u0005h\u0000\u0000\u0094"+
		"\u0095\u0005p\u0000\u0000\u0095\u0096\u0005d\u0000\u0000\u0096\u0097\u0005"+
		"i\u0000\u0000\u0097\u0098\u0005m\u0000\u0000\u0098\u0099\u0005:\u0000"+
		"\u0000\u0099\u0010\u0001\u0000\u0000\u0000\u009a\u009b\u0005,\u0000\u0000"+
		"\u009b\u0012\u0001\u0000\u0000\u0000\u009c\u009d\u0005|\u0000\u0000\u009d"+
		"\u0014\u0001\u0000\u0000\u0000\u009e\u009f\u0005)\u0000\u0000\u009f\u0016"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005(\u0000\u0000\u00a1\u00a2\u0005"+
		"c\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005l\u0000"+
		"\u0000\u00a4\u00a5\u0005o\u0000\u0000\u00a5\u00a6\u0005r\u0000\u0000\u00a6"+
		"\u00a7\u0005:\u0000\u0000\u00a7\u0018\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005(\u0000\u0000\u00a9\u00aa\u0005s\u0000\u0000\u00aa\u00ab\u0005i"+
		"\u0000\u0000\u00ab\u00ac\u0005z\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000"+
		"\u00ad\u00ae\u0005:\u0000\u0000\u00ae\u001a\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005p\u0000\u0000\u00b0\u00b1\u0005x\u0000\u0000\u00b1\u00b2\u0005"+
		")\u0000\u0000\u00b2\u001c\u0001\u0000\u0000\u0000\u00b3\u00b5\u0007\u0001"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b8\u0007\u0001"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0001"+
		"\u0000\u0000\u00ba\u001e\u0001\u0000\u0000\u0000\t\u0000\"\'+-f\u0080"+
		"\u00b4\u00b7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}