import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ExpLexer lex = new ExpLexer(new ANTLRFileStream("D:\\Compiler\\Resources\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExpParser g = new ExpParser(tokens, 49100, null);
        try {
            g.eval();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}