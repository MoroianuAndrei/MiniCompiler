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

function:
	type ID LPAREN paramList? RPAREN LBRACE statement+ RBRACE;

paramList: type ID (COMMA type ID)*;

globalVar: type ID EQUALS expression SEMICOLON;

type: INT | FLOAT | DOUBLE | STRING | VOID;

statement:
	declaration
	| assignment
	| functionCall
	| ifStatement
	| forStatement
	| returnStatement
	| block;

declaration: type ID (COMMA ID)* SEMICOLON;

assignment: ID EQUALS expression SEMICOLON;

functionCall: ID LPAREN expressionList? RPAREN SEMICOLON;

ifStatement: IF LPAREN expression RPAREN block (ELSE block)?;

forStatement:
	FOR LPAREN assignment expression SEMICOLON expression RPAREN block;

returnStatement: RETURN expression SEMICOLON;

block: LBRACE statement+ RBRACE;

expressionList: expression (COMMA expression)*;

expression:
	expression PLUS expression
	| expression MINUS expression
	| expression TIMES expression
	| expression DIVIDE expression
	| expression LT expression
	| expression GT expression
	| expression EQ expression
	| expression NE expression
	| ID
	| NUMBER
	| STRING_LITERAL
	| LPAREN expression RPAREN
	| functionCall;