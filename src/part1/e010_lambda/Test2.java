package part1.e010_lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<Card>();
		CardComp cardcomp = new CardComp();
		cards.sort(cardcomp);

		cards.sort(new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				return c1.getDataVal().compareTo(c2.getDataVal());
			}
		});
		cards.sort((Card c1, Card c2) -> {
			return c1.getDataVal().compareTo(c2.getDataVal());
		});
		
		cards.sort(Card::compareCard);
	}
}
