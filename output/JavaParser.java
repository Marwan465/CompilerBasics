// $ANTLR 3.4 D:\\Compiler\\lap\\Resources\\Java.g 2018-04-24 13:31:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "Comparators", "DNumber", "ELSE", "For", "ID", "IF", "IMPORT", "IMPORTs", "Number", "PRINT", "Return", "ReturnType", "TYPE", "TrigFunc", "WS", "While", "'\"!\"'", "'\"'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "', '", "'-'", "'--'", "'-='", "'/'", "'; '", "';'", "'='", "'class'", "'{'", "'}'", "'}; '"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\lap\\Resources\\Java.g"; }



    // $ANTLR start "start"
    // D:\\Compiler\\lap\\Resources\\Java.g:32:1: start : prog ;
    public final void start() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:32:8: ( prog )
            // D:\\Compiler\\lap\\Resources\\Java.g:32:10: prog
            {
            pushFollow(FOLLOW_prog_in_start301);
            prog();

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
    // $ANTLR end "start"



    // $ANTLR start "prog"
    // D:\\Compiler\\lap\\Resources\\Java.g:33:2: prog : ( declartion | ifelse | loops | assign | expr | class )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:34:6: ( ( declartion | ifelse | loops | assign | expr | class )+ )
            // D:\\Compiler\\lap\\Resources\\Java.g:34:8: ( declartion | ifelse | loops | assign | expr | class )+
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:34:8: ( declartion | ifelse | loops | assign | expr | class )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt1=1;
                    }
                    break;
                case IF:
                    {
                    alt1=2;
                    }
                    break;
                case For:
                case While:
                    {
                    alt1=3;
                    }
                    break;
                case ID:
                    {
                    int LA1_5 = input.LA(2);

                    if ( (LA1_5==36) ) {
                        alt1=4;
                    }
                    else if ( (LA1_5==EOF||LA1_5==DNumber||(LA1_5 >= For && LA1_5 <= IMPORT)||LA1_5==Number||(LA1_5 >= TYPE && LA1_5 <= TrigFunc)||LA1_5==While||LA1_5==23||(LA1_5 >= 25 && LA1_5 <= 26)||LA1_5==30||LA1_5==33||LA1_5==37) ) {
                        alt1=5;
                    }


                    }
                    break;
                case DNumber:
                case Number:
                case TrigFunc:
                case 23:
                    {
                    alt1=5;
                    }
                    break;
                case IMPORT:
                case 37:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:9: declartion
            	    {
            	    pushFollow(FOLLOW_declartion_in_prog316);
            	    declartion();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:22: ifelse
            	    {
            	    pushFollow(FOLLOW_ifelse_in_prog320);
            	    ifelse();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:32: loops
            	    {
            	    pushFollow(FOLLOW_loops_in_prog325);
            	    loops();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:40: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_prog329);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:49: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog333);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:34:57: class
            	    {
            	    pushFollow(FOLLOW_class_in_prog338);
            	    class();

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



    // $ANTLR start "no"
    // D:\\Compiler\\lap\\Resources\\Java.g:36:2: no : ( Number | DNumber ) ;
    public final void no() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:36:6: ( ( Number | DNumber ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:
            {
            if ( input.LA(1)==DNumber||input.LA(1)==Number ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "no"



    // $ANTLR start "declartion"
    // D:\\Compiler\\lap\\Resources\\Java.g:38:1: declartion : TYPE ID ( ', ' ID )* ( '=' ( expr )* )? ( ';' | '; ' ) ;
    public final void declartion() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:39:2: ( TYPE ID ( ', ' ID )* ( '=' ( expr )* )? ( ';' | '; ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:39:4: TYPE ID ( ', ' ID )* ( '=' ( expr )* )? ( ';' | '; ' )
            {
            match(input,TYPE,FOLLOW_TYPE_in_declartion372); 

            match(input,ID,FOLLOW_ID_in_declartion374); 

            // D:\\Compiler\\lap\\Resources\\Java.g:39:12: ( ', ' ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:39:13: ', ' ID
            	    {
            	    match(input,29,FOLLOW_29_in_declartion377); 

            	    match(input,ID,FOLLOW_ID_in_declartion379); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // D:\\Compiler\\lap\\Resources\\Java.g:39:23: ( '=' ( expr )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:39:24: '=' ( expr )*
                    {
                    match(input,36,FOLLOW_36_in_declartion384); 

                    // D:\\Compiler\\lap\\Resources\\Java.g:39:28: ( expr )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==DNumber||LA3_0==ID||LA3_0==Number||LA3_0==TrigFunc||LA3_0==23) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:39:30: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_declartion388);
                    	    expr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            if ( (input.LA(1) >= 34 && input.LA(1) <= 35) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "declartion"



    // $ANTLR start "param"
    // D:\\Compiler\\lap\\Resources\\Java.g:40:1: param : TYPE ID ( ', ' ID )* ;
    public final void param() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:41:2: ( TYPE ID ( ', ' ID )* )
            // D:\\Compiler\\lap\\Resources\\Java.g:41:4: TYPE ID ( ', ' ID )*
            {
            match(input,TYPE,FOLLOW_TYPE_in_param410); 

            match(input,ID,FOLLOW_ID_in_param412); 

            // D:\\Compiler\\lap\\Resources\\Java.g:41:12: ( ', ' ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:41:13: ', ' ID
            	    {
            	    match(input,29,FOLLOW_29_in_param415); 

            	    match(input,ID,FOLLOW_ID_in_param417); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
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
    // $ANTLR end "param"



    // $ANTLR start "print"
    // D:\\Compiler\\lap\\Resources\\Java.g:42:1: print : PRINT ( ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )* '; ' ) ;
    public final void print() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:42:8: ( PRINT ( ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )* '; ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:42:10: PRINT ( ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )* '; ' )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print428); 

            // D:\\Compiler\\lap\\Resources\\Java.g:42:17: ( ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )* '; ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:42:18: ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )* '; '
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:42:18: ( ID | no | ( '\"' ID '\"' ) | '\"!\"' )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt6=1;
                    }
                    break;
                case DNumber:
                case Number:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                    {
                    alt6=3;
                    }
                    break;
                case 21:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:20: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_print434); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:25: no
            	    {
            	    pushFollow(FOLLOW_no_in_print438);
            	    no();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:30: ( '\"' ID '\"' )
            	    {
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:30: ( '\"' ID '\"' )
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:31: '\"' ID '\"'
            	    {
            	    match(input,22,FOLLOW_22_in_print443); 

            	    match(input,ID,FOLLOW_ID_in_print445); 

            	    match(input,22,FOLLOW_22_in_print447); 

            	    }


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:42:45: '\"!\"'
            	    {
            	    match(input,21,FOLLOW_21_in_print452); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,34,FOLLOW_34_in_print456); 

            }


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
    // $ANTLR end "print"



    // $ANTLR start "assign"
    // D:\\Compiler\\lap\\Resources\\Java.g:43:1: assign : ID ( '=' ( expr )* ) ( ';' | '; ' ) ;
    public final void assign() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:43:9: ( ID ( '=' ( expr )* ) ( ';' | '; ' ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:43:11: ID ( '=' ( expr )* ) ( ';' | '; ' )
            {
            match(input,ID,FOLLOW_ID_in_assign465); 

            // D:\\Compiler\\lap\\Resources\\Java.g:43:14: ( '=' ( expr )* )
            // D:\\Compiler\\lap\\Resources\\Java.g:43:15: '=' ( expr )*
            {
            match(input,36,FOLLOW_36_in_assign468); 

            // D:\\Compiler\\lap\\Resources\\Java.g:43:19: ( expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DNumber||LA7_0==ID||LA7_0==Number||LA7_0==TrigFunc||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:43:21: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_assign472);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            if ( (input.LA(1) >= 34 && input.LA(1) <= 35) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "assign"



    // $ANTLR start "return"
    // D:\\Compiler\\lap\\Resources\\Java.g:44:1: return : Return ID '; ' ;
    public final void return() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:44:9: ( Return ID '; ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:44:11: Return ID '; '
            {
            match(input,Return,FOLLOW_Return_in_return491); 

            match(input,ID,FOLLOW_ID_in_return493); 

            match(input,34,FOLLOW_34_in_return495); 

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
    // $ANTLR end "return"



    // $ANTLR start "ifelse"
    // D:\\Compiler\\lap\\Resources\\Java.g:45:1: ifelse : IF '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment | print )* '}' ( else )? ;
    public final void ifelse() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:45:9: ( IF '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment | print )* '}' ( else )? )
            // D:\\Compiler\\lap\\Resources\\Java.g:45:11: IF '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment | print )* '}' ( else )?
            {
            match(input,IF,FOLLOW_IF_in_ifelse503); 

            match(input,23,FOLLOW_23_in_ifelse505); 

            pushFollow(FOLLOW_conition_in_ifelse507);
            conition();

            state._fsp--;


            match(input,24,FOLLOW_24_in_ifelse509); 

            match(input,38,FOLLOW_38_in_ifelse512); 

            // D:\\Compiler\\lap\\Resources\\Java.g:45:36: ( declartion | ifelse | loops | assign | increment | print )*
            loop8:
            do {
                int alt8=7;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt8=1;
                    }
                    break;
                case IF:
                    {
                    alt8=2;
                    }
                    break;
                case For:
                case While:
                    {
                    alt8=3;
                    }
                    break;
                case ID:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (LA8_5==36) ) {
                        alt8=4;
                    }
                    else if ( ((LA8_5 >= 27 && LA8_5 <= 28)||(LA8_5 >= 31 && LA8_5 <= 32)) ) {
                        alt8=5;
                    }


                    }
                    break;
                case PRINT:
                    {
                    alt8=6;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:37: declartion
            	    {
            	    pushFollow(FOLLOW_declartion_in_ifelse515);
            	    declartion();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:50: ifelse
            	    {
            	    pushFollow(FOLLOW_ifelse_in_ifelse519);
            	    ifelse();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:60: loops
            	    {
            	    pushFollow(FOLLOW_loops_in_ifelse524);
            	    loops();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:68: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_ifelse528);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:77: increment
            	    {
            	    pushFollow(FOLLOW_increment_in_ifelse532);
            	    increment();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:45:89: print
            	    {
            	    pushFollow(FOLLOW_print_in_ifelse536);
            	    print();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,39,FOLLOW_39_in_ifelse540); 

            // D:\\Compiler\\lap\\Resources\\Java.g:45:101: ( else )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:45:101: else
                    {
                    pushFollow(FOLLOW_else_in_ifelse542);
                    else();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "ifelse"



    // $ANTLR start "else"
    // D:\\Compiler\\lap\\Resources\\Java.g:46:1: else : ELSE '{' ( declartion | ifelse | loops | assign | increment )* '}' ;
    public final void else() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:46:7: ( ELSE '{' ( declartion | ifelse | loops | assign | increment )* '}' )
            // D:\\Compiler\\lap\\Resources\\Java.g:46:9: ELSE '{' ( declartion | ifelse | loops | assign | increment )* '}'
            {
            match(input,ELSE,FOLLOW_ELSE_in_else551); 

            match(input,38,FOLLOW_38_in_else554); 

            // D:\\Compiler\\lap\\Resources\\Java.g:46:19: ( declartion | ifelse | loops | assign | increment )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt10=1;
                    }
                    break;
                case IF:
                    {
                    alt10=2;
                    }
                    break;
                case For:
                case While:
                    {
                    alt10=3;
                    }
                    break;
                case ID:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (LA10_5==36) ) {
                        alt10=4;
                    }
                    else if ( ((LA10_5 >= 27 && LA10_5 <= 28)||(LA10_5 >= 31 && LA10_5 <= 32)) ) {
                        alt10=5;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:46:20: declartion
            	    {
            	    pushFollow(FOLLOW_declartion_in_else557);
            	    declartion();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:46:33: ifelse
            	    {
            	    pushFollow(FOLLOW_ifelse_in_else561);
            	    ifelse();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:46:43: loops
            	    {
            	    pushFollow(FOLLOW_loops_in_else566);
            	    loops();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:46:51: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_else570);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:46:60: increment
            	    {
            	    pushFollow(FOLLOW_increment_in_else574);
            	    increment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,39,FOLLOW_39_in_else578); 

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
    // $ANTLR end "else"



    // $ANTLR start "loops"
    // D:\\Compiler\\lap\\Resources\\Java.g:48:1: loops : ( ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' ) | ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' ) ) ;
    public final void loops() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:48:8: ( ( ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' ) | ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' ) ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:48:10: ( ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' ) | ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' ) )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:48:10: ( ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' ) | ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==For) ) {
                alt13=1;
            }
            else if ( (LA13_0==While) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:48:11: ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:48:11: ( For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}' )
                    // D:\\Compiler\\lap\\Resources\\Java.g:48:12: For '(' declartion conition '; ' increment ')' '{' ( declartion | ifelse | loops | assign | increment | print )+ '}'
                    {
                    match(input,For,FOLLOW_For_in_loops589); 

                    match(input,23,FOLLOW_23_in_loops591); 

                    pushFollow(FOLLOW_declartion_in_loops593);
                    declartion();

                    state._fsp--;


                    pushFollow(FOLLOW_conition_in_loops596);
                    conition();

                    state._fsp--;


                    match(input,34,FOLLOW_34_in_loops599); 

                    pushFollow(FOLLOW_increment_in_loops601);
                    increment();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_loops603); 

                    match(input,38,FOLLOW_38_in_loops606); 

                    // D:\\Compiler\\lap\\Resources\\Java.g:48:66: ( declartion | ifelse | loops | assign | increment | print )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=7;
                        switch ( input.LA(1) ) {
                        case TYPE:
                            {
                            alt11=1;
                            }
                            break;
                        case IF:
                            {
                            alt11=2;
                            }
                            break;
                        case For:
                        case While:
                            {
                            alt11=3;
                            }
                            break;
                        case ID:
                            {
                            int LA11_5 = input.LA(2);

                            if ( (LA11_5==36) ) {
                                alt11=4;
                            }
                            else if ( ((LA11_5 >= 27 && LA11_5 <= 28)||(LA11_5 >= 31 && LA11_5 <= 32)) ) {
                                alt11=5;
                            }


                            }
                            break;
                        case PRINT:
                            {
                            alt11=6;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:67: declartion
                    	    {
                    	    pushFollow(FOLLOW_declartion_in_loops609);
                    	    declartion();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:80: ifelse
                    	    {
                    	    pushFollow(FOLLOW_ifelse_in_loops613);
                    	    ifelse();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:90: loops
                    	    {
                    	    pushFollow(FOLLOW_loops_in_loops618);
                    	    loops();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 4 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:98: assign
                    	    {
                    	    pushFollow(FOLLOW_assign_in_loops622);
                    	    assign();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 5 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:107: increment
                    	    {
                    	    pushFollow(FOLLOW_increment_in_loops626);
                    	    increment();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 6 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:48:119: print
                    	    {
                    	    pushFollow(FOLLOW_print_in_loops630);
                    	    print();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    match(input,39,FOLLOW_39_in_loops634); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:49:13: ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:49:13: ( While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}' )
                    // D:\\Compiler\\lap\\Resources\\Java.g:49:14: While '(' conition ')' '{' ( declartion | ifelse | loops | assign | increment )+ '}'
                    {
                    match(input,While,FOLLOW_While_in_loops651); 

                    match(input,23,FOLLOW_23_in_loops653); 

                    pushFollow(FOLLOW_conition_in_loops655);
                    conition();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_loops657); 

                    match(input,38,FOLLOW_38_in_loops659); 

                    // D:\\Compiler\\lap\\Resources\\Java.g:49:40: ( declartion | ifelse | loops | assign | increment )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=6;
                        switch ( input.LA(1) ) {
                        case TYPE:
                            {
                            alt12=1;
                            }
                            break;
                        case IF:
                            {
                            alt12=2;
                            }
                            break;
                        case For:
                        case While:
                            {
                            alt12=3;
                            }
                            break;
                        case ID:
                            {
                            int LA12_5 = input.LA(2);

                            if ( (LA12_5==36) ) {
                                alt12=4;
                            }
                            else if ( ((LA12_5 >= 27 && LA12_5 <= 28)||(LA12_5 >= 31 && LA12_5 <= 32)) ) {
                                alt12=5;
                            }


                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:49:41: declartion
                    	    {
                    	    pushFollow(FOLLOW_declartion_in_loops661);
                    	    declartion();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:49:54: ifelse
                    	    {
                    	    pushFollow(FOLLOW_ifelse_in_loops665);
                    	    ifelse();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:49:64: loops
                    	    {
                    	    pushFollow(FOLLOW_loops_in_loops670);
                    	    loops();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 4 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:49:72: assign
                    	    {
                    	    pushFollow(FOLLOW_assign_in_loops674);
                    	    assign();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 5 :
                    	    // D:\\Compiler\\lap\\Resources\\Java.g:49:81: increment
                    	    {
                    	    pushFollow(FOLLOW_increment_in_loops678);
                    	    increment();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match(input,39,FOLLOW_39_in_loops682); 

                    }


                    }
                    break;

            }


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
    // $ANTLR end "loops"



    // $ANTLR start "class"
    // D:\\Compiler\\lap\\Resources\\Java.g:51:1: class : ( IMPORT )? 'class' ID '{' ( declartion | ifelse | loops | assign | increment | method )+ '}' declartion '}; ' ;
    public final void class() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:51:8: ( ( IMPORT )? 'class' ID '{' ( declartion | ifelse | loops | assign | increment | method )+ '}' declartion '}; ' )
            // D:\\Compiler\\lap\\Resources\\Java.g:51:10: ( IMPORT )? 'class' ID '{' ( declartion | ifelse | loops | assign | increment | method )+ '}' declartion '}; '
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:51:10: ( IMPORT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IMPORT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:51:10: IMPORT
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_class694); 

                    }
                    break;

            }


            match(input,37,FOLLOW_37_in_class697); 

            match(input,ID,FOLLOW_ID_in_class699); 

            match(input,38,FOLLOW_38_in_class701); 

            // D:\\Compiler\\lap\\Resources\\Java.g:51:34: ( declartion | ifelse | loops | assign | increment | method )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt15=1;
                    }
                    break;
                case IF:
                    {
                    alt15=2;
                    }
                    break;
                case For:
                case While:
                    {
                    alt15=3;
                    }
                    break;
                case ID:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (LA15_5==36) ) {
                        alt15=4;
                    }
                    else if ( ((LA15_5 >= 27 && LA15_5 <= 28)||(LA15_5 >= 31 && LA15_5 <= 32)) ) {
                        alt15=5;
                    }


                    }
                    break;
                case ReturnType:
                    {
                    alt15=6;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:35: declartion
            	    {
            	    pushFollow(FOLLOW_declartion_in_class705);
            	    declartion();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:48: ifelse
            	    {
            	    pushFollow(FOLLOW_ifelse_in_class709);
            	    ifelse();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:58: loops
            	    {
            	    pushFollow(FOLLOW_loops_in_class714);
            	    loops();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:66: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_class718);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:75: increment
            	    {
            	    pushFollow(FOLLOW_increment_in_class722);
            	    increment();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:51:87: method
            	    {
            	    pushFollow(FOLLOW_method_in_class726);
            	    method();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input,39,FOLLOW_39_in_class731); 

            pushFollow(FOLLOW_declartion_in_class745);
            declartion();

            state._fsp--;


            match(input,40,FOLLOW_40_in_class747); 

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
    // $ANTLR end "class"



    // $ANTLR start "method"
    // D:\\Compiler\\lap\\Resources\\Java.g:54:1: method : ReturnType ID '(' ( param )? ')' '{' ( declartion | ifelse | loops | assign | increment | print )* ( return )? '}' ;
    public final void method() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:54:9: ( ReturnType ID '(' ( param )? ')' '{' ( declartion | ifelse | loops | assign | increment | print )* ( return )? '}' )
            // D:\\Compiler\\lap\\Resources\\Java.g:54:11: ReturnType ID '(' ( param )? ')' '{' ( declartion | ifelse | loops | assign | increment | print )* ( return )? '}'
            {
            match(input,ReturnType,FOLLOW_ReturnType_in_method756); 

            match(input,ID,FOLLOW_ID_in_method758); 

            match(input,23,FOLLOW_23_in_method760); 

            // D:\\Compiler\\lap\\Resources\\Java.g:54:29: ( param )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TYPE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:54:29: param
                    {
                    pushFollow(FOLLOW_param_in_method762);
                    param();

                    state._fsp--;


                    }
                    break;

            }


            match(input,24,FOLLOW_24_in_method765); 

            match(input,38,FOLLOW_38_in_method767); 

            // D:\\Compiler\\lap\\Resources\\Java.g:54:44: ( declartion | ifelse | loops | assign | increment | print )*
            loop17:
            do {
                int alt17=7;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt17=1;
                    }
                    break;
                case IF:
                    {
                    alt17=2;
                    }
                    break;
                case For:
                case While:
                    {
                    alt17=3;
                    }
                    break;
                case ID:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (LA17_5==36) ) {
                        alt17=4;
                    }
                    else if ( ((LA17_5 >= 27 && LA17_5 <= 28)||(LA17_5 >= 31 && LA17_5 <= 32)) ) {
                        alt17=5;
                    }


                    }
                    break;
                case PRINT:
                    {
                    alt17=6;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:45: declartion
            	    {
            	    pushFollow(FOLLOW_declartion_in_method770);
            	    declartion();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:58: ifelse
            	    {
            	    pushFollow(FOLLOW_ifelse_in_method774);
            	    ifelse();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:68: loops
            	    {
            	    pushFollow(FOLLOW_loops_in_method779);
            	    loops();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:76: assign
            	    {
            	    pushFollow(FOLLOW_assign_in_method783);
            	    assign();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:85: increment
            	    {
            	    pushFollow(FOLLOW_increment_in_method787);
            	    increment();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:54:97: print
            	    {
            	    pushFollow(FOLLOW_print_in_method791);
            	    print();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // D:\\Compiler\\lap\\Resources\\Java.g:54:107: ( return )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Return) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:54:107: return
                    {
                    pushFollow(FOLLOW_return_in_method797);
                    return();

                    state._fsp--;


                    }
                    break;

            }


            match(input,39,FOLLOW_39_in_method799); 

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
    // $ANTLR end "method"



    // $ANTLR start "conition"
    // D:\\Compiler\\lap\\Resources\\Java.g:57:1: conition : ( ID | no ) Comparators ( ID | no ) ;
    public final void conition() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:58:2: ( ( ID | no ) Comparators ( ID | no ) )
            // D:\\Compiler\\lap\\Resources\\Java.g:58:4: ( ID | no ) Comparators ( ID | no )
            {
            // D:\\Compiler\\lap\\Resources\\Java.g:58:4: ( ID | no )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==DNumber||LA19_0==Number) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:58:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_conition816); 

                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:58:10: no
                    {
                    pushFollow(FOLLOW_no_in_conition820);
                    no();

                    state._fsp--;


                    }
                    break;

            }


            match(input,Comparators,FOLLOW_Comparators_in_conition823); 

            // D:\\Compiler\\lap\\Resources\\Java.g:58:26: ( ID | no )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==DNumber||LA20_0==Number) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:58:27: ID
                    {
                    match(input,ID,FOLLOW_ID_in_conition826); 

                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:58:32: no
                    {
                    pushFollow(FOLLOW_no_in_conition830);
                    no();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "conition"



    // $ANTLR start "increment"
    // D:\\Compiler\\lap\\Resources\\Java.g:60:1: increment : ID ( ( '++' | '--' ) | ( ( '+=' | '-=' ) no ) ) ( ';' )? ;
    public final void increment() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:61:2: ( ID ( ( '++' | '--' ) | ( ( '+=' | '-=' ) no ) ) ( ';' )? )
            // D:\\Compiler\\lap\\Resources\\Java.g:61:4: ID ( ( '++' | '--' ) | ( ( '+=' | '-=' ) no ) ) ( ';' )?
            {
            match(input,ID,FOLLOW_ID_in_increment842); 

            // D:\\Compiler\\lap\\Resources\\Java.g:61:7: ( ( '++' | '--' ) | ( ( '+=' | '-=' ) no ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27||LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==28||LA21_0==32) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:61:8: ( '++' | '--' )
                    {
                    if ( input.LA(1)==27||input.LA(1)==31 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:61:24: ( ( '+=' | '-=' ) no )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:61:24: ( ( '+=' | '-=' ) no )
                    // D:\\Compiler\\lap\\Resources\\Java.g:61:25: ( '+=' | '-=' ) no
                    {
                    if ( input.LA(1)==28||input.LA(1)==32 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_no_in_increment864);
                    no();

                    state._fsp--;


                    }


                    }
                    break;

            }


            // D:\\Compiler\\lap\\Resources\\Java.g:61:44: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:61:44: ';'
                    {
                    match(input,35,FOLLOW_35_in_increment868); 

                    }
                    break;

            }


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
    // $ANTLR end "increment"



    // $ANTLR start "expr"
    // D:\\Compiler\\lap\\Resources\\Java.g:62:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:62:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // D:\\Compiler\\lap\\Resources\\Java.g:62:7: multExpr ( ( '+' | '-' ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr875);
            multExpr();

            state._fsp--;


            // D:\\Compiler\\lap\\Resources\\Java.g:62:16: ( ( '+' | '-' ) multExpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26||LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:62:17: ( '+' | '-' ) multExpr
            	    {
            	    if ( input.LA(1)==26||input.LA(1)==30 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr886);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // D:\\Compiler\\lap\\Resources\\Java.g:65:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:66:3: ( atom ( ( '*' | '/' ) atom )* )
            // D:\\Compiler\\lap\\Resources\\Java.g:66:3: atom ( ( '*' | '/' ) atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr897);
            atom();

            state._fsp--;


            // D:\\Compiler\\lap\\Resources\\Java.g:66:8: ( ( '*' | '/' ) atom )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25||LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Compiler\\lap\\Resources\\Java.g:66:9: ( '*' | '/' ) atom
            	    {
            	    if ( input.LA(1)==25||input.LA(1)==33 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_atom_in_multExpr906);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
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
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // D:\\Compiler\\lap\\Resources\\Java.g:69:1: atom : ( ( Number | DNumber | TrigFunc '(' ( expr ) ')' ) | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try {
            // D:\\Compiler\\lap\\Resources\\Java.g:69:5: ( ( Number | DNumber | TrigFunc '(' ( expr ) ')' ) | ID | '(' expr ')' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case DNumber:
            case Number:
            case TrigFunc:
                {
                alt26=1;
                }
                break;
            case ID:
                {
                alt26=2;
                }
                break;
            case 23:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:69:7: ( Number | DNumber | TrigFunc '(' ( expr ) ')' )
                    {
                    // D:\\Compiler\\lap\\Resources\\Java.g:69:7: ( Number | DNumber | TrigFunc '(' ( expr ) ')' )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case Number:
                        {
                        alt25=1;
                        }
                        break;
                    case DNumber:
                        {
                        alt25=2;
                        }
                        break;
                    case TrigFunc:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // D:\\Compiler\\lap\\Resources\\Java.g:69:8: Number
                            {
                            match(input,Number,FOLLOW_Number_in_atom917); 

                            }
                            break;
                        case 2 :
                            // D:\\Compiler\\lap\\Resources\\Java.g:69:17: DNumber
                            {
                            match(input,DNumber,FOLLOW_DNumber_in_atom921); 

                            }
                            break;
                        case 3 :
                            // D:\\Compiler\\lap\\Resources\\Java.g:69:27: TrigFunc '(' ( expr ) ')'
                            {
                            match(input,TrigFunc,FOLLOW_TrigFunc_in_atom925); 

                            match(input,23,FOLLOW_23_in_atom927); 

                            // D:\\Compiler\\lap\\Resources\\Java.g:69:40: ( expr )
                            // D:\\Compiler\\lap\\Resources\\Java.g:69:41: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom930);
                            expr();

                            state._fsp--;


                            }


                            match(input,24,FOLLOW_24_in_atom933); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:70:3: ID
                    {
                    match(input,ID,FOLLOW_ID_in_atom939); 

                    }
                    break;
                case 3 :
                    // D:\\Compiler\\lap\\Resources\\Java.g:71:3: '(' expr ')'
                    {
                    match(input,23,FOLLOW_23_in_atom943); 

                    pushFollow(FOLLOW_expr_in_atom945);
                    expr();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_atom947); 

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


 

    public static final BitSet FOLLOW_prog_in_start301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declartion_in_prog316 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_ifelse_in_prog320 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_loops_in_prog325 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_assign_in_prog329 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_expr_in_prog333 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_class_in_prog338 = new BitSet(new long[]{0x0000002000962F42L});
    public static final BitSet FOLLOW_TYPE_in_declartion372 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_declartion374 = new BitSet(new long[]{0x0000001C20000000L});
    public static final BitSet FOLLOW_29_in_declartion377 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_declartion379 = new BitSet(new long[]{0x0000001C20000000L});
    public static final BitSet FOLLOW_36_in_declartion384 = new BitSet(new long[]{0x0000000C00842240L});
    public static final BitSet FOLLOW_expr_in_declartion388 = new BitSet(new long[]{0x0000000C00842240L});
    public static final BitSet FOLLOW_set_in_declartion396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_param410 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_param412 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_param415 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_param417 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_PRINT_in_print428 = new BitSet(new long[]{0x0000000400602240L});
    public static final BitSet FOLLOW_ID_in_print434 = new BitSet(new long[]{0x0000000400602240L});
    public static final BitSet FOLLOW_no_in_print438 = new BitSet(new long[]{0x0000000400602240L});
    public static final BitSet FOLLOW_22_in_print443 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_print445 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_print447 = new BitSet(new long[]{0x0000000400602240L});
    public static final BitSet FOLLOW_21_in_print452 = new BitSet(new long[]{0x0000000400602240L});
    public static final BitSet FOLLOW_34_in_print456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign465 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_assign468 = new BitSet(new long[]{0x0000000C00842240L});
    public static final BitSet FOLLOW_expr_in_assign472 = new BitSet(new long[]{0x0000000C00842240L});
    public static final BitSet FOLLOW_set_in_assign479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_return491 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_return493 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_return495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifelse503 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ifelse505 = new BitSet(new long[]{0x0000000000002240L});
    public static final BitSet FOLLOW_conition_in_ifelse507 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ifelse509 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ifelse512 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_declartion_in_ifelse515 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_ifelse_in_ifelse519 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_loops_in_ifelse524 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_assign_in_ifelse528 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_increment_in_ifelse532 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_print_in_ifelse536 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_39_in_ifelse540 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_else_in_ifelse542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else551 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_else554 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_declartion_in_else557 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_ifelse_in_else561 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_loops_in_else566 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_assign_in_else570 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_increment_in_else574 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_39_in_else578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_loops589 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_loops591 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_declartion_in_loops593 = new BitSet(new long[]{0x0000000000002240L});
    public static final BitSet FOLLOW_conition_in_loops596 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_loops599 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_increment_in_loops601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_loops603 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_loops606 = new BitSet(new long[]{0x0000000000124700L});
    public static final BitSet FOLLOW_declartion_in_loops609 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_ifelse_in_loops613 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_loops_in_loops618 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_assign_in_loops622 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_increment_in_loops626 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_print_in_loops630 = new BitSet(new long[]{0x0000008000124700L});
    public static final BitSet FOLLOW_39_in_loops634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_loops651 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_loops653 = new BitSet(new long[]{0x0000000000002240L});
    public static final BitSet FOLLOW_conition_in_loops655 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_loops657 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_loops659 = new BitSet(new long[]{0x0000000000120700L});
    public static final BitSet FOLLOW_declartion_in_loops661 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_ifelse_in_loops665 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_loops_in_loops670 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_assign_in_loops674 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_increment_in_loops678 = new BitSet(new long[]{0x0000008000120700L});
    public static final BitSet FOLLOW_39_in_loops682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_class694 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_class697 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_class699 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_class701 = new BitSet(new long[]{0x0000000000130700L});
    public static final BitSet FOLLOW_declartion_in_class705 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_ifelse_in_class709 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_loops_in_class714 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_assign_in_class718 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_increment_in_class722 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_method_in_class726 = new BitSet(new long[]{0x0000008000130700L});
    public static final BitSet FOLLOW_39_in_class731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_declartion_in_class745 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_class747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ReturnType_in_method756 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_method758 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_method760 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_param_in_method762 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_method765 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_method767 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_declartion_in_method770 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_ifelse_in_method774 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_loops_in_method779 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_assign_in_method783 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_increment_in_method787 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_print_in_method791 = new BitSet(new long[]{0x000000800012C700L});
    public static final BitSet FOLLOW_return_in_method797 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_method799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_conition816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_no_in_conition820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Comparators_in_conition823 = new BitSet(new long[]{0x0000000000002240L});
    public static final BitSet FOLLOW_ID_in_conition826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_in_conition830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_increment842 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_set_in_increment845 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_set_in_increment856 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_no_in_increment864 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_increment868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr875 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_set_in_expr878 = new BitSet(new long[]{0x0000000000842240L});
    public static final BitSet FOLLOW_multExpr_in_expr886 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_atom_in_multExpr897 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_set_in_multExpr900 = new BitSet(new long[]{0x0000000000842240L});
    public static final BitSet FOLLOW_atom_in_multExpr906 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_Number_in_atom917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNumber_in_atom921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TrigFunc_in_atom925 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_atom927 = new BitSet(new long[]{0x0000000000842240L});
    public static final BitSet FOLLOW_expr_in_atom930 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_atom933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_atom943 = new BitSet(new long[]{0x0000000000842240L});
    public static final BitSet FOLLOW_expr_in_atom945 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_atom947 = new BitSet(new long[]{0x0000000000000002L});

}