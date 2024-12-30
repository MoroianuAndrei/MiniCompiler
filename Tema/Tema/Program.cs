using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.IO;

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
