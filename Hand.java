package cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private ArrayList<Card> cards;
	
	public List<Card> getCards() {
		return this.cards;
	}
	
	public Card removeCard() {
		Card c = this.cards.get(0);
		this.cards.remove(0);
		
		return c;
	}
	
	public List<Card> removeNCards(int n) {
		List<Card> list = new ArrayList<>();
		Card c = null;
		for(int i = 0; i < n; i++) {
			c = removeCard();
			list.add(c);
		}
		
		return list;
	}
	
	public List<Card> emptyHand() {
		List<Card> list = this.cards;
		this.cards = null;
		
		return list;
	}
	
	public void addCardToHand(Card c) {
		this.cards.add(c);
	}
	
	public void addListToHand(List<Card> list) {
		this.cards.addAll(list);
	}
}
