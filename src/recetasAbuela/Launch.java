package recetasAbuela;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {
        try {
            String source = "./src/FicherosPrueba/AbuelaRecetaPrueba2.txt";
            CharStream cs = fromFileName(source);
            recetasLexer Lexer = new recetasLexer(cs);
            CommonTokenStream token = new CommonTokenStream(Lexer);
            recetasParser parser = new recetasParser(token);
            ParseTree tree = parser.prog();

            MyVisitor visitor = new MyVisitor();

            visitor.visit(tree);

            System.out.print(tree.toStringTree(parser));
            RecetaTS ts= visitor.getTs();
            //muestro todas las recetas
            RecetaTS tsAnte=ts.getAnterior();
            while(tsAnte!=null){
                System.out.println(ts.toString());
                ts=tsAnte;
                tsAnte=ts.getAnterior();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
