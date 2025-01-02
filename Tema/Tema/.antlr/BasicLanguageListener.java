// Generated from d:/MiniCompiler/Tema/Tema/BasicLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicLanguageParser}.
 */
public interface BasicLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BasicLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BasicLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BasicLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BasicLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BasicLanguageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BasicLanguageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BasicLanguageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BasicLanguageParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BasicLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BasicLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BasicLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BasicLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BasicLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BasicLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BasicLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BasicLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(BasicLanguageParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(BasicLanguageParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BasicLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BasicLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BasicLanguageParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BasicLanguageParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BasicLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BasicLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BasicLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BasicLanguageParser.TypeContext ctx);
}