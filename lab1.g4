grammar lab1;
Int : 'int';
Double : 'double';
ID   : 	(('a'..'z')|('A'..'Z'))+;
Semi  : ';' ;
Equal : '=' ;
Num  : '0'..'9'+ ;
Dnum : Num '.' Num;
Cast : '(int)';
Signs : ('+'|'-'|'*'|'/');
Comparators : ('==' | '>' | '<' | '>=' | '<=' | '!=');
COMMENT 	: '//'  ~('\r'|'\n')*  -> skip;
WS  :   (' '|'\t'|'\n'|'\r')+ -> skip;

start : (declare | sum | if)+;
no : (Num | Dnum ) ;
declare : (Type ID Semi | Int ID Equal ((Cast (ID|no))|Num) Semi | Double ID Equal no Semi );
sum : ID Signs ID Semi;
if 	: 'if' '(' conition ')'  '{' (declare | if |  sum )* '}' else?;
else 	: 'else'  '{' (declare | if |  sum )* '}';
conition :	(ID | no) Comparators (ID | no);

//if(x==1) {
  //    if(y==x) {
  //    int x =5;}
  //    else {x+y;}
  //     };







