parser grammar FormitasParser;

options{
    tokenVocab = FormitasLexer;
    language = Java;
 }
formitasFile: fila EOF ;

fila : TXTDIM imgdim=NUMERO SEPARADOR TXTSHPDIM shpdim=NUMERO APERTURA row(saltoLinea row)* CERRADURA;

row : campo (SEPARADOR campo)* ;
saltoLinea:BARRA;
campo
    :figura=FIGURA(TXTCOL color=COLOR CERRAPARENTESIS)?( TXTSIZE size=NUMERO CERRARSIZE)?
    ;

//figura:circulo=CIRCULO|cuadrado=CUADRADO|triangulo=TRIANGULO;

