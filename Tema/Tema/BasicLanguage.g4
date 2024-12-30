grammar BasicLanguage;

// Tokenuri
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
STRING: 'string';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';
EQUALS: '=';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';
STRING_LITERAL: '"' (~["\\] | '\\' .)* '"';
NUMBER: [0-9]+ ('.' [0-9]+)?;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip; // Ignore whitespaces
COMMENT: '/*' .*? '*/' -> skip; // Ignore block comments
LINE_COMMENT: '//' ~[\r\n]* -> skip; // Ignore line comments

// Programul principal
program: (function | globalVar | statement)+;

// Function Definition
function:
	type ID LPAREN paramList? RPAREN LBRACE statement+ RBRACE;

// Parameter List
paramList: type ID (COMMA type ID)*;

// Global Variable Declaration
globalVar: type ID EQUALS expression SEMICOLON;

// Type (int, float, etc.)
type: INT | FLOAT | DOUBLE | STRING | VOID;

// Statement Definitions
statement:
	declaration
	| assignment
	| functionCall
	| ifStatement
	| forStatement
	| returnStatement
	| block;

// Declaration (Variable Declaration)
declaration: type ID (COMMA ID)* SEMICOLON;

// Assignment (Variable Assignment)
assignment: ID EQUALS expression SEMICOLON;

// Function Call (Calling a function)
functionCall: ID LPAREN expressionList? RPAREN SEMICOLON;

// If Statement
ifStatement: IF LPAREN expression RPAREN block (ELSE block)?;

// For Statement (for initialization, condition, and increment)
forStatement:
	FOR LPAREN assignment expression SEMICOLON expression RPAREN block;

// Return Statement
returnStatement: RETURN expression SEMICOLON;

// Block (Block of statements enclosed in braces)
block: LBRACE statement+ RBRACE;

// Expression List (List of expressions for function calls)
expressionList: expression (COMMA expression)*;

// Expressions with Precedence and Associativity
expression:
	expression PLUS expression		# PlusExpression
	| expression MINUS expression	# MinusExpression
	| expression TIMES expression	# TimesExpression
	| expression DIVIDE expression	# DivideExpression
	| expression LT expression		# LT
	| expression GT expression		# GT
	| expression EQ expression		# EQ
	| expression NE expression		# NE
	| expression LE expression		# LE
	| expression GE expression		# GE
	| ID							# Id
	| NUMBER						# Number
	| STRING_LITERAL				# StringLiteral
	| LPAREN expression RPAREN		# LparenRparen
	| functionCall					# functionCallEx;