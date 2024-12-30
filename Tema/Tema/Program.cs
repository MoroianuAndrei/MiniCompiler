using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.IO;

namespace Tema
{
    public class Evaluator : BasicLanguageBaseVisitor<object>
    {
        private readonly Dictionary<string, object> variables = new Dictionary<string, object>();
        private readonly Dictionary<string, Func<int, int, int>> functions = new Dictionary<string, Func<int, int, int>>();

        public Evaluator()
        {
            // Definim funcțiile (e.g., addIntegers, divideIntegers)
            functions["addIntegers"] = (a, b) => a + b;
            functions["divideIntegers"] = (a, b) => b == 0 ? 0 : a / b;
        }

        // Vizualizează apelurile de funcții
        public override object VisitFunctionCall(BasicLanguageParser.FunctionCallContext context)
        {
            string functionName = context.ID().GetText();
            var parameters = new List<object>();

            // Verificăm dacă funcția are parametri
            if (context.expressionList() != null)
            {
                foreach (var expr in context.expressionList().expression())
                {
                    parameters.Add(Visit(expr));
                }
            }

            // Evaluăm funcția
            if (functions.TryGetValue(functionName, out var func))
            {
                // Dacă funcția este înregistrată, o apelăm
                return func((int)parameters[0], (int)parameters[1]);
            }
            else
            {
                throw new Exception($"Funcția {functionName} nu este definită!");
            }
        }

        // Evaluăm expresiile aritmetice
        public override object VisitPlusExpression(BasicLanguageParser.PlusExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            if (left is int && right is int)
            {
                return (int)left + (int)right;
            }
            throw new Exception("Tipul de date nu este valid pentru adunare.");
        }


        public override object VisitMinusExpression(BasicLanguageParser.MinusExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            return (int)left - (int)right;
        }

        public override object VisitTimesExpression(BasicLanguageParser.TimesExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            return (int)left * (int)right;
        }

        public override object VisitDivideExpression(BasicLanguageParser.DivideExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            return (int)left / (int)right;
        }

        // Evaluăm variabile
        public override object VisitId(BasicLanguageParser.IdContext context)
        {
            string id = context.GetText();
            if (variables.ContainsKey(id))
            {
                return variables[id];
            }
            else
            {
                throw new Exception($"Variabila '{id}' nu este definită în contextul curent!");
            }
        }

        // Evaluăm numere
        public override object VisitNumber(BasicLanguageParser.NumberContext context)
        {
            return int.Parse(context.GetText());
        }

        // Evaluăm stringuri
        public override object VisitStringLiteral(BasicLanguageParser.StringLiteralContext context)
        {
            return context.GetText().Trim('"');
        }

        // Evaluăm blocuri de cod
        public override object VisitBlock(BasicLanguageParser.BlockContext context)
        {
            object result = null;
            foreach (var statement in context.statement())
            {
                result = Visit(statement);
            }
            return result;
        }

        // Gestionăm atribuirea valorilor
        public override object VisitAssignment(BasicLanguageParser.AssignmentContext context)
        {
            string varName = context.ID().GetText();
            var value = Visit(context.expression()); // Evaluăm expresia din partea dreaptă
            variables[varName] = value; // Atribuim valoarea în dicționarul de variabile
            return null;  // Nu returnăm niciun rezultat aici
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Citirea sursei dintr-un fișier
            string sourceCode = File.ReadAllText(@"..\..\..\program.txt");

            // Lexer pentru sursa
            var inputStream = new AntlrInputStream(sourceCode);
            var lexer = new BasicLanguageLexer(inputStream);
            var tokenStream = new CommonTokenStream(lexer);

            // Parser pentru sursa
            var parser = new BasicLanguageParser(tokenStream);
            var tree = parser.program();  // Parsează întregul program

            // Creăm un evaluator
            var evaluator = new Evaluator();

            // Vizualizăm și evaluăm arborele sintactic
            evaluator.Visit(tree);
        }
    }
}