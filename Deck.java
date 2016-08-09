package cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards;

	Deck(int numPacks, boolean hasSpecialCard) {
		
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < numPacks; ++i) {
			Pack p = new Pack(hasSpecialCard);
			cards.addAll(p.getCards());
		}
	}	

	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		Card c = cards.get(0);
		cards.remove(0);
		
		return c;
	}
}
