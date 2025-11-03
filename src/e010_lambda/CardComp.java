package e010_lambda;

import java.util.Comparator;

public class CardComp implements Comparator<Card>{
	@Override
	public int compare(Card c1, Card c2) {
		return c1.getDataVal().compareTo(c2.getDataVal());
	}
	
}
