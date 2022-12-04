grammar formitas;

formitasFile: fila EOF ;

fila : TXTDIM imgdim=NUMERO',' TXTSHPDIM shpdim=NUMERO APERTURA row(saltoLinea row)* CERRADURA;

row : campo (SEPARADOR campo)* ;
saltoLinea:'|';
campo
    :figura=FIGURA('(color:'color=COLOR')')?('(size:'size=NUMERO'px)')?
    ;

//figura:circulo=CIRCULO|cuadrado=CUADRADO|triangulo=TRIANGULO;


ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
COLOR:'red'|'orange'|'yellow'|'cyan'|'blue'|'green'|'purple'|'brown'|'black'|'grey'|'white';
FIGURA:'circulo'|'triangulo'|'cuadrado';
APERTURA:'>>>';
CERRADURA:'<<<';
TXTDIM:'imgdim:';
TXTSHPDIM:'shpdim:';
SEPARADOR:',';
NUMERO:[0-9]?[0-9]?[0-9];

