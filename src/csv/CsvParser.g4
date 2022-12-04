parser grammar CsvParser;

options{
    tokenVocab = CsvLexer;
    language = Java;
 }

csvFile:  hdr row+ EOF ;

hdr : fieldCabecera (SEPARADOR fieldCabecera)* NEWLINE ;
row : field (SEPARADOR field)* NEWLINE ;
fieldCabecera:texto=TEXTO;
field
    :texto=TEXTO
    ;