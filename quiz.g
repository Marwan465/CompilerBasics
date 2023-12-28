grammar quiz;

Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;
TYPE 	:	('int' | 'double' | 'string') ;
TrigFunc 
	: ('sin' | 'cos' | 'tan') 	;
MODIFIER 
	:	('private' | 'public' ) 	;
ReturnType:	(TYPE | 'void')  ;
COUT 	:	'cout ';

INCLUDE	:	'#include ' '<' Includes '>' ;
Includes 
	:	'iostream' | 'string';
Return 	:	'return ';

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
    	:	(declartion | ifelse |  loops | assign | expr | include | class )+ ;
    	
 no 	:(Number | DNumber);

declartion 
	: TYPE ID (', ' ID)* ('=' ( expr )* )? (';'|'; ') ;
param 
	: TYPE ID (', ' ID)* ;
print 	:	COUT '<< ' (( ID | no | ('"' ID '"') | '"!"')* 'endl; ');
assign 	:	ID ('=' ( expr )* ) (';'|'; ');
return 	:	Return ID '; ';
ifelse 	: IF '(' conition ')'  '{' (declartion | ifelse |  loops | assign | increment | print)* '}' else?;
else 	: ELSE  '{' (declartion | ifelse |  loops | assign | increment)* '}';

loops 	: ((For '(' declartion  conition  '; ' increment ')'  '{' (declartion | ifelse |  loops | assign | increment | print)+ '}') 
           |(While '(' conition ')' '{'(declartion | ifelse |  loops | assign | increment)+ '}')) ;
include :	(INCLUDE)+ 'using namespace std;';
class 	: include (MODIFIER)? 'class' ID '{' ('public:') (declartion | ifelse |  loops | assign | increment | method )+ '}'  
         ('private:') declartion '}; ';

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
	
