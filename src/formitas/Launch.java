package formitas;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
//nueva version
    public static void main(String[] args) {

        try {
            String source = "./src/FicherosPrueba/Formitas.txt";
            CharStream cs = fromFileName(source);
            formitasLexer Lexer = new formitasLexer(cs);
            CommonTokenStream token = new CommonTokenStream(Lexer);
            formitasParser parser = new formitasParser(token);
            ParseTree tree = parser.formitasFile();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            System.out.print(visitor.getTs().toString());
            writer(visitor.getTs().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void  writer(String texto){
        String sFichero = "./src/ficherosSalida/formitas.py";
        BufferedWriter bw= null;
        try {
            bw = new BufferedWriter(new FileWriter(sFichero));
            bw.write(texto);
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}