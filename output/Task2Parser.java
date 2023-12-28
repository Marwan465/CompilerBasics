// $ANTLR 3.4 D:\\Compiler\\Resources\\Task2.g 2018-02-27 18:08:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Task2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DNumber", "ID", "NEWLINE", "Number", "TrigFunc", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Task2Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Task2Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Task2Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\Resources\\Task2.g"; }



    // $ANTLR start "prog"
    // D:\\Compiler\\Resources\\Task2.g:3:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\Compiler\\Resources\\Task2.g:3:5: ( ( stat )+ )
            // D:\\Compiler\\Resources\\Task2.g:3:9: ( stat )+
            {
            // D:\\Compiler\\Resources\\Task2.g:3:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DNumber && LA1_0 <= ID)||(LA1_0 >= Number && LA1_0 <= TrigFunc)||LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Task2.g:3:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog11);
            	    stat();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // D:\\Compiler\\Resources\\Task2.g:5:1: stat : expr ;
    public final void stat() throws RecognitionException {
        try {
            // D:\\Compiler\\Resources\\Task2.g:5:5: ( expr )
            // D:\\Compiler\\Resources\\Task2.g:6:9: expr
            {
            pushFollow(FOLLOW_expr_in_stat47);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // D:\\Compiler\\Resources\\Task2.g:11:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\Compiler\\Resources\\Task2.g:11:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // D:\\Compiler\\Resources\\Task2.g:11:7: multExpr ( ( '+' | '-' ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr65);
            multExpr();

            state._fsp--;


            // D:\\Compiler\\Resources\\Task2.g:11:16: ( ( '+' | '-' ) multExpr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 13 && LA2_0 <= 14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Task2.g:11:17: ( '+' | '-' ) multExpr
            	    {
            	    if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr76);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            System.out.println("ADD/SUB")

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // D:\\Compiler\\Resources\\Task2.g:13:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // D:\\Compiler\\Resources\\Task2.g:14:3: ( atom ( ( '*' | '/' ) atom )* )
            // D:\\Compiler\\Resources\\Task2.g:14:3: atom ( ( '*' | '/' ) atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr88);
            atom();

            state._fsp--;


            // D:\\Compiler\\Resources\\Task2.g:14:8: ( ( '*' | '/' ) atom )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Compiler\\Resources\\Task2.g:14:9: ( '*' | '/' ) atom
            	    {
            	    if ( input.LA(1)==12||input.LA(1)==15 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_atom_in_multExpr97);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            System.out.println("MULT/SUB")

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // D:\\Compiler\\Resources\\Task2.g:16:1: atom : ( ( Number | DNumber | TrigFunc ) | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try {
            // D:\\Compiler\\Resources\\Task2.g:16:5: ( ( Number | DNumber | TrigFunc ) | ID | '(' expr ')' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case DNumber:
            case Number:
            case TrigFunc:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case 10:
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
                    // D:\\Compiler\\Resources\\Task2.g:16:7: ( Number | DNumber | TrigFunc )
                    {
                    if ( input.LA(1)==DNumber||(input.LA(1) >= Number && input.LA(1) <= TrigFunc) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    System.out.println("Braces")

                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Resources\\Task2.g:17:3: ID
                    {
                    match(input,ID,FOLLOW_ID_in_atom125); 

                    }
                    break;
                case 3 :
                    // D:\\Compiler\\Resources\\Task2.g:18:3: '(' expr ')'
                    {
                    match(input,10,FOLLOW_10_in_atom129); 

                    pushFollow(FOLLOW_expr_in_atom131);
                    expr();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_atom133); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog11 = new BitSet(new long[]{0x00000000000005B2L});
    public static final BitSet FOLLOW_expr_in_stat47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr65 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_set_in_expr68 = new BitSet(new long[]{0x00000000000005B0L});
    public static final BitSet FOLLOW_multExpr_in_expr76 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_atom_in_multExpr88 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_set_in_multExpr91 = new BitSet(new long[]{0x00000000000005B0L});
    public static final BitSet FOLLOW_atom_in_multExpr97 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_set_in_atom108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atom129 = new BitSet(new long[]{0x00000000000005B0L});
    public static final BitSet FOLLOW_expr_in_atom131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atom133 = new BitSet(new long[]{0x0000000000000002L});

}