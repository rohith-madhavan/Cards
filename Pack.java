package cards;

import java.util.ArrayList;

public class Pack {

	private ArrayList<Card> cards;
	
	private String[] face = new String[] {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suit = new String[] {"Spade", "Clubs", "Heart", "Diamonds"};
	
	Pack(boolean hasSpecialCard) {
		initStandardPack();
		if(hasSpecialCard) {
			Card sc = new Card("Joker", "-");
			cards.add(sc);
			cards.add(sc);
		}
	}
	
	public void initStandardPack() {
	
		for(int i = 0; i < suit.length; ++i) {
			for(int j = 0; j < face.length; ++j) {
				Card c = new Card(face[j], suit[i]);
				cards.add(c);
			}
		}
		
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
}