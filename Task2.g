grammar Task2;

prog:   stat+ ;
                
stat:   
        expr 

   
    ;

expr: multExpr (('+' |'-' ) multExpr)* {System.out.println("ADD/SUB");}
;
multExpr
: atom (('*'|'/') atom)* {System.out.println("MULT/SUB");}
;
atom: (Number | DNumber | TrigFunc ) {System.out.println("Braces");}
| ID
| '(' expr ')'
;

ID  :   ('a'..'z'|'A'..'Z')+ ;
Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;

TrigFunc 
	: ('sin' | 'cos' | 'tan') '(' (Number | DNumber) ')'	;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
