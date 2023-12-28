grammar loops;

Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;
TYPE 	:	('int' | 'double') ;
TrigFunc 
	: ('sin' | 'cos' | 'tan') 	;


ID 	:	(('a'..'z')|('A'..'Z'))+ ;

IF
	:	('if ');
ELSE    :        ('else ');
For	:	('for ');
While	:	('while ');
Comparators
	:	 ('==' | '>' | '<' | '>=' | '<=' | '!=');
OPERATIONS : ('+' | '-' | '*' | '/');
COMMENT 	: '//'  ~('\r'|'\n'|'\r\n')*  {skip();};
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
start 	:	prog;
 prog 
    	:	(declartion | ifelse |  loops | assign | expr )+ ;
    	
 no 	:(Number | DNumber);

declartion 
	: TYPE ID (', ' ID)* ('=' ( expr )* )? (';'|'; ') ;
assign 	:	ID ('=' ( expr )* ) (';'|'; ');

ifelse 	: IF '(' conition ')'  '{' (declartion | ifelse |  loops | assign | increment)* '}' else?;
else 	: ELSE  '{' (declartion | ifelse |  loops | assign | increment)* '}';

loops 	: ((For '(' declartion  conition  '; ' increment ')'  '{' (declartion | ifelse |  loops | assign | increment)* '}') 
           |(While '(' conition ')' '{'(declartion | ifelse |  loops | assign | increment)+ '}')) ;
           

conition 
	:	(ID | no) Comparators (ID | no);
	
increment 
	:	ID (('++' |'--' ) | (('+=' | '-=') no)) ';'?;
expr: multExpr (('+' |'-' ) multExpr)*
;

multExpr
: atom (('*'|'/') atom)*
;

atom: (Number | DNumber | TrigFunc '(' (expr) ')' )
| ID
| '(' expr ')'
;
	
