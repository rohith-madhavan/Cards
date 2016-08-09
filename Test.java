package cards;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		boolean hasSpecialCards = true;
		
		Deck d = new Deck(1, hasSpecialCards);
		d.shuffle();
		ArrayList<Card> x = d.getCards();
		for(int i = 0; i < x.size(); ++i) {
			System.out.println(x.get(i).getCard());
		}
	}
	
}
