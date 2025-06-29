package lesson5.lab.prob1.rulesets;

import lesson5.lab.prob1.gui.BookWindow;
import lesson5.lab.prob1.gui.CDWindow;

import java.awt.Component;
import java.util.HashMap;

final public class RuleSetFactory {
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}

	private RuleSetFactory(){

	}

	public static RuleSet getRuleSet(Component component) {
		if (component == null) throw new IllegalArgumentException("Component cannot be null.");
		RuleSet ruleSet = map.get(component.getClass());
		if (ruleSet == null) throw new IllegalArgumentException("No RuleSet found for this component: " + component.getClass().getSimpleName());
		return ruleSet;
	}
}