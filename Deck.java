package cards;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	protected List<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
	}
	public Deck(int numPacks) {
		
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < numPacks; ++i) {
			Pack p = new Pack(0);
			cards.addAll(p.getCards());
		}
	}
	Deck(int numPacks, int jokerCount) {
		
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < numPacks; ++i) {
			Pack p = new Pack(jokerCount);
			cards.addAll(p.getCards());
		}
	}	

	public List<Card> getCards() {
		return this.cards;
	}
	
	public Card removeTopCard() {
		Card c = this.cards.get(0);
		this.cards.remove(0);
		
		return c;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<Card> removeNCards(int n) {
		List<Card> list = new ArrayList<>();
		Card c = null;
		for(int i = 0; i < n; i++) {
			c = removeTopCard();
			list.add(c);
		}
		
		return list;
	}
}
