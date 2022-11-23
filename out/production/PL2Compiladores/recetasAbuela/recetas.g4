grammar recetas;

prog: fila+ conclusion EOF ;

fila :receta( NEWLINE receta)*;


receta:ACCIONES  DETERMINANTES? (CANTIDAD UNIDADES PREPOSICIONES)? (ingredientes=INGREDIENTES) PREPOSICIONES DETERMINANTES (utensilios=UTENSILIOS) (PREPOSICIONES (cubiertos=CUBIERTOS))? (PREPOSICIONES TIEMPO)?;
conclusion: CONCLUSION;
UNIDADES:'mg'|'ml'|'g'|'Kg'|'L';
CONCLUSION:'Listo para comer';
//COCINA
INGREDIENTES:'agua'|'huevo'|'macarrones'|'aceite'|'sal'|'pan rallado'|'huitlacoche' |'niscalo' |'seta shiitake' |'seta de cardo' |'seta de chopo' |'trufa' |'garbanzos' |'guisante' |'habas' |'lentejas' |'soja' |'yogur' |'leche' |'helado' |'queso' |'cuajada' |'mantequilla' |'patata' |'lechugas' |'acelga' |'alcachofa' |'batata' |'berenjena' |'brecol' |'calabacín' |'calabaza' |'cardo' |'cebolla' |'cebolla caramelizada' |'cebolleta' |'coles' |'coles de bruselas' |'coliflor' |'endivia' |'tomate' |'zanahoria' |'escarola' |'espárrago' |'espinaca' |'hinojo' |'judías' |'maíz' |'palmito' |'pepino' |'pimiento' |'puerro' |'remolacha' |'melocotones' |'nectarina' |'ciruela' |'fruta del bosque' |'frutos secos' |'membrillo' |'peras' |'manzanas' |'uvas' |'fruta seca' |'frambuesa' |'fresa' |'granada' |'higos' |'kiwi' |'limón' |'mandarina' |'melón' |'naranja' |'cereales' |'harinas' |'panes' |'arroz' |'pasta' |'anchoa' |'bacalao' |'besugo' |'bonito' |'boquerón' |'caballa' |'chicharro' |'corvina' |'dorada' |'lenguado' |'lubina' |'merluza' |'mero' |'palometa' |'pejerrey' |'rape' |'rodaballo' |'salmón' |'sardina' |'trucha' |'cigala' |'gamba' |'langostino' |'percebe' |'almeja' |'calamar' |'mejillón' |'ostra' |'pulpo' |'sepia' |'cordero' |'ovejas' |'ternera' |'buey' |'caballo' |'cabra' |'cerdo' |'vaca' |'avestruz' |'paloma' |'perdiz' |'patos' |'pavos' |'ocas' |'gallinas' |'pollo' |'capones' |'cervezas' |'sidras' |'licores' |'vino blanco' |'vino caliente' |'vino tinto' |'vino rosado' |'vino dulce' |'whisky';
UTENSILIOS:'sarten'|'olla'|'paellera'|'plato';
CUBIERTOS:'tenedor'|'cuchara'|'cuchillo'|'cucharon';
ACCIONES:'Freir'|'Calentar'|'Cocer'|'Remover'|'Voltear'|'Echar'|'Mezclar'|'Rebozar';
CANTIDAD:[0-9]+(','[0-9]+)? ;

//NEXO:DETERMINANTES?PREPOSICIONES;
DETERMINANTES:'la'|'el'|'un'|'dos';
PREPOSICIONES:'a'|'ante'|'bajo'|'cabe'|'con'|'contra'|'de'|'desde'|'en'|'entre'|'hasta'|'hacia'|'para'|'por'|'segun'|'sin'|'so'|'sobre'|'tras'|'durante'|'mediante';

TIEMPO:[0-9][0-9]':'[0-9][0-9];

SEPARADOR:',';
ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+-> skip;