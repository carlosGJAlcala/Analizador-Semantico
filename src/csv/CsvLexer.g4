lexer grammar CsvLexer;
NEWLINE: ('\r'? '\n' | '\r')+ ;
LISTDEFINITION:'List-Definition(';
SEPARADOR:[|;,<>$%&];
//un texto puede ser un string o cualquier cosa
TEXTO: ~[|;,\n\r<>$%&"]+ |'"' ('""'|~'"')* '"';
//STRING: '"' ('""'|~'"')* '"' ;

