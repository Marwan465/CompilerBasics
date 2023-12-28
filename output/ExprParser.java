// $ANTLR 3.4 D:\\Compiler\\docs\\Expr.g 2018-02-18 15:49:37

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends DebugParser {
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
    "invalidRule", "expr", "multExpr", "atom", "prog", "stat"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public ExprParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, int port, RecognizerSharedState state) {
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

public ExprParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\docs\\Expr.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // D:\\Compiler\\docs\\Expr.g:15:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // D:\\Compiler\\docs\\Expr.g:15:5: ( ( stat )+ )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\Expr.g:15:9: ( stat )+
            {
            dbg.location(15,9);
            // D:\\Compiler\\docs\\Expr.g:15:9: ( stat )+
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

            	    // D:\\Compiler\\docs\\Expr.g:15:9: stat
            	    {
            	    dbg.location(15,9);
            	    pushFollow(FOLLOW_stat_in_prog26);
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
        dbg.location(15, 14);

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
    // D:\\Compiler\\docs\\Expr.g:17:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        int expr1 =0;

        int expr3 =0;


        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // D:\\Compiler\\docs\\Expr.g:17:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
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

                    // D:\\Compiler\\docs\\Expr.g:19:9: expr NEWLINE
                    {
                    dbg.location(19,9);
                    pushFollow(FOLLOW_expr_in_stat71);
                    expr1=expr();

                    state._fsp--;

                    dbg.location(19,14);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat73); 
                    dbg.location(19,22);
                    System.out.println(expr1);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\docs\\Expr.g:23:9: ID '=' expr NEWLINE
                    {
                    dbg.location(23,9);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat104); 
                    dbg.location(23,12);
                    match(input,13,FOLLOW_13_in_stat106); 
                    dbg.location(23,16);
                    pushFollow(FOLLOW_expr_in_stat108);
                    expr3=expr();

                    state._fsp--;

                    dbg.location(23,21);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat110); 
                    dbg.location(24,9);
                    memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Compiler\\docs\\Expr.g:27:9: NEWLINE
                    {
                    dbg.location(27,9);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat140); 

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
        dbg.location(28, 4);

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
    // D:\\Compiler\\docs\\Expr.g:35:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
    public final int expr() throws RecognitionException {
        int value = 0;


        int e =0;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // D:\\Compiler\\docs\\Expr.g:36:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\Expr.g:36:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
            {
            dbg.location(36,10);
            pushFollow(FOLLOW_multExpr_in_expr169);
            e=multExpr();

            state._fsp--;

            dbg.location(36,20);
            value = e;
            dbg.location(37,9);
            // D:\\Compiler\\docs\\Expr.g:37:9: ( '+' e= multExpr | '-' e= multExpr )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }
                else if ( (LA3_0==12) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Compiler\\docs\\Expr.g:37:13: '+' e= multExpr
            	    {
            	    dbg.location(37,13);
            	    match(input,11,FOLLOW_11_in_expr185); 
            	    dbg.location(37,18);
            	    pushFollow(FOLLOW_multExpr_in_expr189);
            	    e=multExpr();

            	    state._fsp--;

            	    dbg.location(37,28);
            	    value += e;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // D:\\Compiler\\docs\\Expr.g:38:13: '-' e= multExpr
            	    {
            	    dbg.location(38,13);
            	    match(input,12,FOLLOW_12_in_expr205); 
            	    dbg.location(38,18);
            	    pushFollow(FOLLOW_multExpr_in_expr209);
            	    e=multExpr();

            	    state._fsp--;

            	    dbg.location(38,28);
            	    value -= e;

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
        dbg.location(40, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // D:\\Compiler\\docs\\Expr.g:49:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
    public final int multExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // D:\\Compiler\\docs\\Expr.g:50:5: (e= atom ( '*' e= atom )* )
            dbg.enterAlt(1);

            // D:\\Compiler\\docs\\Expr.g:50:9: e= atom ( '*' e= atom )*
            {
            dbg.location(50,10);
            pushFollow(FOLLOW_atom_in_multExpr251);
            e=atom();

            state._fsp--;

            dbg.location(50,16);
            value = e;
            dbg.location(50,37);
            // D:\\Compiler\\docs\\Expr.g:50:37: ( '*' e= atom )*
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

            	    // D:\\Compiler\\docs\\Expr.g:50:38: '*' e= atom
            	    {
            	    dbg.location(50,38);
            	    match(input,10,FOLLOW_10_in_multExpr256); 
            	    dbg.location(50,43);
            	    pushFollow(FOLLOW_atom_in_multExpr260);
            	    e=atom();

            	    state._fsp--;

            	    dbg.location(50,49);
            	    value *= e;

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
        dbg.location(51, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // D:\\Compiler\\docs\\Expr.g:55:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
    public final int atom() throws RecognitionException {
        int value = 0;


        Token INT4=null;
        Token ID5=null;
        int expr6 =0;


        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 0);

        try {
            // D:\\Compiler\\docs\\Expr.g:56:5: ( INT | ID | '(' expr ')' )
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

                    // D:\\Compiler\\docs\\Expr.g:57:9: INT
                    {
                    dbg.location(57,9);
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_atom299); 
                    dbg.location(57,13);
                    value = Integer.parseInt((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\docs\\Expr.g:59:9: ID
                    {
                    dbg.location(59,9);
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_atom312); 
                    dbg.location(60,9);

                            // look up value of variable
                            Integer v = (Integer)memory.get((ID5!=null?ID5.getText():null));
                            // if found, set return value else error
                            if ( v!=null ) value = v.intValue();
                            else System.err.println("undefined variable "+(ID5!=null?ID5.getText():null));
                            

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // D:\\Compiler\\docs\\Expr.g:69:9: '(' expr ')'
                    {
                    dbg.location(69,9);
                    match(input,8,FOLLOW_8_in_atom343); 
                    dbg.location(69,13);
                    pushFollow(FOLLOW_expr_in_atom345);
                    expr6=expr();

                    state._fsp--;

                    dbg.location(69,18);
                    match(input,9,FOLLOW_9_in_atom347); 
                    dbg.location(69,22);
                    value = expr6;

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
        dbg.location(70, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog26 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat106 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr169 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr185 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr189 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_expr205 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr209 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr251 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr256 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom343 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom345 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom347 = new BitSet(new long[]{0x0000000000000002L});

}