package csv;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args) {

        try {
            String source = "./src/FicherosPrueba/CSV_01.txt";
            CharStream cs = fromFileName(source);
            gLexer Lexer = new gLexer(cs);
            CommonTokenStream token = new CommonTokenStream(Lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.csvFile();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            System.out.print(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}