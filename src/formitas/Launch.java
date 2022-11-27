package formitas;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}