/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVariavelAccess().getAlternatives(), "rule__Variavel__Alternatives");
					put(grammarAccess.getComputeAccess().getGroup(), "rule__Compute__Group__0");
					put(grammarAccess.getParametroAccess().getGroup(), "rule__Parametro__Group__0");
					put(grammarAccess.getRecursivoAccess().getGroup(), "rule__Recursivo__Group__0");
					put(grammarAccess.getComparacaoAccess().getGroup(), "rule__Comparacao__Group__0");
					put(grammarAccess.getModelAccess().getComputeAssignment(), "rule__Model__ComputeAssignment");
					put(grammarAccess.getParametroAccess().getExpAssignment_1(), "rule__Parametro__ExpAssignment_1");
					put(grammarAccess.getParametroAccess().getVarAssignment_2(), "rule__Parametro__VarAssignment_2");
					put(grammarAccess.getRecursivoAccess().getNameAssignment_1(), "rule__Recursivo__NameAssignment_1");
					put(grammarAccess.getRecursivoAccess().getNameAssignment_3(), "rule__Recursivo__NameAssignment_3");
					put(grammarAccess.getRecursivoAccess().getNameAssignment_4(), "rule__Recursivo__NameAssignment_4");
					put(grammarAccess.getRecursivoAccess().getNameAssignment_5(), "rule__Recursivo__NameAssignment_5");
					put(grammarAccess.getComparacaoAccess().getNameAssignment_1(), "rule__Comparacao__NameAssignment_1");
					put(grammarAccess.getComparacaoAccess().getNameAssignment_2(), "rule__Comparacao__NameAssignment_2");
					put(grammarAccess.getComparacaoAccess().getNameAssignment_3(), "rule__Comparacao__NameAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
