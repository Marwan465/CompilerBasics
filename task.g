grammar task;
Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;
TYPE 	:	('int' | 'double') ;

ID 	:	(('a'..'z')|('A'..'Z'))+ ;

TrigFunc 
	: ('sin' | 'cos' | 'tan') '(' (Number | DNumber) ')'	;

IF
	:	('if ');
ELSE    :        'else ';
For	:	('for ');
While	:	('while ');
Comparators
	:	 ('==' | '>' | '<' | '>=' | '<=' | '!=');
OPERATIONS : ('+' | '-' | '*' | '/');
COMMENT 	: '//'  (.)*  ('\n' )* {skip();};
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;

    prog 
    	:	(declartion | ifelse | comment | loops | assign  )+;
    	
no 	:(Number | DNumber);

declartion 
	: TYPE ID (', ' ID)* ('=' ( no | ( expr  )* ))? '; ' ;
assign 	:	ID ('=' ( no | ( expr )* )) '; ';

ifelse 	: IF '(' conition ')' '{' (declartion | ifelse | comment | loops | assign | increment)+? '} ' else?;

else 	: ELSE  '{' (declartion | ifelse | comment | loops | assign | increment)+? '}';

loops 	: (For '(' declartion  conition  '; ' increment ')' '{' (declartion | ifelse | comment | loops | assign | increment)+? '}') 
           |(While '(' conition ')' '{'(declartion | ifelse | comment | loops | assign | increment)+? '}') ;
           
conition 
	:	(ID | no) Comparators (ID | no);
	
increment 
	:	ID (('++' |'--' )|(('+=' | '-=') no)) '; '?;
	
comment : COMMENT;
expr: multExpr (('+' |'-' ) multExpr)*
;

multExpr
: atom (('*'|'/') atom)*
;

atom: (Number | DNumber | TrigFunc )
| ID
| '(' expr ')'
;