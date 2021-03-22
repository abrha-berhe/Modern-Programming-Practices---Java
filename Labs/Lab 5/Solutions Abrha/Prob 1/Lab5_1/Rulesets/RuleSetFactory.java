package Lab5_1.Rulesets;

import java.awt.Component;
import java.util.HashMap;

import Lab5_1.GUI.*;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(CDWindow.class, new CDRuleSet());
		map.put(BookWindow.class, new BookRuleSet());
	}

	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if (!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
	
}
