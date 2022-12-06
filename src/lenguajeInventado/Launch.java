package lenguajeInventado;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

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
            writer(visitor.getGenerador().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writer(String texto) {
        String sFichero = "./src/ficherosSalida/genJasmin.j";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(sFichero));
            bw.write(texto);
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
