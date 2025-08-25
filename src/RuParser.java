// Generated from D:/Escuela/Trimestre12/Traductores/Tarea-Examen/Tarea-Examen-Jose/Tarea-Examen/src/Ru.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, IGUAL=3, DIFQ=4, MAYORQ=5, MENORQ=6, MENIG=7, MAYIG=8, MAS=9, 
		MENOS=10, MULT=11, DIV=12, MOD=13, POW=14, NOT=15, PTOCOMA=16, COMA=17, 
		ASIGNA=18, APAR=19, CPAR=20, ALLAVE=21, CLLAVE=22, TRUE=23, FALSE=24, 
		NIL=25, IF=26, ELSE=27, WHILE=28, FOR=29, LOG=30, VAR=31, IMPRIMIR=32, 
		ID=33, INT=34, FLOAT=35, STRING=36, COMENTARIO=37, ESPACIO=38, OTRO=39;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_sentencia = 2, RULE_declaracion_funcion = 3, 
		RULE_lista_parametros = 4, RULE_llamada_funcion = 5, RULE_lista_argumentos = 6, 
		RULE_declaracion = 7, RULE_asignacion = 8, RULE_sentencia_if = 9, RULE_bloque_condicional = 10, 
		RULE_bloque_de_sentencia = 11, RULE_sentencia_while = 12, RULE_sentencia_for = 13, 
		RULE_log = 14, RULE_imprimir = 15, RULE_expr = 16, RULE_atomo = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "sentencia", "declaracion_funcion", "lista_parametros", 
			"llamada_funcion", "lista_argumentos", "declaracion", "asignacion", "sentencia_if", 
			"bloque_condicional", "bloque_de_sentencia", "sentencia_while", "sentencia_for", 
			"log", "imprimir", "expr", "atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "','", "'='", "'('", 
			"')'", "'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'else'", 
			"'while'", "'for'", "'log'", "'var'", "'imprime'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "IGUAL", "DIFQ", "MAYORQ", "MENORQ", "MENIG", "MAYIG", 
			"MAS", "MENOS", "MULT", "DIV", "MOD", "POW", "NOT", "PTOCOMA", "COMA", 
			"ASIGNA", "APAR", "CPAR", "ALLAVE", "CLLAVE", "TRUE", "FALSE", "NIL", 
			"IF", "ELSE", "WHILE", "FOR", "LOG", "VAR", "IMPRIMIR", "ID", "INT", 
			"FLOAT", "STRING", "COMENTARIO", "ESPACIO", "OTRO"
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
	public String getGrammarFileName() { return "Ru.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RuParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			bloque();
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566734356480L) != 0)) {
				{
				{
				setState(39);
				sentencia();
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Token OTRO;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public TerminalNode OTRO() { return getToken(RuParser.OTRO, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				declaracion_funcion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				llamada_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				sentencia_if();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				sentencia_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				sentencia_for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				log();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(53);
				imprimir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(54);
				((SentenciaContext)_localctx).OTRO = match(OTRO);
				System.err.println("caracter desconocido: " + (((SentenciaContext)_localctx).OTRO!=null?((SentenciaContext)_localctx).OTRO.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VAR);
			setState(59);
			match(ID);
			setState(60);
			match(APAR);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(61);
				lista_parametros();
				}
			}

			setState(64);
			match(CPAR);
			setState(65);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_parametrosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RuParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(RuParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(RuParser.COMA, i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLista_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(68);
				match(COMA);
				setState(69);
				match(ID);
				}
				}
				setState(74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public Lista_argumentosContext lista_argumentos() {
			return getRuleContext(Lista_argumentosContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(APAR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128908297216L) != 0)) {
				{
				setState(77);
				lista_argumentos();
				}
			}

			setState(80);
			match(CPAR);
			setState(81);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_argumentosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(RuParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(RuParser.COMA, i);
		}
		public Lista_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_argumentos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLista_argumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_argumentosContext lista_argumentos() throws RecognitionException {
		Lista_argumentosContext _localctx = new Lista_argumentosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			expr(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(84);
				match(COMA);
				setState(85);
				expr(0);
				}
				}
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RuParser.VAR, 0); }
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode ASIGNA() { return getToken(RuParser.ASIGNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(VAR);
				setState(92);
				match(ID);
				setState(93);
				match(ASIGNA);
				setState(94);
				expr(0);
				setState(95);
				match(PTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(VAR);
				setState(98);
				match(ID);
				setState(99);
				match(ASIGNA);
				setState(100);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode ASIGNA() { return getToken(RuParser.ASIGNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(ASIGNA);
				setState(105);
				expr(0);
				setState(106);
				match(PTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				setState(109);
				match(ASIGNA);
				setState(110);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(RuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RuParser.IF, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RuParser.ELSE, i);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencia_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IF);
			setState(114);
			bloque_condicional();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(ELSE);
					setState(116);
					match(IF);
					setState(117);
					bloque_condicional();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123);
				match(ELSE);
				setState(124);
				bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(APAR);
			setState(128);
			expr(0);
			setState(129);
			match(CPAR);
			setState(130);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_de_sentenciaContext extends ParserRuleContext {
		public TerminalNode ALLAVE() { return getToken(RuParser.ALLAVE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode CLLAVE() { return getToken(RuParser.CLLAVE, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_de_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_de_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_sentenciaContext bloque_de_sentencia() throws RecognitionException {
		Bloque_de_sentenciaContext _localctx = new Bloque_de_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque_de_sentencia);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ALLAVE);
				setState(133);
				bloque();
				setState(134);
				match(CLLAVE);
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case LOG:
			case VAR:
			case IMPRIMIR:
			case ID:
			case OTRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			expr(0);
			setState(141);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RuParser.FOR, 0); }
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<TerminalNode> PTOCOMA() { return getTokens(RuParser.PTOCOMA); }
		public TerminalNode PTOCOMA(int i) {
			return getToken(RuParser.PTOCOMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FOR);
			setState(144);
			match(APAR);
			setState(145);
			declaracion();
			setState(146);
			match(PTOCOMA);
			setState(147);
			expr(0);
			setState(148);
			match(PTOCOMA);
			setState(149);
			asignacion();
			setState(150);
			match(CPAR);
			setState(151);
			bloque_de_sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(RuParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LOG);
			setState(154);
			expr(0);
			setState(155);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(RuParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IMPRIMIR);
			setState(158);
			expr(0);
			setState(159);
			match(PTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosUnarioExprContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MenosUnarioExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMenosUnarioExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(RuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(RuParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RuParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RuParser.MOD, 0); }
		public MultiplicacionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMultiplicacionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RuParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(RuParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(RuParser.IGUAL, 0); }
		public TerminalNode DIFQ() { return getToken(RuParser.DIFQ, 0); }
		public IgualdadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYIG() { return getToken(RuParser.MAYIG, 0); }
		public TerminalNode MENIG() { return getToken(RuParser.MENIG, 0); }
		public TerminalNode MENORQ() { return getToken(RuParser.MENORQ, 0); }
		public TerminalNode MAYORQ() { return getToken(RuParser.MAYORQ, 0); }
		public RelacionalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AditivaExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(RuParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public AditivaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAditivaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RuParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new MenosUnarioExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				match(MENOS);
				setState(163);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(NOT);
				setState(165);
				expr(8);
				}
				break;
			case APAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				atomo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(POW);
						setState(171);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(173);
						((MultiplicacionExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
							((MultiplicacionExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AditivaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(176);
						((AditivaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((AditivaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new RelacionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						((RelacionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
							((RelacionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new IgualdadExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						((IgualdadExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFQ) ) {
							((IgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(AND);
						setState(186);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(OR);
						setState(189);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomoContext extends ParserRuleContext {
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
	 
		public AtomoContext() { }
		public void copyFrom(AtomoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExprContext extends AtomoContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public ParExprContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomoContext {
		public TerminalNode TRUE() { return getToken(RuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RuParser.FALSE, 0); }
		public BooleanAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomContext extends AtomoContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public IdAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomoContext {
		public TerminalNode STRING() { return getToken(RuParser.STRING, 0); }
		public StringAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilAtomContext extends AtomoContext {
		public TerminalNode NIL() { return getToken(RuParser.NIL, 0); }
		public NilAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomoContext {
		public TerminalNode INT() { return getToken(RuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RuParser.FLOAT, 0); }
		public NumberAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atomo);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(APAR);
				setState(196);
				expr(0);
				setState(197);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(NIL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006"+
		"\n\u0006\f\u0006Z\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007f\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bp\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\tw\b\t\n\t\f\tz\t\t\u0001\t\u0001\t\u0003\t~\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u008a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a8\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00bf\b\u0010\n\u0010\f\u0010\u00c2"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cd\b\u0011\u0001"+
		"\u0011\u0000\u0001 \u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0006\u0001\u0000\u000b"+
		"\r\u0001\u0000\t\n\u0001\u0000\u0005\b\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\"#\u0001\u0000\u0017\u0018\u00dd\u0000$\u0001\u0000\u0000\u0000\u0002"+
		"*\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006:\u0001"+
		"\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000"+
		"\fS\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010o\u0001"+
		"\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000"+
		"\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000"+
		"\u0000\u0000\u001a\u008f\u0001\u0000\u0000\u0000\u001c\u0099\u0001\u0000"+
		"\u0000\u0000\u001e\u009d\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000"+
		"\u0000\"\u00cc\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005"+
		"\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\')\u0003\u0004\u0002"+
		"\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000-9\u0003\u0010\b\u0000.9\u0003\u000e\u0007\u0000"+
		"/9\u0003\u0006\u0003\u000009\u0003\n\u0005\u000019\u0003\u0012\t\u0000"+
		"29\u0003\u0018\f\u000039\u0003\u001a\r\u000049\u0003\u001c\u000e\u0000"+
		"59\u0003\u001e\u000f\u000067\u0005\'\u0000\u000079\u0006\u0002\uffff\uffff"+
		"\u00008-\u0001\u0000\u0000\u00008.\u0001\u0000\u0000\u00008/\u0001\u0000"+
		"\u0000\u000080\u0001\u0000\u0000\u000081\u0001\u0000\u0000\u000082\u0001"+
		"\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u0000"+
		"85\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:;\u0005\u001f\u0000\u0000;<\u0005!\u0000\u0000<>\u0005\u0013"+
		"\u0000\u0000=?\u0003\b\u0004\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u0014\u0000\u0000AB\u0003"+
		"\u0016\u000b\u0000B\u0007\u0001\u0000\u0000\u0000CH\u0005!\u0000\u0000"+
		"DE\u0005\u0011\u0000\u0000EG\u0005!\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000I\t\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005!\u0000"+
		"\u0000LN\u0005\u0013\u0000\u0000MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0014"+
		"\u0000\u0000QR\u0005\u0010\u0000\u0000R\u000b\u0001\u0000\u0000\u0000"+
		"SX\u0003 \u0010\u0000TU\u0005\u0011\u0000\u0000UW\u0003 \u0010\u0000V"+
		"T\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u001f\u0000\u0000\\]\u0005!\u0000\u0000]^\u0005"+
		"\u0012\u0000\u0000^_\u0003 \u0010\u0000_`\u0005\u0010\u0000\u0000`f\u0001"+
		"\u0000\u0000\u0000ab\u0005\u001f\u0000\u0000bc\u0005!\u0000\u0000cd\u0005"+
		"\u0012\u0000\u0000df\u0003 \u0010\u0000e[\u0001\u0000\u0000\u0000ea\u0001"+
		"\u0000\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005!\u0000\u0000"+
		"hi\u0005\u0012\u0000\u0000ij\u0003 \u0010\u0000jk\u0005\u0010\u0000\u0000"+
		"kp\u0001\u0000\u0000\u0000lm\u0005!\u0000\u0000mn\u0005\u0012\u0000\u0000"+
		"np\u0003 \u0010\u0000og\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"p\u0011\u0001\u0000\u0000\u0000qr\u0005\u001a\u0000\u0000rx\u0003\u0014"+
		"\n\u0000st\u0005\u001b\u0000\u0000tu\u0005\u001a\u0000\u0000uw\u0003\u0014"+
		"\n\u0000vs\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y}\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{|\u0005\u001b\u0000\u0000|~\u0003\u0016\u000b\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0013\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u0081\u0003 \u0010"+
		"\u0000\u0081\u0082\u0005\u0014\u0000\u0000\u0082\u0083\u0003\u0016\u000b"+
		"\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0015\u0000"+
		"\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086\u0087\u0005\u0016\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u0004\u0002"+
		"\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001c\u0000"+
		"\u0000\u008c\u008d\u0003 \u0010\u0000\u008d\u008e\u0003\u0016\u000b\u0000"+
		"\u008e\u0019\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001d\u0000\u0000"+
		"\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000"+
		"\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0094\u0003 \u0010\u0000\u0094"+
		"\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097"+
		"\u0005\u0014\u0000\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u001b"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001e\u0000\u0000\u009a\u009b"+
		"\u0003 \u0010\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c\u001d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u009f\u0003 \u0010"+
		"\u0000\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u001f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0006\u0010\uffff\uffff\u0000\u00a2\u00a3\u0005\n\u0000"+
		"\u0000\u00a3\u00a8\u0003 \u0010\t\u00a4\u00a5\u0005\u000f\u0000\u0000"+
		"\u00a5\u00a8\u0003 \u0010\b\u00a6\u00a8\u0003\"\u0011\u0000\u00a7\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00c0\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\n\n\u0000\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00bf\u0003"+
		" \u0010\u000b\u00ac\u00ad\n\u0007\u0000\u0000\u00ad\u00ae\u0007\u0000"+
		"\u0000\u0000\u00ae\u00bf\u0003 \u0010\b\u00af\u00b0\n\u0006\u0000\u0000"+
		"\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1\u00bf\u0003 \u0010\u0007\u00b2"+
		"\u00b3\n\u0005\u0000\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4\u00bf"+
		"\u0003 \u0010\u0006\u00b5\u00b6\n\u0004\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0003\u0000\u0000\u00b7\u00bf\u0003 \u0010\u0005\u00b8\u00b9\n\u0003"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u00bf\u0003 \u0010"+
		"\u0004\u00bb\u00bc\n\u0002\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000"+
		"\u00bd\u00bf\u0003 \u0010\u0003\u00be\u00a9\u0001\u0000\u0000\u0000\u00be"+
		"\u00ac\u0001\u0000\u0000\u0000\u00be\u00af\u0001\u0000\u0000\u0000\u00be"+
		"\u00b2\u0001\u0000\u0000\u0000\u00be\u00b5\u0001\u0000\u0000\u0000\u00be"+
		"\u00b8\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0013\u0000\u0000\u00c4\u00c5"+
		"\u0003 \u0010\u0000\u00c5\u00c6\u0005\u0014\u0000\u0000\u00c6\u00cd\u0001"+
		"\u0000\u0000\u0000\u00c7\u00cd\u0007\u0004\u0000\u0000\u00c8\u00cd\u0007"+
		"\u0005\u0000\u0000\u00c9\u00cd\u0005!\u0000\u0000\u00ca\u00cd\u0005$\u0000"+
		"\u0000\u00cb\u00cd\u0005\u0019\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd#\u0001\u0000\u0000\u0000"+
		"\u000f*8>HNXeox}\u0089\u00a7\u00be\u00c0\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}