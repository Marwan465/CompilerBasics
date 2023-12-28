grammar Exp;
@header {
import java.util.HashMap;
}
@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}
prog
    :    stat+
    ;

stat: 
   ID {System.out.println($ID.value);}
	|	
   TYPE ID '=' assign ';'{memory.put($ID.text, new Integer($assign.value));} 
        |
   If check

;
assign returns [int value]
    :   Number {$value = Integer.parseInt($Number.text);} 
       
         | mult {$value = $mult.value;}
         ( '+' mult {$value += $mult.value;}
         | '-'  mult {$value -= $mult.value;}
         )*
    ;

mult returns [int value]
: ID  {$value = memory.get($ID.text);} 
('*' ID  {$value *= memory.get($ID.text);} 
| '/' ID  {$value /= memory.get($ID.text);}
)*
;
check
:
'(' ID  ( 
   (G | S | E) & Number ')')*
;

Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;
TYPE 
    	:	('int' | 'double')
    	;
ID :	('a'..'z'|'A'..'Z')+
	;
If :	'if'
	;
Else 	:'else'
	;
G
	:'>'
	;
S 	:'<' ;

E	:'=';
/* We're going to ignore all white space characters */
WS  
   :   (' ' | '\t' | '\r'| '\n') {skip();}
    ;