package lesson5.lab.prob1.rulesets;

import lesson5.lab.prob1.gui.BookWindow;
import lesson5.lab.prob1.gui.CDWindow;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		if (!(ob instanceof CDWindow)) {
			throw new RuleException("Invalid component for rule check");
		}

		String artist = ((CDWindow) ob).getArtistValue();
		String title = ((CDWindow) ob).getTitleValue();
		String price = ((CDWindow) ob).getPriceValue();

		//1. All fields must be nonempty
		if(artist.isEmpty() || title.isEmpty() || price.isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

		//2. Price must be a floating point number with two decimal places
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
	
}
