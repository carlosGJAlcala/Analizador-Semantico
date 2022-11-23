grammar g;

csvFile: definition? hdr row+ EOF ;

hdr : row ;
definition:LISTDEFINITION SEPARADOR')' NEWLINE ;
row : field (SEPARADOR field)* NEWLINE ;

field
    :TEXTO
    |STRING
    ;
NEWLINE: ('\r'? '\n' | '\r')+ ;
LISTDEFINITION:'List-Definition(';
SEPARADOR:[|;,<>$%&];
TEXTO: ~[|;,\n\r<>$%&"]+ ;
STRING: '"' ('""'|~'"')* '"' ;

