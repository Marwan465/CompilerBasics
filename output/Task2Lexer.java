// $ANTLR 3.4 D:\\Compiler\\Resources\\Task2.g 2018-02-27 18:08:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Task2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int DNumber=4;
    public static final int ID=5;
    public static final int NEWLINE=6;
    public static final int Number=7;
    public static final int TrigFunc=8;
    public static final int WS=9;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Task2Lexer() {} 
    public Task2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Task2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\Resources\\Task2.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:2:7: ( '(' )
            // D:\\Compiler\\Resources\\Task2.g:2:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:3:7: ( ')' )
            // D:\\Compiler\\Resources\\Task2.g:3:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:4:7: ( '*' )
            // D:\\Compiler\\Resources\\Task2.g:4:9: '*'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:5:7: ( '+' )
            // D:\\Compiler\\Resources\\Task2.g:5:9: '+'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:6:7: ( '-' )
            // D:\\Compiler\\Resources\\Task2.g:6:9: '-'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:7:7: ( '/' )
            // D:\\Compiler\\Resources\\Task2.g:7:9: '/'
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
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:21:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // D:\\Compiler\\Resources\\Task2.g:21:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // D:\\Compiler\\Resources\\Task2.g:21:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    // D:\\Compiler\\Resources\\Task2.g:
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

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:23:5: ( ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) ) )
            // D:\\Compiler\\Resources\\Task2.g:23:10: ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            {
            // D:\\Compiler\\Resources\\Task2.g:23:10: ( ( '0' ) | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\Resources\\Task2.g:23:11: ( '0' )
                    {
                    // D:\\Compiler\\Resources\\Task2.g:23:11: ( '0' )
                    // D:\\Compiler\\Resources\\Task2.g:23:12: '0'
                    {
                    match('0'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Resources\\Task2.g:23:19: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // D:\\Compiler\\Resources\\Task2.g:23:19: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // D:\\Compiler\\Resources\\Task2.g:23:20: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // D:\\Compiler\\Resources\\Task2.g:23:30: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\Compiler\\Resources\\Task2.g:
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
                    	    break loop2;
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
            // D:\\Compiler\\Resources\\Task2.g:24:9: ( Number '.' Number )
            // D:\\Compiler\\Resources\\Task2.g:24:11: Number '.' Number
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

    // $ANTLR start "TrigFunc"
    public final void mTrigFunc() throws RecognitionException {
        try {
            int _type = TrigFunc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:27:2: ( ( 'sin' | 'cos' | 'tan' ) '(' ( Number | DNumber ) ')' )
            // D:\\Compiler\\Resources\\Task2.g:27:4: ( 'sin' | 'cos' | 'tan' ) '(' ( Number | DNumber ) ')'
            {
            // D:\\Compiler\\Resources\\Task2.g:27:4: ( 'sin' | 'cos' | 'tan' )
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
                    // D:\\Compiler\\Resources\\Task2.g:27:5: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Resources\\Task2.g:27:13: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // D:\\Compiler\\Resources\\Task2.g:27:21: 'tan'
                    {
                    match("tan"); 



                    }
                    break;

            }


            match('('); 

            // D:\\Compiler\\Resources\\Task2.g:27:32: ( Number | DNumber )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // D:\\Compiler\\Resources\\Task2.g:27:33: Number
                    {
                    mNumber(); 


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Resources\\Task2.g:27:42: DNumber
                    {
                    mDNumber(); 


                    }
                    break;

            }


            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TrigFunc"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Resources\\Task2.g:28:8: ( ( '\\r' )? '\\n' )
            // D:\\Compiler\\Resources\\Task2.g:28:9: ( '\\r' )? '\\n'
            {
            // D:\\Compiler\\Resources\\Task2.g:28:9: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Compiler\\Resources\\Task2.g:28:9: '\\r'
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
            // D:\\Compiler\\Resources\\Task2.g:29:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // D:\\Compiler\\Resources\\Task2.g:29:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // D:\\Compiler\\Resources\\Task2.g:29:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Task2.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
        // D:\\Compiler\\Resources\\Task2.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | Number | DNumber | TrigFunc | NEWLINE | WS )
        int alt8=12;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // D:\\Compiler\\Resources\\Task2.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\Resources\\Task2.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\Resources\\Task2.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\Resources\\Task2.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\Resources\\Task2.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\Resources\\Task2.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\Resources\\Task2.g:1:46: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\Resources\\Task2.g:1:49: Number
                {
                mNumber(); 


                }
                break;
            case 9 :
                // D:\\Compiler\\Resources\\Task2.g:1:56: DNumber
                {
                mDNumber(); 


                }
                break;
            case 10 :
                // D:\\Compiler\\Resources\\Task2.g:1:64: TrigFunc
                {
                mTrigFunc(); 


                }
                break;
            case 11 :
                // D:\\Compiler\\Resources\\Task2.g:1:73: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 12 :
                // D:\\Compiler\\Resources\\Task2.g:1:81: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\60\2\51\2\uffff\1\51";
    static final String DFA5_maxS =
        "\1\71\1\56\1\71\2\uffff\1\71";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\11\2",
            "\1\3\4\uffff\1\4",
            "\1\3\4\uffff\1\4\1\uffff\12\5",
            "",
            "",
            "\1\3\4\uffff\1\4\1\uffff\12\5"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "27:32: ( Number | DNumber )";
        }
    }
    static final String DFA8_eotS =
        "\7\uffff\1\14\2\21\2\14\1\uffff\1\17\1\26\1\uffff\1\14\2\uffff\1"+
        "\21\2\14\1\uffff\3\14\1\uffff";
    static final String DFA8_eofS =
        "\33\uffff";
    static final String DFA8_minS =
        "\1\11\6\uffff\1\151\2\56\1\157\1\141\1\uffff\1\12\1\11\1\uffff\1"+
        "\156\2\uffff\1\56\1\163\1\156\1\uffff\3\50\1\uffff";
    static final String DFA8_maxS =
        "\1\172\6\uffff\1\151\1\56\1\71\1\157\1\141\1\uffff\1\12\1\40\1\uffff"+
        "\1\156\2\uffff\1\71\1\163\1\156\1\uffff\3\50\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\5\uffff\1\7\2\uffff\1\14\1\uffff"+
        "\1\10\1\11\3\uffff\1\13\3\uffff\1\12";
    static final String DFA8_specialS =
        "\33\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\17\1\16\2\uffff\1\15\22\uffff\1\17\7\uffff\1\1\1\2\1\3\1"+
            "\4\1\uffff\1\5\1\uffff\1\6\1\10\11\11\7\uffff\32\14\6\uffff"+
            "\2\14\1\12\17\14\1\7\1\13\6\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\22",
            "\1\22\1\uffff\12\23",
            "\1\24",
            "\1\25",
            "",
            "\1\16",
            "\2\17\2\uffff\1\17\22\uffff\1\17",
            "",
            "\1\27",
            "",
            "",
            "\1\22\1\uffff\12\23",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\32",
            "\1\32",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | Number | DNumber | TrigFunc | NEWLINE | WS );";
        }
    }
 

}