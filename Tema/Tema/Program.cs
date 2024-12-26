using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        // Specifică calea către fișierul sursă
        string inputFilePath = @"C:\path\to\program.txt";

        if (!File.Exists(inputFilePath))
        {
            Console.WriteLine("Fișierul nu există!");
            return;
        }

        try
        {
            // Citește fișierul sursă
            var inputStream = new AntlrFileStream(inputFilePath);

            // Inițializează Lexer și Parser
            var lexer = new BasicLanguageLexer(inputStream);
            var tokens = new CommonTokenStream(lexer);
            var parser = new BasicLanguageParser(tokens);

            // Adaugă un listener pentru erori
            parser.RemoveErrorListeners(); // Elimină listener-ul default
            var errorListener = new CustomErrorListener();
            parser.AddErrorListener(errorListener);

            // Rulează parsarea pentru regula 'program'
            IParseTree tree = parser.program();

            if (errorListener.HasErrors)
            {
                Console.WriteLine("Erorile găsite în program:");
                foreach (var error in errorListener.Errors)
                {
                    Console.WriteLine(error);
                }
                return;
            }

            // Afișează arborele sintactic rezultat
            Console.WriteLine("Arborele sintactic al programului:");
            var walker = new ParseTreeWalker();
            walker.Walk(new TreePrinter(parser), tree);
        }
        catch (IOException ex)
        {
            Console.WriteLine($"Eroare la citirea fișierului: {ex.Message}");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"A apărut o eroare neașteptată: {ex.Message}");
        }
    }
}

// Listener pentru afișarea arborelui într-un format prietenos
class TreePrinter : BasicLanguageBaseListener
{
    private int depth = 0;
    private readonly BasicLanguageParser _parser;

    public TreePrinter(BasicLanguageParser parser)
    {
        _parser = parser;
    }

    private void PrintIndent()
    {
        Console.Write(new string(' ', depth * 2));
    }

    public override void EnterEveryRule(ParserRuleContext context)
    {
        PrintIndent();
        string ruleName = _parser.RuleNames[context.RuleIndex];
        Console.WriteLine($"Intrăm în regula: {ruleName}");
        depth++;
    }

    public override void ExitEveryRule(ParserRuleContext context)
    {
        depth--;
        PrintIndent();
        string ruleName = _parser.RuleNames[context.RuleIndex];
        Console.WriteLine($"Ieșim din regula: {ruleName}");
    }
}

// Listener personalizat pentru erori
class CustomErrorListener : BaseErrorListener
{
    public List<string> Errors { get; } = new List<string>();
    public bool HasErrors => Errors.Count > 0;

    public override void SyntaxError(
        IRecognizer recognizer,
        IToken offendingSymbol,
        int line,
        int charPositionInLine,
        string msg,
        RecognitionException e = null)
    {
        string error = $"Eroare de sintaxă la linia {line}, poziția {charPositionInLine}: {msg}";
        Errors.Add(error);
    }
}
