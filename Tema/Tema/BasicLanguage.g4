grammar BasicLanguage;

// Regula principală
program: statement* EOF;

statement: declaration | controlStructure | COMMENT;

declaration: type VARIABLE_NAME EQUALS value SEMICOLON;

type: 'int' | 'float' | 'string';

value: INTEGER_VALUE | FLOAT_VALUE | STRING_VALUE;

controlStructure:
	'if' '(' condition ')' '{' statement* '}'
	| 'while' '(' condition ')' '{' statement* '}';

condition: VARIABLE_NAME REL_OP value;

REL_OP: '<' | '>' | '==' | '<=' | '>=' | '!=';

// Tokens
EQUALS: '=';
SEMICOLON: ';';
INTEGER_VALUE: [0-9]+;
FLOAT_VALUE: [0-9]+ '.' [0-9]+;
STRING_VALUE: '"' .*? '"';
VARIABLE_NAME: [a-zA-Z][a-zA-Z0-9]*;
COMMENT: '//' ~[\r\n]* -> skip;

WS: [ \t\r\n]+ -> skip;