package cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hand {
	private ArrayList<Card> cards;
	
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public Hand(ArrayList<Card> list) {
		this.cards = list;
	}
	
	public ArrayList<Card> getCards() {
		return this.cards;
	}
	
	public Card removeCard() {
		Card c = this.cards.get(0);
		this.cards.remove(0);
		
		return c;
	}
	
	public ArrayList<Card> removeNCards(int n) {
		ArrayList<Card> list = new ArrayList<>();
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
	
	public void addListToHand(ArrayList<Card> list) {
		this.cards.addAll(list);
	}
	
	public void sortHand(HashMap<String, Integer> hm) {
		int iVal = 0;
		int jVal = 0;
		Card iCard = null;
		Card jCard = null;
		for(int i=0; i < this.cards.size()-1 ; i++) {
			
			iCard = new Card(this.cards.get(i));
			if(hm.containsKey(iCard.getCard()))
				iVal = hm.get(iCard.getCard());
			else if(hm.containsKey(iCard.getName()))
				iVal = hm.get(iCard.getName());
			else if(hm.containsKey(iCard.getSuit()))
				iVal = hm.get(iCard.getSuit());
			else
				iVal = 0;
			
			for(int j = i+1 ; j < this.cards.size() ; j++) {
				
				jCard = new Card(this.cards.get(j));
				if(hm.containsKey(jCard.getCard()))
					jVal = hm.get(jCard.getCard());
				else if(hm.containsKey(jCard.getName()))
					jVal = hm.get(jCard.getName());
				else if(hm.containsKey(jCard.getSuit()))
					jVal = hm.get(jCard.getSuit());
				else
					jVal = 0;
				
				if(iVal > jVal) {
					this.cards.set(i, jCard);
					this.cards.set(j, iCard);
				}
			}
		}
	}
}
