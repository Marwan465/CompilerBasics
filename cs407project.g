grammar cs407project;

options{
output=AST; }
tokens{Goal;
MainClass;
Statement;
Expr1;
Lf;
Type;
ClassDeclaration;
VarDeclaration;
MethodDeclaration;
Expression;
}

@members {
	protected void mismatch(IntStream input, int ttype, BitSet follow)throws RecognitionException {
	throw new MismatchedTokenException(ttype, input);
	}
	public Object recoverFromMismatchedSet(IntStream input,
	RecognitionException e, BitSet follow)	throws RecognitionException {
	throw e;
	}
}
// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
 }


goal	: mainClass classDeclaration*
	-> ^(Goal mainClass classDeclaration*);

mainClass
	: 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '['']' Identifier ')' '{' statement)* '}'  '}'
	-> ^(MainClass'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '['']' Identifier ')' '{' statement* '}'  '}');

classDeclaration
	: 'class' Identifier   ('extends' Identifier)? '{' varDeclaration* methodDeclaration* '}'
	-> ^(ClassDeclaration 'class' Identifier   ('extends' Identifier)? '{' varDeclaration* methodDeclaration* '}');

varDeclaration	: type Identifier ';'
	-> ^(VarDeclaration type Identifier ';');

methodDeclaration
	: 'public' type Identifier '(' (type Identifier (',' type Identifier)*)? ')''{'varDeclaration* statement* 'return' expression ';' '}'
	-> ^(MethodDeclaration 'public' type Identifier '(' (type Identifier (',' type Identifier)*)? ')''{'varDeclaration* statement* 'return' expression ';' '}');

statement
	: '{' statement* '}' -> ^(Statement '{' statement* '}')
	| 'if''(' expression ')' statement 'else' statement -> ^(Statement 'if''(' expression ')' statement 'else' statement)
	| 'while''(' expression ')' statement -> ^(Statement 'while''(' expression ')' statement)
	| 'System.out.println''(' expression')'';' -> ^(Statement 'System.out.println''(' expression')'';')
	| Identifier '=' expression';' -> ^(Statement Identifier '=' expression';')
	| Identifier '['expression']' '=' expression ';' -> ^(Statement Identifier '['expression']' '=' expression ';')
	;
	
expression	: INT expr1* -> ^(Expression INT expr1*)
	| 'true' expr1* -> ^(Expression 'true' expr1*)
	| 'false' expr1* -> ^(Expression 'false' expr1*)
	| Identifier expr1* -> ^(Expression Identifier expr1*)
	| 'this' expr1* -> ^(Expression 'this' expr1*)
	| 'new' 'int''['expression']'  expr1* -> ^(Expression 'new' 'int''['expression']'  expr1*)
	| 'new' Identifier '('')'  expr1* -> ^(Expression 'new' Identifier '('')'  expr1*)
	| '!'expression  expr1* -> ^(Expression '!'expression  expr1*)
	| '('expression')'  expr1* -> ^(Expression '('expression')'  expr1*)
	;
	
expr1   : Operation expression -> ^(Expr1 Operation expression)
	| '[' expression ']' -> ^(Expr1 '[' expression ']')
	| '.' lf -> ^(Expr1 '.' lf)
	;

lf	: 'length' -> ^(Lf 'length')
	| Identifier '(' (expression (',' expression)* )? ')' -> ^(Lf Identifier '(' (expression (',' expression)* )? ')')
	;

type	: 'int' '['']' -> ^(Type 'int' '['']')
	| 'boolean' -> ^(Type 'boolean')
	| 'int' -> ^(Type 'int')
	| Identifier -> ^(Type Identifier)
	;

Operation : '&&' | '<' | '+' | '-' | '*';

INT	: '0'..'9'+;

	
Identifier  	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*  ;


COMMENT
    	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	;

WS  	: (' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;
