// $ANTLR 3.4 D:\\Compiler\\lap\\Resources\\cs407project.g 2018-05-01 16:24:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class cs407projectLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int COMMENT=4;
    public static final int ClassDeclaration=5;
    public static final int Expr1=6;
    public static final int Expression=7;
    public static final int Goal=8;
    public static final int INT=9;
    public static final int Identifier=10;
    public static final int Lf=11;
    public static final int MainClass=12;
    public static final int MethodDeclaration=13;
    public static final int Operation=14;
    public static final int Statement=15;
    public static final int Type=16;
    public static final int VarDeclaration=17;
    public static final int WS=18;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public cs407projectLexer() {} 
    public cs407projectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public cs407projectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\lap\\Resources\\cs407project.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:2:7: ( '!' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:3:7: ( '(' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:4:7: ( ')' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:5:7: ( ',' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:6:7: ( '.' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:6:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:7:7: ( ';' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:8:7: ( '=' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:9:7: ( 'String' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:9:9: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:10:7: ( 'System.out.println' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:10:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:11:7: ( '[' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:12:7: ( ']' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:13:7: ( 'boolean' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:13:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:14:7: ( 'class' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:14:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:15:7: ( 'else' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:15:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:16:7: ( 'extends' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:16:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:17:7: ( 'false' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:17:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:18:7: ( 'if' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:18:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:19:7: ( 'int' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:19:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:20:7: ( 'length' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:20:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:21:7: ( 'main' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:21:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:22:7: ( 'new' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:22:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:23:7: ( 'public' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:23:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:24:7: ( 'return' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:24:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:25:7: ( 'static' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:25:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:26:7: ( 'this' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:26:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:27:7: ( 'true' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:27:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:28:7: ( 'void' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:28:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:29:7: ( 'while' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:29:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:30:7: ( '{' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:31:7: ( '}' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "Operation"
    public final void mOperation() throws RecognitionException {
        try {
            int _type = Operation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:88:11: ( '&&' | '<' | '+' | '-' | '*' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt1=1;
                }
                break;
            case '<':
                {
                alt1=2;
                }
                break;
            case '+':
                {
                alt1=3;
                }
                break;
            case '-':
                {
                alt1=4;
                }
                break;
            case '*':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:88:13: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:88:20: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:88:26: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 4 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:88:32: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 5 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:88:38: '*'
                    {
                    match('*'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Operation"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:90:5: ( ( '0' .. '9' )+ )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:90:7: ( '0' .. '9' )+
            {
            // D:\\Compiler\\lap\\Resources\\cs407project.g:90:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\cs407project.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:93:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:93:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiler\\lap\\Resources\\cs407project.g:93:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\cs407project.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:97:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:97:8: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // D:\\Compiler\\lap\\Resources\\cs407project.g:97:13: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\cs407project.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // D:\\Compiler\\lap\\Resources\\cs407project.g:97:27: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\cs407project.g:97:27: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\cs407project.g:100:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Compiler\\lap\\Resources\\cs407project.g:100:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\Compiler\\lap\\Resources\\cs407project.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | Operation | INT | Identifier | COMMENT | WS )
        int alt6=35;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:10: T__19
                {
                mT__19(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:16: T__20
                {
                mT__20(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:22: T__21
                {
                mT__21(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:28: T__22
                {
                mT__22(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:34: T__23
                {
                mT__23(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:40: T__24
                {
                mT__24(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:46: T__25
                {
                mT__25(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:52: T__26
                {
                mT__26(); 


                }
                break;
            case 9 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:58: T__27
                {
                mT__27(); 


                }
                break;
            case 10 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:64: T__28
                {
                mT__28(); 


                }
                break;
            case 11 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:70: T__29
                {
                mT__29(); 


                }
                break;
            case 12 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:76: T__30
                {
                mT__30(); 


                }
                break;
            case 13 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:82: T__31
                {
                mT__31(); 


                }
                break;
            case 14 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:88: T__32
                {
                mT__32(); 


                }
                break;
            case 15 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:94: T__33
                {
                mT__33(); 


                }
                break;
            case 16 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:100: T__34
                {
                mT__34(); 


                }
                break;
            case 17 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:106: T__35
                {
                mT__35(); 


                }
                break;
            case 18 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:112: T__36
                {
                mT__36(); 


                }
                break;
            case 19 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:118: T__37
                {
                mT__37(); 


                }
                break;
            case 20 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:124: T__38
                {
                mT__38(); 


                }
                break;
            case 21 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:130: T__39
                {
                mT__39(); 


                }
                break;
            case 22 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:136: T__40
                {
                mT__40(); 


                }
                break;
            case 23 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:142: T__41
                {
                mT__41(); 


                }
                break;
            case 24 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:148: T__42
                {
                mT__42(); 


                }
                break;
            case 25 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:154: T__43
                {
                mT__43(); 


                }
                break;
            case 26 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:160: T__44
                {
                mT__44(); 


                }
                break;
            case 27 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:166: T__45
                {
                mT__45(); 


                }
                break;
            case 28 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:172: T__46
                {
                mT__46(); 


                }
                break;
            case 29 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:178: T__47
                {
                mT__47(); 


                }
                break;
            case 30 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:184: T__48
                {
                mT__48(); 


                }
                break;
            case 31 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:190: Operation
                {
                mOperation(); 


                }
                break;
            case 32 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:200: INT
                {
                mINT(); 


                }
                break;
            case 33 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:204: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 34 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:215: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // D:\\Compiler\\lap\\Resources\\cs407project.g:1:223: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\10\uffff\1\35\2\uffff\16\35\7\uffff\7\35\1\72\22\35\1\uffff\1\115"+
        "\2\35\1\120\13\35\1\134\2\35\1\uffff\1\35\1\140\1\uffff\3\35\1\144"+
        "\1\145\1\146\4\35\1\153\1\uffff\1\35\1\155\1\35\1\uffff\3\35\3\uffff"+
        "\1\162\1\163\2\35\1\uffff\1\35\1\uffff\1\167\1\170\1\171\1\172\3"+
        "\uffff\1\173\1\174\6\uffff";
    static final String DFA6_eofS =
        "\175\uffff";
    static final String DFA6_minS =
        "\1\11\7\uffff\1\164\2\uffff\1\157\2\154\1\141\1\146\1\145\1\141"+
        "\1\145\1\165\1\145\1\164\1\150\1\157\1\150\7\uffff\1\162\1\163\1"+
        "\157\1\141\1\163\1\164\1\154\1\60\1\164\1\156\1\151\1\167\1\142"+
        "\1\164\1\141\1\151\1\165\3\151\1\164\1\154\1\163\2\145\1\163\1\uffff"+
        "\1\60\1\147\1\156\1\60\1\154\1\165\1\164\1\163\1\145\1\144\1\154"+
        "\1\156\2\145\1\163\1\60\1\156\1\145\1\uffff\1\164\1\60\1\uffff\1"+
        "\151\1\162\1\151\3\60\1\145\1\147\1\155\1\141\1\60\1\uffff\1\144"+
        "\1\60\1\150\1\uffff\1\143\1\156\1\143\3\uffff\2\60\1\56\1\156\1"+
        "\uffff\1\163\1\uffff\4\60\3\uffff\2\60\6\uffff";
    static final String DFA6_maxS =
        "\1\175\7\uffff\1\171\2\uffff\1\157\1\154\1\170\1\141\1\156\1\145"+
        "\1\141\1\145\1\165\1\145\1\164\1\162\1\157\1\150\7\uffff\1\162\1"+
        "\163\1\157\1\141\1\163\1\164\1\154\1\172\1\164\1\156\1\151\1\167"+
        "\1\142\1\164\1\141\1\151\1\165\3\151\1\164\1\154\1\163\2\145\1\163"+
        "\1\uffff\1\172\1\147\1\156\1\172\1\154\1\165\1\164\1\163\1\145\1"+
        "\144\1\154\1\156\2\145\1\163\1\172\1\156\1\145\1\uffff\1\164\1\172"+
        "\1\uffff\1\151\1\162\1\151\3\172\1\145\1\147\1\155\1\141\1\172\1"+
        "\uffff\1\144\1\172\1\150\1\uffff\1\143\1\156\1\143\3\uffff\2\172"+
        "\1\56\1\156\1\uffff\1\163\1\uffff\4\172\3\uffff\2\172\6\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\16\uffff"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\32\uffff\1\21\22\uffff\1\22"+
        "\2\uffff\1\25\13\uffff\1\16\3\uffff\1\24\3\uffff\1\31\1\32\1\33"+
        "\4\uffff\1\15\1\uffff\1\20\4\uffff\1\34\1\10\1\11\2\uffff\1\23\1"+
        "\26\1\27\1\30\1\14\1\17";
    static final String DFA6_specialS =
        "\175\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\1\4\uffff\1\33\1\uffff\1"+
            "\2\1\3\2\33\1\4\1\33\1\5\1\36\12\34\1\uffff\1\6\1\33\1\7\3\uffff"+
            "\22\35\1\10\7\35\1\11\1\uffff\1\12\1\uffff\1\35\1\uffff\1\35"+
            "\1\13\1\14\1\35\1\15\1\16\2\35\1\17\2\35\1\20\1\21\1\22\1\35"+
            "\1\23\1\35\1\24\1\25\1\26\1\35\1\27\1\30\3\35\1\31\1\uffff\1"+
            "\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44\13\uffff\1\45",
            "\1\46",
            "\1\47\7\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\11\uffff\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\116",
            "\1\117",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\154",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | Operation | INT | Identifier | COMMENT | WS );";
        }
    }
 

}