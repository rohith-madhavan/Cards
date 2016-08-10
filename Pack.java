package cards;

import java.util.ArrayList;
import java.util.List;

public class Pack {

	private List<Card> cards;
	
	private static final String[] faceNames = new String[] {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private static final String[] suitNames = new String[] {"Spade", "Clubs", "Heart", "Diamonds"};
	
	Pack(int jokerCount) {
		
		this.cards = new ArrayList<Card>();
		Card sc = null;
		initStandardPack();
		for(int i = 0; i<jokerCount ; i++) {
			sc = new Card("Joker", "-");
			this.cards.add(sc);
		}
	}
	
	public void initStandardPack() {	
		
		for(int i = 0; i < suitNames.length; ++i) {
			for(int j = 0; j < faceNames.length; ++j) {
				Card c = new Card(faceNames[j], suitNames[i]);
				this.cards.add(c);
			}
		}
		
	}
	
	public List<Card> getCards() {
		return this.cards;
	}
	
}