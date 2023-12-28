grammar task4;

Number
    :    (('0') | (('1'..'9')('0'..'9')*)) ;
DNumber :	Number '.' Number;
TYPE 	:	('int' | 'double') ;

ID 	:	(('a'..'z')|('A'..'Z'))+ ;



