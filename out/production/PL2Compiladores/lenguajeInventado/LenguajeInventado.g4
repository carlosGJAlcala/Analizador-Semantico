grammar LenguajeInventado;

prog: (fila NEWLINE?)+;

fila :campo( FINLINEA campo)* ;

campo:asignacion
    |comentario
    |mostrar
    |if
    |for
    |actualizar
    ;
asignacion: ASIGNAR nombrevariable=VARIABLE IGUAL expr FINLINEA ;
actualizar:nombrevariable=VARIABLE IGUAL expr FINLINEA ;

expr:operacion
    |expr(operadorcondicional)expr
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
        |operadorcondicional
        |FINCONDICION
        |OPERADORESBOOL
        ;

condicionif: varIzquierda=NUMERO|varIzquierda=VARIABLE
             operadorcond=operadorcondicional
             varDerecha=NUMERO|varIzquierda=VARIABLE

;

operadorcondicional: MAYORIGUAL #Mayor
                     |MENORIGUAL #Menor
                     |IGUALIGUAL #Igualigual
                     |MENOR #Menor
                     |MAYOR #Mayor
                     ;
condicionfor: PARENTESIS ASIGNAR nombrevariable=VARIABLE IGUAL valornum=NUMERO SEPARADOR  VARIABLE operadorcondicional valorlim=NUMERO SEPARADOR VARIABLE INDEC PARENTESIS
;
branch : positivo= IF actualizar
         |negativo= ELSE actualizar
         ;

mostrar: MOSTRAR valorAmostrar FINLINEA ;
valorAmostrar:  valor=NUMERO #NumMostrar
              |valor=STRING #StringMostrar
              |valor=FLOAT #FloatMostrar
              |valor=VARIABLE #VarMostrar
              ;
if:condicionif FINCONDICION branch+ FINCOND;
for:condicionfor FINCONDICION campo+ FINCOND;


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
MAYOR:'>';
MENOR:'<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
IGUALIGUAL: '==';
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