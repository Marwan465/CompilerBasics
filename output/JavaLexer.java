// $ANTLR 3.4 D:\\Compiler\\lap\\Resources\\Java.g 2018-04-24 13:31:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int COMMENT=4;
    public static final int Comparators=5;
    public static final int DNumber=6;
    public static final int ELSE=7;
    public static final int For=8;
    public static final int ID=9;
    public static final int IF=10;
    public static final int IMPORT=11;
    public static final int IMPORTs=12;
    public static final int Number=13;
    public static final int PRINT=14;
    public static final int Return=15;
    public static final int ReturnType=16;
    public static final int TYPE=17;
    public static final int TrigFunc=18;
    public static final int WS=19;
    public static final int While=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JavaLexer() {} 
    public JavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\lap\\Resources\\Java.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:2:7: ( '\"!\"' )
            // D:\\Compiler\\lap\\Resources\\Java.g:2:9: '\"!\"'
            {
            match("\"!\""); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:3:7: ( '\"' )
            // D:\\Compiler\\lap\\Resources\\Java.g:3:9: '\"'
            {
            match('\"'); 

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
            // D:\\Compiler\\lap\\Resources\\Java.g:4:7: ( '(' )
            // D:\\Compiler\\lap\\Resources\\Java.g:4:9: '('
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:5:7: ( ')' )
            // D:\\Compiler\\lap\\Resources\\Java.g:5:9: ')'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:6:7: ( '*' )
            // D:\\Compiler\\lap\\Resources\\Java.g:6:9: '*'
            {
            match('*'); 

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
            // D:\\Compiler\\lap\\Resources\\Java.g:7:7: ( '+' )
            // D:\\Compiler\\lap\\Resources\\Java.g:7:9: '+'
            {
            match('+'); 

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
            // D:\\Compiler\\lap\\Resources\\Java.g:8:7: ( '++' )
            // D:\\Compiler\\lap\\Resources\\Java.g:8:9: '++'
            {
            match("++"); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:9:7: ( '+=' )
            // D:\\Compiler\\lap\\Resources\\Java.g:9:9: '+='
            {
            match("+="); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:10:7: ( ', ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:10:9: ', '
            {
            match(", "); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:11:7: ( '-' )
            // D:\\Compiler\\lap\\Resources\\Java.g:11:9: '-'
            {
            match('-'); 

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
            // D:\\Compiler\\lap\\Resources\\Java.g:12:7: ( '--' )
            // D:\\Compiler\\lap\\Resources\\Java.g:12:9: '--'
            {
            match("--"); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:13:7: ( '-=' )
            // D:\\Compiler\\lap\\Resources\\Java.g:13:9: '-='
            {
            match("-="); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:14:7: ( '/' )
            // D:\\Compiler\\lap\\Resources\\Java.g:14:9: '/'
            {
            match('/'); 

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
            // D:\\Compiler\\lap\\Resources\\Java.g:15:7: ( '; ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:15:9: '; '
            {
            match("; "); 



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
            // D:\\Compiler\\lap\\Resources\\Java.g:16:7: ( ';' )
            // D:\\Compiler\\lap\\Resources\\Java.g:16:9: ';'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:17:7: ( '=' )
            // D:\\Compiler\\lap\\Resources\\Java.g:17:9: '='
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:18:7: ( 'class' )
            // D:\\Compiler\\lap\\Resources\\Java.g:18:9: 'class'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:19:7: ( '{' )
            // D:\\Compiler\\lap\\Resources\\Java.g:19:9: '{'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:20:7: ( '}' )
            // D:\\Compiler\\lap\\Resources\\Java.g:20:9: '}'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:21:7: ( '}; ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:21:9: '}; '
            {
            match("}; "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:5:5: ( ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:5:10: ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:5:10: ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:11: ( '0' )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:11: ( '0' )
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:12: '0'
                    {
                    match('0'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:19: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:19: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // D:\\Compiler\\lap\\Resources\\Java.g:5:20: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // D:\\Compiler\\lap\\Resources\\Java.g:5:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:
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
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "DNumber"
    public final void mDNumber() throws RecognitionException {
        try {
            int _type = DNumber;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:6:9: ( Number '.' Number )
            // D:\\Compiler\\lap\\Resources\\Java.g:6:11: Number '.' Number
            {
            mNumber(); 


            match('.'); 

            mNumber(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DNumber"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:7:7: ( ( 'int' | 'double' | 'string' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:7:9: ( 'int' | 'double' | 'string' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:7:9: ( 'int' | 'double' | 'string' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt3=1;
                }
                break;
            case 'd':
                {
                alt3=2;
                }
                break;
            case 's':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:7:10: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:7:18: 'double'
                    {
                    match("double"); 



                    }
                    break;
                case 3 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:7:29: 'string'
                    {
                    match("string"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "TrigFunc"
    public final void mTrigFunc() throws RecognitionException {
        try {
            int _type = TrigFunc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:9:2: ( ( 'sin' | 'cos' | 'tan' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:9:4: ( 'sin' | 'cos' | 'tan' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:9:4: ( 'sin' | 'cos' | 'tan' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt4=1;
                }
                break;
            case 'c':
                {
                alt4=2;
                }
                break;
            case 't':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:9:5: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:9:13: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:9:21: 'tan'
                    {
                    match("tan"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TrigFunc"

    // $ANTLR start "ReturnType"
    public final void mReturnType() throws RecognitionException {
        try {
            int _type = ReturnType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:11:11: ( ( TYPE | 'void' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:11:13: ( TYPE | 'void' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:11:13: ( TYPE | 'void' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='d'||LA5_0=='i'||LA5_0=='s') ) {
                alt5=1;
            }
            else if ( (LA5_0=='v') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:11:14: TYPE
                    {
                    mTYPE(); 


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:11:21: 'void'
                    {
                    match("void"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ReturnType"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:12:8: ( 'print ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:12:10: 'print '
            {
            match("print "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:14:8: ( 'import ' IMPORTs )
            // D:\\Compiler\\lap\\Resources\\Java.g:14:10: 'import ' IMPORTs
            {
            match("import "); 



            mIMPORTs(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "IMPORTs"
    public final void mIMPORTs() throws RecognitionException {
        try {
            int _type = IMPORTs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:16:2: ( 'java.' ID )
            // D:\\Compiler\\lap\\Resources\\Java.g:16:4: 'java.' ID
            {
            match("java."); 



            mID(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORTs"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:17:9: ( 'return ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:17:11: 'return '
            {
            match("return "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:19:5: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )
            // D:\\Compiler\\lap\\Resources\\Java.g:19:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:19:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:22:2: ( ( 'if ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:22:4: ( 'if ' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:22:4: ( 'if ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:22:5: 'if '
            {
            match("if "); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:23:9: ( ( 'else ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:23:18: ( 'else ' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:23:18: ( 'else ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:23:19: 'else '
            {
            match("else "); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:24:5: ( ( 'for ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:24:7: ( 'for ' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:24:7: ( 'for ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:24:8: 'for '
            {
            match("for "); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:25:7: ( ( 'while ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:25:9: ( 'while ' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:25:9: ( 'while ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:25:10: 'while '
            {
            match("while "); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Comparators"
    public final void mComparators() throws RecognitionException {
        try {
            int _type = Comparators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:27:2: ( ( '==' | '>' | '<' | '>=' | '<=' | '!=' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:27:5: ( '==' | '>' | '<' | '>=' | '<=' | '!=' )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:27:5: ( '==' | '>' | '<' | '>=' | '<=' | '!=' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '>':
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='=') ) {
                    alt7=4;
                }
                else {
                    alt7=2;
                }
                }
                break;
            case '<':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='=') ) {
                    alt7=5;
                }
                else {
                    alt7=3;
                }
                }
                break;
            case '!':
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:6: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:13: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:25: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 5 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:32: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 6 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:27:39: '!='
                    {
                    match("!="); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comparators"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\lap\\Resources\\Java.g:29:10: ( '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )* )
            // D:\\Compiler\\lap\\Resources\\Java.g:29:12: '//' (~ ( '\\r' | '\\n' | '\\r\\n' ) )*
            {
            match("//"); 



            // D:\\Compiler\\lap\\Resources\\Java.g:29:18: (~ ( '\\r' | '\\n' | '\\r\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:29:18: ~ ( '\\r' | '\\n' | '\\r\\n' )
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
            	    break loop8;
                }
            } while (true);


            skip();

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
            // D:\\Compiler\\lap\\Resources\\Java.g:30:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // D:\\Compiler\\lap\\Resources\\Java.g:30:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:30:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

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
        // D:\\Compiler\\lap\\Resources\\Java.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | Number | DNumber | TYPE | TrigFunc | ReturnType | PRINT | IMPORT | IMPORTs | Return | ID | IF | ELSE | For | While | Comparators | COMMENT | WS )
        int alt10=37;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:10: T__21
                {
                mT__21(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:16: T__22
                {
                mT__22(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:22: T__23
                {
                mT__23(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:28: T__24
                {
                mT__24(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:34: T__25
                {
                mT__25(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:40: T__26
                {
                mT__26(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:46: T__27
                {
                mT__27(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:52: T__28
                {
                mT__28(); 


                }
                break;
            case 9 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:58: T__29
                {
                mT__29(); 


                }
                break;
            case 10 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:64: T__30
                {
                mT__30(); 


                }
                break;
            case 11 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:70: T__31
                {
                mT__31(); 


                }
                break;
            case 12 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:76: T__32
                {
                mT__32(); 


                }
                break;
            case 13 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:82: T__33
                {
                mT__33(); 


                }
                break;
            case 14 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:88: T__34
                {
                mT__34(); 


                }
                break;
            case 15 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:94: T__35
                {
                mT__35(); 


                }
                break;
            case 16 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:100: T__36
                {
                mT__36(); 


                }
                break;
            case 17 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:106: T__37
                {
                mT__37(); 


                }
                break;
            case 18 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:112: T__38
                {
                mT__38(); 


                }
                break;
            case 19 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:118: T__39
                {
                mT__39(); 


                }
                break;
            case 20 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:124: T__40
                {
                mT__40(); 


                }
                break;
            case 21 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:130: Number
                {
                mNumber(); 


                }
                break;
            case 22 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:137: DNumber
                {
                mDNumber(); 


                }
                break;
            case 23 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:145: TYPE
                {
                mTYPE(); 


                }
                break;
            case 24 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:150: TrigFunc
                {
                mTrigFunc(); 


                }
                break;
            case 25 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:159: ReturnType
                {
                mReturnType(); 


                }
                break;
            case 26 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:170: PRINT
                {
                mPRINT(); 


                }
                break;
            case 27 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:176: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 28 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:183: IMPORTs
                {
                mIMPORTs(); 


                }
                break;
            case 29 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:191: Return
                {
                mReturn(); 


                }
                break;
            case 30 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:198: ID
                {
                mID(); 


                }
                break;
            case 31 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:201: IF
                {
                mIF(); 


                }
                break;
            case 32 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:204: ELSE
                {
                mELSE(); 


                }
                break;
            case 33 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:209: For
                {
                mFor(); 


                }
                break;
            case 34 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:213: While
                {
                mWhile(); 


                }
                break;
            case 35 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:219: Comparators
                {
                mComparators(); 


                }
                break;
            case 36 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:231: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 37 :
                // D:\\Compiler\\lap\\Resources\\Java.g:1:239: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\37\3\uffff\1\42\1\uffff\1\45\1\47\1\51\1\52\1\33\1\uffff"+
        "\1\56\2\57\13\33\20\uffff\2\33\4\uffff\1\57\17\33\1\121\1\122\1"+
        "\33\1\uffff\2\33\2\121\10\33\2\uffff\3\33\1\141\4\33\1\uffff\1\33"+
        "\1\147\3\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33"+
        "\2\122\1\uffff\1\33\3\uffff";
    static final String DFA10_eofS =
        "\160\uffff";
    static final String DFA10_minS =
        "\1\11\1\41\3\uffff\1\53\1\uffff\1\55\1\57\1\40\1\75\1\154\1\uffff"+
        "\1\73\2\56\1\146\1\157\1\151\1\141\1\157\1\162\1\141\1\145\1\154"+
        "\1\157\1\150\20\uffff\1\141\1\163\4\uffff\1\56\1\164\1\160\1\40"+
        "\1\165\1\162\2\156\2\151\1\166\1\164\1\163\1\162\1\151\1\163\2\101"+
        "\1\157\1\uffff\1\142\1\151\2\101\1\144\1\156\1\141\1\165\1\145\1"+
        "\40\1\154\1\163\2\uffff\1\162\1\154\1\156\1\101\1\164\1\56\1\162"+
        "\1\40\1\uffff\1\145\1\101\1\164\1\145\1\147\1\uffff\1\40\1\uffff"+
        "\1\156\1\uffff\1\40\1\uffff\1\40\2\101\1\uffff\1\40\3\uffff";
    static final String DFA10_maxS =
        "\1\175\1\41\3\uffff\1\75\1\uffff\1\75\1\57\1\40\1\75\1\157\1\uffff"+
        "\1\73\1\56\1\71\1\156\1\157\1\164\1\141\1\157\1\162\1\141\1\145"+
        "\1\154\1\157\1\150\20\uffff\1\141\1\163\4\uffff\1\71\1\164\1\160"+
        "\1\40\1\165\1\162\2\156\2\151\1\166\1\164\1\163\1\162\1\151\1\163"+
        "\2\172\1\157\1\uffff\1\142\1\151\2\172\1\144\1\156\1\141\1\165\1"+
        "\145\1\40\1\154\1\163\2\uffff\1\162\1\154\1\156\1\172\1\164\1\56"+
        "\1\162\1\40\1\uffff\1\145\1\172\1\164\1\145\1\147\1\uffff\1\40\1"+
        "\uffff\1\156\1\uffff\1\40\1\uffff\1\40\2\172\1\uffff\1\40\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\uffff\1\11\5\uffff\1\22\16\uffff\1\36\1\43"+
        "\1\45\1\1\1\2\1\7\1\10\1\6\1\13\1\14\1\12\1\44\1\15\1\16\1\17\1"+
        "\20\2\uffff\1\24\1\23\1\25\1\26\23\uffff\1\37\14\uffff\1\30\1\27"+
        "\10\uffff\1\41\5\uffff\1\31\1\uffff\1\34\1\uffff\1\40\1\uffff\1"+
        "\21\3\uffff\1\32\1\uffff\1\42\1\33\1\35";
    static final String DFA10_specialS =
        "\160\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\34\1\1\5\uffff\1\2\1\3\1"+
            "\4\1\5\1\6\1\7\1\uffff\1\10\1\16\11\17\1\uffff\1\11\1\34\1\12"+
            "\1\34\2\uffff\32\33\6\uffff\2\33\1\13\1\21\1\30\1\31\2\33\1"+
            "\20\1\26\5\33\1\25\1\33\1\27\1\22\1\23\1\33\1\24\1\32\3\33\1"+
            "\14\1\uffff\1\15",
            "\1\36",
            "",
            "",
            "",
            "\1\40\21\uffff\1\41",
            "",
            "\1\43\17\uffff\1\44",
            "\1\46",
            "\1\50",
            "\1\34",
            "\1\53\2\uffff\1\54",
            "",
            "\1\55",
            "\1\60",
            "\1\60\1\uffff\12\61",
            "\1\64\6\uffff\1\63\1\62",
            "\1\65",
            "\1\67\12\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\61",
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
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\32\33\6\uffff\32\33",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\32\33\6\uffff\32\33",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "",
            "\1\154",
            "",
            "\1\155",
            "",
            "\1\156",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "\1\157",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | Number | DNumber | TYPE | TrigFunc | ReturnType | PRINT | IMPORT | IMPORTs | Return | ID | IF | ELSE | For | While | Comparators | COMMENT | WS );";
        }
    }
 

}