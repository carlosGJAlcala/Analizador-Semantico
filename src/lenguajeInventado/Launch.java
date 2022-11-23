package lenguajeInventado;

import lenguajeInventado.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


import java.io.IOException;

public class Launch {

    public static void main(String[] args) {

        try {
            String source = "./src/FicherosPrueba/E++.txt";
            CharStream cs = fromFileName(source);
            LenguajeInventadoLexer Lexer = new LenguajeInventadoLexer(cs);
            CommonTokenStream token = new CommonTokenStream(Lexer);
            LenguajeInventadoParser parser = new LenguajeInventadoParser(token);
            ParseTree tree = parser.prog();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            System.out.print(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}
