grammar g;

csvFile: definition? hdr row+ EOF ;

hdr : fieldCabecera (SEPARADOR fieldCabecera)* NEWLINE ;
definition:LISTDEFINITION SEPARADOR')' NEWLINE ;
row : field (SEPARADOR field)* NEWLINE ;
fieldCabecera:texto=TEXTO;
field
    :texto=TEXTO
    ;
NEWLINE: ('\r'? '\n' | '\r')+ ;
LISTDEFINITION:'List-Definition(';
SEPARADOR:[|;,<>$%&];
//un texto puede ser un string o cualquier cosa
TEXTO: ~[|;,\n\r<>$%&"]+ |'"' ('""'|~'"')* '"';
//STRING: '"' ('""'|~'"')* '"' ;

