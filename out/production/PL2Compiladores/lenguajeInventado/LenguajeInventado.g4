grammar LenguajeInventado;

prog: (fila NEWLINE?)+;

fila :campo( FINLINEA campo)* ;

campo:asignacion FINLINEA
    |comentario
    |exprcond
    |mostrar
    |for

    ;
asignacion: ASIGNAR VARIABLE IGUAL expr  ;
aztulizar:VARIABLE IGUAL expr FINLINEA ;

expr:operacion
    |expr(OPERADORESCOND)expr
    |NUMERO
    |PARENTESIS expr PARENTESIS
    |VARIABLE
    |VARIABLE OPERADORESBOOL VARIABLE
    |BOOLTIPO OPERADORESBOOL BOOLTIPO
    ;
operacion:lef=operacion PLUS right=NUMERO #Plus
         |left=operacion  MINUS right=NUMERO #Minus
         |left=operacion  POR right=NUMERO #Mul
         |left=operacion  DIVISOR right=NUMERO #Div
         |number=NUMERO #Number
         |variable=VARIABLE #Variable;

comentario: COMENTARIOABRIR textos* COMENTARIOCERRAR
            |COMENTARIOLINEA textos*
            |COMENTARIOALMOHADILLA textos*
            ;
textos: TEXTO+
        |PLUS|MINUS|DIVISOR|POR
        |OPERADORESCOND
        |FINCONDICION
        |OPERADORESBOOL
        ;
// while  y if else
exprcond:condicion?  IF?  (asignacion FINLINEA|aztulizar)*(ELSE (VARIABLE IGUAL expr FINLINEA ))? FINCOND;
condicion:(VARIABLE OPERADORESCOND)? (VARIABLE OPERADORESBOOL)? (VARIABLE BOOLTIPO)? (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) FINCONDICION?;

mostrar: MOSTRAR (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) ?;
for:PARENTESIS asignacion SEPARADOR condicion SEPARADOR VARIABLE INDEC PARENTESIS  FINCONDICION exprcond;



ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;

PARENTESIS:'('|')';
IGUAL:'=';
//MULTIUSOS
BOOLTIPO: 'TRUE'|'FALSE';
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

PLUS:'+';
MINUS:'-';
DIVISOR:'/';
POR:'*';


//BOOLEANOS
OPERADORESBOOL: '&&'|'||'|'!'|'&'|'|'|'^';
OPERADORESBOOL2: 'AND'|'OR'|'NOT'|'XOR';