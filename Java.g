grammar Java;


Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;
TYPE 	:	('int' | 'double' | 'string') ;
TrigFunc 
	: ('sin' | 'cos' | 'tan') 	;

ReturnType:	(TYPE | 'void')  ;
PRINT 	:	'print ';

IMPORT	:	'import '  IMPORTs  ;
IMPORTs 
	:	'java.' ID;
Return 	:	'return ';

ID 	:	(('a'..'z')|('A'..'Z'))+ ;


IF
	:	('if ');
ELSE    :        ('else ');
For	:	('for ');
While	:	('while ');
Comparators
	:	 ('==' | '>' | '<' | '>=' | '<=' | '!=');

COMMENT 	: '//'  ~('\r'|'\n'|'\r\n')*  {skip();};
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;

start 	:	prog;
 prog 
    	:	(declartion | ifelse |  loops | assign | expr  | class )+ ;
    	
 no 	:(Number | DNumber);

declartion 
	: TYPE ID (', ' ID)* ('=' ( expr )* )? (';'|'; ') ;
param 
	: TYPE ID (', ' ID)* ;
print 	:	PRINT  (( ID | no | ('"' ID '"') | '"!"')* '; ');
assign 	:	ID ('=' ( expr )* ) (';'|'; ');
return 	:	Return ID '; ';
ifelse 	: IF '(' conition ')'  '{' (declartion | ifelse |  loops | assign | increment | print)* '}' else?;
else 	: ELSE  '{' (declartion | ifelse |  loops | assign | increment)* '}';

loops 	: ((For '(' declartion  conition  '; ' increment ')'  '{' (declartion | ifelse |  loops | assign | increment | print)+ '}') 
           |(While '(' conition ')' '{'(declartion | ifelse |  loops | assign | increment)+ '}')) ;

class 	: IMPORT? 'class' ID '{'  (declartion | ifelse |  loops | assign | increment | method )+ '}'  
          declartion '}; ';

method 	:	ReturnType ID '(' param? ')' '{' (declartion | ifelse |  loops | assign | increment | print )*  return?'}';
     

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
	
