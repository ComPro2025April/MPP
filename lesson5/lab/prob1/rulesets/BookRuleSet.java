package lesson5.lab.prob1.rulesets;

import lesson5.lab.prob1.gui.BookWindow;

import javax.swing.*;
import java.awt.Component;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		if (!(ob instanceof BookWindow)) {
			throw new RuleException("Invalid component for rule check");
		}

		String isbn = ((BookWindow) ob).getIsbnValue();
		String title = ((BookWindow) ob).getTitleValue();
		String price = ((BookWindow) ob).getPriceValue();

		// 1. All fields must be nonempty
		if(isbn.isEmpty() || title.isEmpty() || price.isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

		// 2. Isbn must be numeric and consist of either 10 or 13 characters
		try{
			if(isbn.length() != 10 && isbn.length() != 13) {
				throw new RuleException("ISBN should be either 10 or 13 characters");
			}

			//3. If Isbn has length 10, the first digit must be 0 or 1
			if(isbn.length() == 10){
				if(isbn.charAt(0) != '0' || isbn.charAt(1) != '0') {
					throw new RuleException("first digit must be 0 or 1");
				}
			}
			//4. If Isbn has length 13, the first 3 digits must be either 978 or 979
			if(isbn.length() == 13){
				if(isbn.substring(0,3) != "978" || isbn.substring(0,3) != "979") {
					throw new RuleException("first 3 digits must be either 978 or 979");
				}
			}

		} catch (NumberFormatException e) {
			throw new RuleException("ISBN must be an integer");
		}

		//5. Price must be a floating point number with two decimal places
		try{
			Double priceDouble = Double.parseDouble(price);

			String priceText = price.trim();
			if (!priceText.matches("^\\d+\\.\\d{2}$")) {
				throw new RuleException("Price must be a floating point number with two decimal places");
			}

			//6. Price must be a number greater than 0.49.
			if(priceDouble <= 0.49)
				throw new RuleException("price must be greater than 0.49");
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}

	}

	private Component getComponentByName(JPanel panel, String name) {
		for (Component comp : panel.getComponents()) {
			if (name.equals(comp.getName())) {
				return comp;
			}
		}
		throw new IllegalArgumentException("Component with name '" + name + "' not found");
	}
}
