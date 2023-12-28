// $ANTLR 3.4 D:\\Compiler\\docs\\T.g 2018-02-18 13:31:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "stat", "multExpr", "prog", "atom", "expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public TParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public TParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public TParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return TParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\docs\\T.g"; }



    // $ANTLR start "prog"
    // D:\\Compiler\\docs\\T.g:6:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // D:\\Compiler\\docs\\T.g:6:5: ( ( stat )+ )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\T.g:6:7: ( stat )+
            {
            dbg.location(6,7);
            // D:\\Compiler\\docs\\T.g:6:7: ( stat )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Compiler\\docs\\T.g:6:7: stat
            	    {
            	    dbg.location(6,7);
            	    pushFollow(FOLLOW_stat_in_prog72);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(6, 12);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // D:\\Compiler\\docs\\T.g:8:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 0);

        try {
            // D:\\Compiler\\docs\\T.g:8:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            switch ( input.LA(1) ) {
            case INT:
            case 8:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Compiler\\docs\\T.g:8:7: expr NEWLINE
                    {
                    dbg.location(8,7);
                    pushFollow(FOLLOW_expr_in_stat81);
                    expr();

                    state._fsp--;

                    dbg.location(8,12);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat83); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\docs\\T.g:9:3: ID '=' expr NEWLINE
                    {
                    dbg.location(9,3);
                    match(input,ID,FOLLOW_ID_in_stat87); 
                    dbg.location(9,6);
                    match(input,13,FOLLOW_13_in_stat89); 
                    dbg.location(9,10);
                    pushFollow(FOLLOW_expr_in_stat91);
                    expr();

                    state._fsp--;

                    dbg.location(9,15);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat93); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Compiler\\docs\\T.g:10:3: NEWLINE
                    {
                    dbg.location(10,3);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat97); 

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
        dbg.location(11, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // D:\\Compiler\\docs\\T.g:13:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // D:\\Compiler\\docs\\T.g:13:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\T.g:13:7: multExpr ( ( '+' | '-' ) multExpr )*
            {
            dbg.location(13,7);
            pushFollow(FOLLOW_multExpr_in_expr105);
            multExpr();

            state._fsp--;

            dbg.location(13,16);
            // D:\\Compiler\\docs\\T.g:13:16: ( ( '+' | '-' ) multExpr )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 11 && LA3_0 <= 12)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Compiler\\docs\\T.g:13:17: ( '+' | '-' ) multExpr
            	    {
            	    dbg.location(13,17);
            	    if ( (input.LA(1) >= 11 && input.LA(1) <= 12) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(13,29);
            	    pushFollow(FOLLOW_multExpr_in_expr116);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // D:\\Compiler\\docs\\T.g:15:1: multExpr : atom ( '*' atom )* ;
    public final void multExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // D:\\Compiler\\docs\\T.g:16:3: ( atom ( '*' atom )* )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\T.g:16:3: atom ( '*' atom )*
            {
            dbg.location(16,3);
            pushFollow(FOLLOW_atom_in_multExpr126);
            atom();

            state._fsp--;

            dbg.location(16,8);
            // D:\\Compiler\\docs\\T.g:16:8: ( '*' atom )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Compiler\\docs\\T.g:16:9: '*' atom
            	    {
            	    dbg.location(16,9);
            	    match(input,10,FOLLOW_10_in_multExpr129); 
            	    dbg.location(16,13);
            	    pushFollow(FOLLOW_atom_in_multExpr131);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // D:\\Compiler\\docs\\T.g:18:1: atom : ( INT | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // D:\\Compiler\\docs\\T.g:18:5: ( INT | ID | '(' expr ')' )
            int alt5=3;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case 8:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Compiler\\docs\\T.g:18:7: INT
                    {
                    dbg.location(18,7);
                    match(input,INT,FOLLOW_INT_in_atom140); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\docs\\T.g:19:3: ID
                    {
                    dbg.location(19,3);
                    match(input,ID,FOLLOW_ID_in_atom144); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Compiler\\docs\\T.g:20:3: '(' expr ')'
                    {
                    dbg.location(20,3);
                    match(input,8,FOLLOW_8_in_atom148); 
                    dbg.location(20,7);
                    pushFollow(FOLLOW_expr_in_atom150);
                    expr();

                    state._fsp--;

                    dbg.location(20,12);
                    match(input,9,FOLLOW_9_in_atom152); 

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
        dbg.location(21, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog72 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat87 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat89 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat91 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr105 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_expr108 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr116 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr126 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr129 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr131 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom148 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom150 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom152 = new BitSet(new long[]{0x0000000000000002L});

}