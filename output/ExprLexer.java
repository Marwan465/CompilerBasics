// $ANTLR 3.4 D:\\Compiler\\docs\\Expr.g 2018-02-18 14:50:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\docs\\Expr.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:2:6: ( '(' )
            // D:\\Compiler\\docs\\Expr.g:2:8: '('
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:3:6: ( ')' )
            // D:\\Compiler\\docs\\Expr.g:3:8: ')'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:4:7: ( '*' )
            // D:\\Compiler\\docs\\Expr.g:4:9: '*'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:5:7: ( '+' )
            // D:\\Compiler\\docs\\Expr.g:5:9: '+'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:6:7: ( '-' )
            // D:\\Compiler\\docs\\Expr.g:6:9: '-'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:7:7: ( '=' )
            // D:\\Compiler\\docs\\Expr.g:7:9: '='
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
    // $ANTLR end "T__13"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:74:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // D:\\Compiler\\docs\\Expr.g:74:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // D:\\Compiler\\docs\\Expr.g:74:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiler\\docs\\Expr.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:75:5: ( ( '0' .. '9' )+ )
            // D:\\Compiler\\docs\\Expr.g:75:9: ( '0' .. '9' )+
            {
            // D:\\Compiler\\docs\\Expr.g:75:9: ( '0' .. '9' )+
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
            	    // D:\\Compiler\\docs\\Expr.g:
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:76:8: ( ( '\\r' )? '\\n' )
            // D:\\Compiler\\docs\\Expr.g:76:9: ( '\\r' )? '\\n'
            {
            // D:\\Compiler\\docs\\Expr.g:76:9: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\docs\\Expr.g:76:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\docs\\Expr.g:77:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // D:\\Compiler\\docs\\Expr.g:77:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // D:\\Compiler\\docs\\Expr.g:77:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiler\\docs\\Expr.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // D:\\Compiler\\docs\\Expr.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | ID | INT | NEWLINE | WS )
        int alt5=10;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt5=1;
            }
            break;
        case ')':
            {
            alt5=2;
            }
            break;
        case '*':
            {
            alt5=3;
            }
            break;
        case '+':
            {
            alt5=4;
            }
            break;
        case '-':
            {
            alt5=5;
            }
            break;
        case '=':
            {
            alt5=6;
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
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
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
            alt5=7;
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
            alt5=8;
            }
            break;
        case '\r':
            {
            int LA5_9 = input.LA(2);

            if ( (LA5_9=='\n') ) {
                int LA5_10 = input.LA(3);

                if ( ((LA5_10 >= '\t' && LA5_10 <= '\n')||LA5_10=='\r'||LA5_10==' ') ) {
                    alt5=10;
                }
                else {
                    alt5=9;
                }
            }
            else {
                alt5=10;
            }
            }
            break;
        case '\n':
            {
            int LA5_10 = input.LA(2);

            if ( ((LA5_10 >= '\t' && LA5_10 <= '\n')||LA5_10=='\r'||LA5_10==' ') ) {
                alt5=10;
            }
            else {
                alt5=9;
            }
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // D:\\Compiler\\docs\\Expr.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\docs\\Expr.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\docs\\Expr.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\docs\\Expr.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\docs\\Expr.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\docs\\Expr.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\docs\\Expr.g:1:44: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\docs\\Expr.g:1:47: INT
                {
                mINT(); 


                }
                break;
            case 9 :
                // D:\\Compiler\\docs\\Expr.g:1:51: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 10 :
                // D:\\Compiler\\docs\\Expr.g:1:59: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}