package cards;

import java.util.ArrayList;
import java.util.List;

public class Hand extends Deck {
	
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public Hand(List<Card> list) {
		this.cards = list;
	}
	
	public void removeGivenCard(Card rm) {
		this.cards.remove(rm);
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
