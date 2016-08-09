package cards;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		boolean hasSpecialCards = false;
		
		Deck d = new Deck(1, hasSpecialCards);
		d.shuffle();
//		ArrayList<Card> x = d.getCards();
//		for(int i = 0; i < x.size(); ++i) {
//			System.out.println(x.get(i).getCard());
//		}
		Hand h = new Hand(d.getCards());
		ArrayList<Card> y = h.getCards();
		for(int i = 0; i < y.size(); ++i) {
			System.out.println(y.get(i).getCard());
		}
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Spade", 3);
		hm.put("Clubs", 2);
		hm.put("Heart", 1);
		hm.put("Diamonds", 0);
		h.sortHand(hm);
		
		System.out.println("\n\nAfter Sorting");
		y = h.getCards();
		for(int i = 0; i < y.size(); ++i) {
			System.out.println(y.get(i).getCard());
		}
	}
	
}
