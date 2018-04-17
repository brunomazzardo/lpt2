package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTERS", "RULE_DIGIT", "RULE_RESULTADO", "RULE_SINAL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(define'", "')'", "'('"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=5;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LETTERS=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_SINAL=7;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_RESULTADO=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_compute_0_0= ruleCompute ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_compute_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_compute_0_0= ruleCompute ) ) )
            // InternalMyDsl.g:78:2: ( (lv_compute_0_0= ruleCompute ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_compute_0_0= ruleCompute ) )
            // InternalMyDsl.g:79:3: (lv_compute_0_0= ruleCompute )
            {
            // InternalMyDsl.g:79:3: (lv_compute_0_0= ruleCompute )
            // InternalMyDsl.g:80:4: lv_compute_0_0= ruleCompute
            {

            				newCompositeNode(grammarAccess.getModelAccess().getComputeComputeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_compute_0_0=ruleCompute();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"compute",
            					lv_compute_0_0,
            					"org.xtext.example.mydsl.MyDsl.Compute");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompute"
    // InternalMyDsl.g:100:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalMyDsl.g:101:2: iv_ruleCompute= ruleCompute EOF
            {
             newCompositeNode(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompute=ruleCompute();

            state._fsp--;

             current =iv_ruleCompute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalMyDsl.g:107:1: ruleCompute returns [EObject current=null] : (otherlv_0= '(define' this_Parametro_1= ruleParametro otherlv_2= ')' ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Parametro_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= '(define' this_Parametro_1= ruleParametro otherlv_2= ')' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= '(define' this_Parametro_1= ruleParametro otherlv_2= ')' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= '(define' this_Parametro_1= ruleParametro otherlv_2= ')' )
            // InternalMyDsl.g:115:3: otherlv_0= '(define' this_Parametro_1= ruleParametro otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getDefineKeyword_0());
            		

            			newCompositeNode(grammarAccess.getComputeAccess().getParametroParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            this_Parametro_1=ruleParametro();

            state._fsp--;


            			current = this_Parametro_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getComputeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:135:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:135:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:136:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:142:1: ruleParametro returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleexpressao ) ) ( (lv_var_2_0= rulevariavel ) ) otherlv_3= ')' ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_exp_1_0 = null;

        AntlrDatatypeRuleToken lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:148:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleexpressao ) ) ( (lv_var_2_0= rulevariavel ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:149:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleexpressao ) ) ( (lv_var_2_0= rulevariavel ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:149:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleexpressao ) ) ( (lv_var_2_0= rulevariavel ) ) otherlv_3= ')' )
            // InternalMyDsl.g:150:3: otherlv_0= '(' ( (lv_exp_1_0= ruleexpressao ) ) ( (lv_var_2_0= rulevariavel ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParametroAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:154:3: ( (lv_exp_1_0= ruleexpressao ) )
            // InternalMyDsl.g:155:4: (lv_exp_1_0= ruleexpressao )
            {
            // InternalMyDsl.g:155:4: (lv_exp_1_0= ruleexpressao )
            // InternalMyDsl.g:156:5: lv_exp_1_0= ruleexpressao
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getExpExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_exp_1_0=ruleexpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"org.xtext.example.mydsl.MyDsl.expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:173:3: ( (lv_var_2_0= rulevariavel ) )
            // InternalMyDsl.g:174:4: (lv_var_2_0= rulevariavel )
            {
            // InternalMyDsl.g:174:4: (lv_var_2_0= rulevariavel )
            // InternalMyDsl.g:175:5: lv_var_2_0= rulevariavel
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getVarVariavelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_var_2_0=rulevariavel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.xtext.example.mydsl.MyDsl.variavel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParametroAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleexpressao"
    // InternalMyDsl.g:200:1: entryRuleexpressao returns [String current=null] : iv_ruleexpressao= ruleexpressao EOF ;
    public final String entryRuleexpressao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpressao = null;


        try {
            // InternalMyDsl.g:200:49: (iv_ruleexpressao= ruleexpressao EOF )
            // InternalMyDsl.g:201:2: iv_ruleexpressao= ruleexpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpressao=ruleexpressao();

            state._fsp--;

             current =iv_ruleexpressao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressao"


    // $ANTLR start "ruleexpressao"
    // InternalMyDsl.g:207:1: ruleexpressao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_letters_0= RULE_LETTERS ;
    public final AntlrDatatypeRuleToken ruleexpressao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_letters_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:213:2: (this_letters_0= RULE_LETTERS )
            // InternalMyDsl.g:214:2: this_letters_0= RULE_LETTERS
            {
            this_letters_0=(Token)match(input,RULE_LETTERS,FOLLOW_2); 

            		current.merge(this_letters_0);
            	

            		newLeafNode(this_letters_0, grammarAccess.getExpressaoAccess().getLettersTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressao"


    // $ANTLR start "entryRulevariavel"
    // InternalMyDsl.g:224:1: entryRulevariavel returns [String current=null] : iv_rulevariavel= rulevariavel EOF ;
    public final String entryRulevariavel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariavel = null;


        try {
            // InternalMyDsl.g:224:48: (iv_rulevariavel= rulevariavel EOF )
            // InternalMyDsl.g:225:2: iv_rulevariavel= rulevariavel EOF
            {
             newCompositeNode(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariavel=rulevariavel();

            state._fsp--;

             current =iv_rulevariavel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariavel"


    // $ANTLR start "rulevariavel"
    // InternalMyDsl.g:231:1: rulevariavel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_letters_0= RULE_LETTERS | this_digit_1= RULE_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulevariavel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_letters_0=null;
        Token this_digit_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( (this_letters_0= RULE_LETTERS | this_digit_1= RULE_DIGIT ) )
            // InternalMyDsl.g:238:2: (this_letters_0= RULE_LETTERS | this_digit_1= RULE_DIGIT )
            {
            // InternalMyDsl.g:238:2: (this_letters_0= RULE_LETTERS | this_digit_1= RULE_DIGIT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LETTERS) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_DIGIT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:239:3: this_letters_0= RULE_LETTERS
                    {
                    this_letters_0=(Token)match(input,RULE_LETTERS,FOLLOW_2); 

                    			current.merge(this_letters_0);
                    		

                    			newLeafNode(this_letters_0, grammarAccess.getVariavelAccess().getLettersTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:247:3: this_digit_1= RULE_DIGIT
                    {
                    this_digit_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_digit_1);
                    		

                    			newLeafNode(this_digit_1, grammarAccess.getVariavelAccess().getDigitTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariavel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});

}