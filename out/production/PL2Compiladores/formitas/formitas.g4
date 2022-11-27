grammar formitas;

formitasFile: fila EOF ;

fila : IMGDIM','SHPDIM APERTURA row(saltoLinea row)* CERRADURA;

row : campo (SEPARADOR campo)* ;
saltoLinea:'|';
campo
    :figura=FIGURA('(color:'color=COLOR')')?('(size:'size=TAMANIO'px)')?
    ;

//figura:circulo=CIRCULO|cuadrado=CUADRADO|triangulo=TRIANGULO;

TAMANIO:[0-9]?[0-9]?[0-9];
ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
COLOR:'red'|'orange'|'yellow'|'cyan'|'blue'|'green'|'purple'|'brown'|'black'|'grey'|'white';
FIGURA:'circulo'|'triangulo'|'cuadrado';
APERTURA:'>>>';
CERRADURA:'<<<';
IMGDIM:'imgdim:'NUMERO;
SHPDIM:'shpdim:'NUMERO;
SEPARADOR:',';
NUMERO:[0-9]+;

