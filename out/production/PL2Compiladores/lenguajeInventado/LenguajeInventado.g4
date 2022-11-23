grammar LenguajeInventado;

prog: (fila NEWLINE?)+ EOF ;

fila :campo( FINLINEA campo)* ;

campo:asignacion FINLINEA
    |comentario
    |exprcond
    |mostrar
    |for

    ;
asignacion: ASIGNAR VARIABLE IGUAL expr  ;

expr:
    |expr OPERACION expr
    |expr(OPERADORESCOND)expr
    |NUMERO
    |PARENTESIS expr PARENTESIS
    | OPERACION PARENTESIS (expr(SEPARADOR expr)*) PARENTESIS
    | VARIABLE
    ;

comentario: COMENTARIOABRIR textos* COMENTARIOCERRAR
            |COMENTARIOLINEA textos*
            |COMENTARIOALMOHADILLA textos*
            ;
textos: TEXTO+
        |OPERACION
        |OPERADORESCOND
        |FINCONDICION
        ;
// while  y if else
exprcond:condicion?  IF?  (VARIABLE IGUAL expr FINLINEA )+(ELSE (VARIABLE IGUAL expr FINLINEA ))? FINCOND;
condicion:VARIABLE OPERADORESCOND (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) FINCONDICION?;

mostrar: MOSTRAR (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) ?;
for:PARENTESIS asignacion SEPARADOR condicion SEPARADOR VARIABLE INDEC PARENTESIS  FINCONDICION exprcond;



ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;

PARENTESIS:'('|')';
IGUAL:'=';
//MULTIUSOS
FLOAT:NUMERO'.'NUMERO;
NUMERO:[0-9]+;
VARIABLE:[a-zA-Z];
FINLINEA:';P';
STRING: '"' ('""'|~'"')* '"' ;
//COMENTARIOS
COMENTARIOABRIR: '/*';
COMENTARIOCERRAR: '*/';
COMENTARIOLINEA: '//';
COMENTARIOALMOHADILLA:'#';
//EXPRESIONES MATEMATICAS
SEPARADOR:',';
INTRO:'\r\n';
INDEC:('++'|'--');
//CONDICIONES
OPERADORESCOND:'<'|'>'|'==';
FINCONDICION:'???'|'$$$'|'%%%';
IF:'si'ESPACIO*'->' ;
ELSE:'no'ESPACIO*'->';
FINCOND:'terminar' ;
//MOSTRARVALORES

VALORES:NUMERO|STRING|FLOAT|VARIABLE;
ASIGNAR:'asignar';
MOSTRAR:'mostrar';
TEXTO: [a-zA-Z]+;
OPERACION:'cos'|'sen'|'tan'|'+'|'-'|'/'|'*';//mejora