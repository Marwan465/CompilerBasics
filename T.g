grammar T;

prog:   stat+ ;
                
stat:   
        expr 

   
    ;

expr 
    :   INT multExpr ( '+' INT multExpr |   '-'  INT multExpr )*
	;

multExpr 
    :     ('*'  atom  | '/'  atom)*
    ; 

atom
    :
       '(' expr ')'
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
