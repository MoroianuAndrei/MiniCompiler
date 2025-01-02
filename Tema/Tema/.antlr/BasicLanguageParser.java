// Generated from d:/MiniCompiler/Tema/Tema/BasicLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BasicLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, DOUBLE=3, STRING=4, VOID=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		RETURN=10, ID=11, NUMBER=12, STRING_LITERAL=13, PLUS=14, MINUS=15, STAR=16, 
		SLASH=17, MOD=18, LT=19, GT=20, LE=21, GE=22, EQ=23, NE=24, AND=25, OR=26, 
		NOT=27, ASSIGN=28, PLUS_ASSIGN=29, MINUS_ASSIGN=30, STAR_ASSIGN=31, SLASH_ASSIGN=32, 
		MOD_ASSIGN=33, INCREMENT=34, DECREMENT=35, LPAREN=36, RPAREN=37, LBRACE=38, 
		RBRACE=39, COMMA=40, SEMICOLON=41, COMMENT=42, BLOCK_COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_declaration = 4, RULE_block = 5, RULE_statement = 6, RULE_ifStatement = 7, 
		RULE_forStatement = 8, RULE_whileStatement = 9, RULE_returnStatement = 10, 
		RULE_expr = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "parameter", "declaration", "block", 
			"statement", "ifStatement", "forStatement", "whileStatement", "returnStatement", 
			"expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'double'", "'string'", "'void'", "'if'", "'else'", 
			"'for'", "'while'", "'return'", null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'++'", "'--'", 
			"'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "DOUBLE", "STRING", "VOID", "IF", "ELSE", "FOR", 
			"WHILE", "RETURN", "ID", "NUMBER", "STRING_LITERAL", "PLUS", "MINUS", 
			"STAR", "SLASH", "MOD", "LT", "GT", "LE", "GE", "EQ", "NE", "AND", "OR", 
			"NOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "SLASH_ASSIGN", 
			"MOD_ASSIGN", "INCREMENT", "DECREMENT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "COMMA", "SEMICOLON", "COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "BasicLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BasicLanguageParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					function();
					}
					break;
				case 2:
					{
					setState(27);
					declaration();
					}
					break;
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BasicLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(BasicLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicLanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			type();
			setState(36);
			match(ID);
			setState(37);
			match(LPAREN);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(38);
				parameters();
				}
			}

			setState(41);
			match(RPAREN);
			setState(42);
			block();
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicLanguageParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			parameter();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45);
				match(COMMA);
				setState(46);
				parameter();
				}
				}
				setState(51);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BasicLanguageParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			type();
			setState(53);
			match(ID);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BasicLanguageParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BasicLanguageParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
			match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(57);
				match(ASSIGN);
				setState(58);
				expr(0);
				}
			}

			setState(61);
			match(SEMICOLON);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BasicLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BasicLanguageParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68853710718L) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RBRACE);
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BasicLanguageParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				returnStatement();
				}
				break;
			case INT:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				declaration();
				}
				break;
			case ID:
			case NUMBER:
			case STRING_LITERAL:
			case NOT:
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				expr(0);
				setState(78);
				match(SEMICOLON);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BasicLanguageParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BasicLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicLanguageParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BasicLanguageParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			match(LPAREN);
			setState(84);
			expr(0);
			setState(85);
			match(RPAREN);
			setState(86);
			block();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(87);
				match(ELSE);
				setState(88);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BasicLanguageParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(BasicLanguageParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicLanguageParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(BasicLanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FOR);
			setState(92);
			match(LPAREN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68853708800L) != 0)) {
				{
				setState(93);
				expr(0);
				}
			}

			setState(96);
			match(SEMICOLON);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68853708800L) != 0)) {
				{
				setState(97);
				expr(0);
				}
			}

			setState(100);
			match(SEMICOLON);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68853708800L) != 0)) {
				{
				setState(101);
				expr(0);
				}
			}

			setState(104);
			match(RPAREN);
			setState(105);
			block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BasicLanguageParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BasicLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicLanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHILE);
			setState(108);
			match(LPAREN);
			setState(109);
			expr(0);
			setState(110);
			match(RPAREN);
			setState(111);
			block();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicLanguageParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BasicLanguageParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(RETURN);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68853708800L) != 0)) {
				{
				setState(114);
				expr(0);
				}
			}

			setState(117);
			match(SEMICOLON);
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
		public TerminalNode NOT() { return getToken(BasicLanguageParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(BasicLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicLanguageParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(BasicLanguageParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(BasicLanguageParser.MINUS_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(BasicLanguageParser.STAR_ASSIGN, 0); }
		public TerminalNode SLASH_ASSIGN() { return getToken(BasicLanguageParser.SLASH_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(BasicLanguageParser.MOD_ASSIGN, 0); }
		public TerminalNode INCREMENT() { return getToken(BasicLanguageParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(BasicLanguageParser.DECREMENT, 0); }
		public TerminalNode LPAREN() { return getToken(BasicLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicLanguageParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(BasicLanguageParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(BasicLanguageParser.STRING_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(BasicLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicLanguageParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(BasicLanguageParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(BasicLanguageParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(BasicLanguageParser.MOD, 0); }
		public TerminalNode LT() { return getToken(BasicLanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(BasicLanguageParser.GT, 0); }
		public TerminalNode LE() { return getToken(BasicLanguageParser.LE, 0); }
		public TerminalNode GE() { return getToken(BasicLanguageParser.GE, 0); }
		public TerminalNode EQ() { return getToken(BasicLanguageParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BasicLanguageParser.NE, 0); }
		public TerminalNode AND() { return getToken(BasicLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(BasicLanguageParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitExpr(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				match(NOT);
				setState(121);
				expr(8);
				}
				break;
			case 2:
				{
				setState(122);
				match(ID);
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				expr(7);
				}
				break;
			case 3:
				{
				setState(125);
				match(ID);
				setState(126);
				match(INCREMENT);
				}
				break;
			case 4:
				{
				setState(127);
				match(ID);
				setState(128);
				match(DECREMENT);
				}
				break;
			case 5:
				{
				setState(129);
				match(LPAREN);
				setState(130);
				expr(0);
				setState(131);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(133);
				match(NUMBER);
				}
				break;
			case 7:
				{
				setState(134);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				setState(135);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(139);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(142);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BasicLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(BasicLanguageParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(BasicLanguageParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(BasicLanguageParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(BasicLanguageParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasicLanguageListener ) ((BasicLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u009b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000\f"+
		"\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00020\b\u0002\n\u0002"+
		"\f\u00023\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Q\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b_\b\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0003\bg\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0003\nt\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0089\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0094\b\u000b\n\u000b\f\u000b\u0097\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0001\u0000\u001c"+
		"!\u0001\u0000\u000e\u0012\u0001\u0000\u0013\u0018\u0001\u0000\u0019\u001a"+
		"\u0001\u0000\u0001\u0005\u00a7\u0000\u001e\u0001\u0000\u0000\u0000\u0002"+
		"#\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00064\u0001"+
		"\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000"+
		"\fP\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010[\u0001"+
		"\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000"+
		"\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u0098\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d\u0003\b\u0004\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000"+
		"\u0000#$\u0003\u0018\f\u0000$%\u0005\u000b\u0000\u0000%\'\u0005$\u0000"+
		"\u0000&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005%\u0000\u0000*+\u0003\n"+
		"\u0005\u0000+\u0003\u0001\u0000\u0000\u0000,1\u0003\u0006\u0003\u0000"+
		"-.\u0005(\u0000\u0000.0\u0003\u0006\u0003\u0000/-\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0005\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0003"+
		"\u0018\f\u000056\u0005\u000b\u0000\u00006\u0007\u0001\u0000\u0000\u0000"+
		"78\u0003\u0018\f\u00008;\u0005\u000b\u0000\u00009:\u0005\u001c\u0000\u0000"+
		":<\u0003\u0016\u000b\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?C\u0005&\u0000\u0000@B\u0003\f\u0006\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"+
		"\'\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HQ\u0003\u000e\u0007\u0000"+
		"IQ\u0003\u0010\b\u0000JQ\u0003\u0012\t\u0000KQ\u0003\u0014\n\u0000LQ\u0003"+
		"\b\u0004\u0000MN\u0003\u0016\u000b\u0000NO\u0005)\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000"+
		"PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000"+
		"\u0000PM\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000ST\u0005$\u0000\u0000TU\u0003\u0016\u000b\u0000UV\u0005%\u0000"+
		"\u0000VY\u0003\n\u0005\u0000WX\u0005\u0007\u0000\u0000XZ\u0003\n\u0005"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u000f\u0001"+
		"\u0000\u0000\u0000[\\\u0005\b\u0000\u0000\\^\u0005$\u0000\u0000]_\u0003"+
		"\u0016\u000b\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0005)\u0000\u0000ac\u0003\u0016\u000b\u0000"+
		"ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0005)\u0000\u0000eg\u0003\u0016\u000b\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005%\u0000"+
		"\u0000ij\u0003\n\u0005\u0000j\u0011\u0001\u0000\u0000\u0000kl\u0005\t"+
		"\u0000\u0000lm\u0005$\u0000\u0000mn\u0003\u0016\u000b\u0000no\u0005%\u0000"+
		"\u0000op\u0003\n\u0005\u0000p\u0013\u0001\u0000\u0000\u0000qs\u0005\n"+
		"\u0000\u0000rt\u0003\u0016\u000b\u0000sr\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005)\u0000\u0000v\u0015"+
		"\u0001\u0000\u0000\u0000wx\u0006\u000b\uffff\uffff\u0000xy\u0005\u001b"+
		"\u0000\u0000y\u0089\u0003\u0016\u000b\bz{\u0005\u000b\u0000\u0000{|\u0007"+
		"\u0000\u0000\u0000|\u0089\u0003\u0016\u000b\u0007}~\u0005\u000b\u0000"+
		"\u0000~\u0089\u0005\"\u0000\u0000\u007f\u0080\u0005\u000b\u0000\u0000"+
		"\u0080\u0089\u0005#\u0000\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083"+
		"\u0003\u0016\u000b\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0089\u0001"+
		"\u0000\u0000\u0000\u0085\u0089\u0005\f\u0000\u0000\u0086\u0089\u0005\r"+
		"\u0000\u0000\u0087\u0089\u0005\u000b\u0000\u0000\u0088w\u0001\u0000\u0000"+
		"\u0000\u0088z\u0001\u0000\u0000\u0000\u0088}\u0001\u0000\u0000\u0000\u0088"+
		"\u007f\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000\u0088"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u0095\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\n\u000b\u0000\u0000\u008b\u008c\u0007\u0001\u0000\u0000\u008c\u0094"+
		"\u0003\u0016\u000b\f\u008d\u008e\n\n\u0000\u0000\u008e\u008f\u0007\u0002"+
		"\u0000\u0000\u008f\u0094\u0003\u0016\u000b\u000b\u0090\u0091\n\t\u0000"+
		"\u0000\u0091\u0092\u0007\u0003\u0000\u0000\u0092\u0094\u0003\u0016\u000b"+
		"\n\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0007\u0004\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000"+
		"\u000f\u001c\u001e\'1;CPY^bfs\u0088\u0093\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}