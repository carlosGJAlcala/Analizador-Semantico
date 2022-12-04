lexer grammar FormitasLexer;

ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
COLOR:'red'|'orange'|'yellow'|'cyan'|'blue'|'green'|'purple'|'brown'|'black'|'grey'|'white';
FIGURA:'circulo'|'triangulo'|'cuadrado';
APERTURA:'>>>';
CERRADURA:'<<<';
TXTDIM:'imgdim:';
TXTSHPDIM:'shpdim:';
SEPARADOR:',';
BARRA:'|';
CERRAPARENTESIS:')';
TXTCOL:'(color:';
TXTSIZE:'(size:';
CERRARSIZE:'px)';
NUMERO:[0-9]?[0-9]?[0-9];

