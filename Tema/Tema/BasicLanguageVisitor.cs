//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:/Users/andre/Desktop/Facultate Informatica/Licenta/Anul 2/Semestrul 1/Limbaje Formale si Compilatoare/Tema Obligatorii/Tema 2/MiniCompiler/Tema/Tema/BasicLanguage.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="BasicLanguageParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public interface IBasicLanguageVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] BasicLanguageParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunction([NotNull] BasicLanguageParser.FunctionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.paramList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParamList([NotNull] BasicLanguageParser.ParamListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.globalVar"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGlobalVar([NotNull] BasicLanguageParser.GlobalVarContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitType([NotNull] BasicLanguageParser.TypeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] BasicLanguageParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] BasicLanguageParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] BasicLanguageParser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunctionCall([NotNull] BasicLanguageParser.FunctionCallContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStatement([NotNull] BasicLanguageParser.IfStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForStatement([NotNull] BasicLanguageParser.ForStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStatement([NotNull] BasicLanguageParser.ReturnStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] BasicLanguageParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.expressionList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpressionList([NotNull] BasicLanguageParser.ExpressionListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="BasicLanguageParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] BasicLanguageParser.ExpressionContext context);
}