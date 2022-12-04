package csv.control;

import csv.gen.CsvLexer;
import csv.gen.CsvParser;
import csv.modelo.JsonTipo;
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
            JsonTipo ejemplo;
            String source = "./src/FicherosPrueba/CSV_02.txt";
            CharStream cs = fromFileName(source);
            CsvLexer Lexer = new CsvLexer(cs);
            CommonTokenStream token = new CommonTokenStream(Lexer);
            CsvParser parser = new CsvParser(token);
            ParseTree tree = parser.csvFile();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            // System.out.print(tree.toStringTree(parser));
            ejemplo = visitor.getPrimero();
            System.out.println("[");
            String salida = "[";
            while (ejemplo.getSig() != null) {
                salida += ejemplo.toString();
                ejemplo = ejemplo.getSig();
            }
            salida = salida.substring(0, salida.length() - 1);

            salida += "]";
            System.out.println(salida);
            writer(salida);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writer(String texto) {
        String sFichero = "./src/ficherosSalida/outJson.json";
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