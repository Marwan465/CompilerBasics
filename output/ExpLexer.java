// $ANTLR 3.4 D:\\Compiler\\Resources\\Exp.g 2018-02-18 17:43:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExpLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int ID=4;
    public static final int Number=5;
    public static final int TYPE=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExpLexer() {} 
    public ExpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\Resources\\Exp.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:2:6: ( '+' )
            // D:\\Compiler\\Resources\\Exp.g:2:8: '+'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:3:6: ( '-' )
            // D:\\Compiler\\Resources\\Exp.g:3:8: '-'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:4:7: ( ';' )
            // D:\\Compiler\\Resources\\Exp.g:4:9: ';'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:5:7: ( '=' )
            // D:\\Compiler\\Resources\\Exp.g:5:9: '='
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
    // $ANTLR end "T__11"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:31:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // D:\\Compiler\\Resources\\Exp.g:31:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // D:\\Compiler\\Resources\\Exp.g:31:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Exp.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // D:\\Compiler\\Resources\\Exp.g:31:22: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\Resources\\Exp.g:31:23: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // D:\\Compiler\\Resources\\Exp.g:31:27: ( '0' .. '9' )+
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
                    	    // D:\\Compiler\\Resources\\Exp.g:
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

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:34:6: ( ( 'int' | 'double' ) )
            // D:\\Compiler\\Resources\\Exp.g:34:8: ( 'int' | 'double' )
            {
            // D:\\Compiler\\Resources\\Exp.g:34:8: ( 'int' | 'double' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='i') ) {
                alt4=1;
            }
            else if ( (LA4_0=='d') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Compiler\\Resources\\Exp.g:34:9: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Resources\\Exp.g:34:17: 'double'
                    {
                    match("double"); 



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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:36:4: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // D:\\Compiler\\Resources\\Exp.g:36:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // D:\\Compiler\\Resources\\Exp.g:36:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Exp.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Exp.g:40:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Compiler\\Resources\\Exp.g:40:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


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
        // D:\\Compiler\\Resources\\Exp.g:1:8: ( T__8 | T__9 | T__10 | T__11 | Number | TYPE | ID | WS )
        int alt6=8;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt6=1;
            }
            break;
        case '-':
            {
            alt6=2;
            }
            break;
        case ';':
            {
            alt6=3;
            }
            break;
        case '=':
            {
            alt6=4;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt6=5;
            }
            break;
        case 'i':
            {
            int LA6_6 = input.LA(2);

            if ( (LA6_6=='n') ) {
                int LA6_10 = input.LA(3);

                if ( (LA6_10=='t') ) {
                    int LA6_12 = input.LA(4);

                    if ( ((LA6_12 >= 'A' && LA6_12 <= 'Z')||(LA6_12 >= 'a' && LA6_12 <= 'z')) ) {
                        alt6=7;
                    }
                    else {
                        alt6=6;
                    }
                }
                else {
                    alt6=7;
                }
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'd':
            {
            int LA6_7 = input.LA(2);

            if ( (LA6_7=='o') ) {
                int LA6_11 = input.LA(3);

                if ( (LA6_11=='u') ) {
                    int LA6_13 = input.LA(4);

                    if ( (LA6_13=='b') ) {
                        int LA6_15 = input.LA(5);

                        if ( (LA6_15=='l') ) {
                            int LA6_16 = input.LA(6);

                            if ( (LA6_16=='e') ) {
                                int LA6_17 = input.LA(7);

                                if ( ((LA6_17 >= 'A' && LA6_17 <= 'Z')||(LA6_17 >= 'a' && LA6_17 <= 'z')) ) {
                                    alt6=7;
                                }
                                else {
                                    alt6=6;
                                }
                            }
                            else {
                                alt6=7;
                            }
                        }
                        else {
                            alt6=7;
                        }
                    }
                    else {
                        alt6=7;
                    }
                }
                else {
                    alt6=7;
                }
            }
            else {
                alt6=7;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=7;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // D:\\Compiler\\Resources\\Exp.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\Resources\\Exp.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\Resources\\Exp.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\Resources\\Exp.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\Resources\\Exp.g:1:32: Number
                {
                mNumber(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\Resources\\Exp.g:1:39: TYPE
                {
                mTYPE(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\Resources\\Exp.g:1:44: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\Resources\\Exp.g:1:47: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}