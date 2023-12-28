// $ANTLR 3.4 D:\\Compiler\\Resources\\Exp.g 2018-02-18 17:43:22

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExpParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "Number", "TYPE", "WS", "'+'", "'-'", "';'", "'='"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "stat", "prog", "assign"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public ExpParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public ExpParser(TokenStream input, int port, RecognizerSharedState state) {
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

public ExpParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return ExpParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\Resources\\Exp.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // D:\\Compiler\\Resources\\Exp.g:9:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // D:\\Compiler\\Resources\\Exp.g:10:5: ( ( stat )+ )
            dbg.enterAlt(1);

            // D:\\Compiler\\Resources\\Exp.g:10:10: ( stat )+
            {
            dbg.location(10,10);
            // D:\\Compiler\\Resources\\Exp.g:10:10: ( stat )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==TYPE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Compiler\\Resources\\Exp.g:10:10: stat
            	    {
            	    dbg.location(10,10);
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
        dbg.location(11, 4);

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
    // D:\\Compiler\\Resources\\Exp.g:13:1: stat : ( ID | TYPE ID '=' assign ';' );
    public final void stat() throws RecognitionException {
        Token ID1=null;
        Token ID2=null;
        int assign3 =0;


        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // D:\\Compiler\\Resources\\Exp.g:13:5: ( ID | TYPE ID '=' assign ';' )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==TYPE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Compiler\\Resources\\Exp.g:14:1: ID
                    {
                    dbg.location(14,1);
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_stat40); 
                    dbg.location(14,4);
                    System.out.println(ID1.value);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\Resources\\Exp.g:16:1: TYPE ID '=' assign ';'
                    {
                    dbg.location(16,1);
                    match(input,TYPE,FOLLOW_TYPE_in_stat48); 
                    dbg.location(16,6);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat50); 
                    dbg.location(16,9);
                    match(input,11,FOLLOW_11_in_stat52); 
                    dbg.location(16,13);
                    pushFollow(FOLLOW_assign_in_stat54);
                    assign3=assign();

                    state._fsp--;

                    dbg.location(16,20);
                    match(input,10,FOLLOW_10_in_stat56); 
                    dbg.location(16,23);
                    memory.put((ID2!=null?ID2.getText():null), new Double(assign3));

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
        dbg.location(18, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "assign"
    // D:\\Compiler\\Resources\\Exp.g:19:1: assign returns [int value] : ( Number | ID ( '+' ID | '-' ID )* );
    public final int assign() throws RecognitionException {
        int value = 0;


        Token ID4=null;

        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // D:\\Compiler\\Resources\\Exp.g:20:5: ( Number | ID ( '+' ID | '-' ID )* )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==Number) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // D:\\Compiler\\Resources\\Exp.g:20:9: Number
                    {
                    dbg.location(20,9);
                    match(input,Number,FOLLOW_Number_in_assign77); 
                    dbg.location(20,16);
                    value = Integer.parseInt($ID.text);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // D:\\Compiler\\Resources\\Exp.g:22:12: ID ( '+' ID | '-' ID )*
                    {
                    dbg.location(22,12);
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_assign101); 
                    dbg.location(22,15);
                    value = memory.get((ID4!=null?ID4.getText():null));
                    dbg.location(23,10);
                    // D:\\Compiler\\Resources\\Exp.g:23:10: ( '+' ID | '-' ID )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=3;
                        try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==8) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0==9) ) {
                            alt3=2;
                        }


                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // D:\\Compiler\\Resources\\Exp.g:23:12: '+' ID
                    	    {
                    	    dbg.location(23,12);
                    	    match(input,8,FOLLOW_8_in_assign117); 
                    	    dbg.location(23,16);
                    	    match(input,ID,FOLLOW_ID_in_assign119); 
                    	    dbg.location(23,19);
                    	    value += memory.get((ID4!=null?ID4.getText():null));

                    	    }
                    	    break;
                    	case 2 :
                    	    dbg.enterAlt(2);

                    	    // D:\\Compiler\\Resources\\Exp.g:24:12: '-' ID
                    	    {
                    	    dbg.location(24,12);
                    	    match(input,9,FOLLOW_9_in_assign134); 
                    	    dbg.location(24,16);
                    	    match(input,ID,FOLLOW_ID_in_assign136); 
                    	    dbg.location(24,19);
                    	    value -= memory.get((ID4!=null?ID4.getText():null));

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(3);}


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
        dbg.location(26, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "assign"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog26 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_ID_in_stat40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_stat48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_stat50 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stat52 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_assign_in_stat54 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_stat56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_assign77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign101 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_assign117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_assign119 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9_in_assign134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_assign136 = new BitSet(new long[]{0x0000000000000302L});

}