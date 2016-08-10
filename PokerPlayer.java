
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerPlayer {

	HashMap<String, Integer> valueOfCard;
	
	public void initValues() {
		valueOfCard = new HashMap<String, Integer>();
		valueOfCard.put("A", 1);
		valueOfCard.put("2", 2);
		valueOfCard.put("3", 3);
		valueOfCard.put("4", 4);
		valueOfCard.put("5", 5);
		valueOfCard.put("6", 6);
		valueOfCard.put("7", 7);
		valueOfCard.put("8", 8);
		valueOfCard.put("9", 9);
		valueOfCard.put("10", 10);
		valueOfCard.put("J", 11);
		valueOfCard.put("Q", 12);
		valueOfCard.put("K", 13);
		valueOfCard.put("Joker", 0);
	}

	public ArrayList<Integer> sortByValue(ArrayList<Card> hand) {
		ArrayList<Integer> handValues = new ArrayList<Integer>();

		for(int i = 0; i < hand.size(); ++i) {			
			String cardName = hand.get(i).getName();
			handValues.add(valueOfCard.get(cardName));			
		}

		Collections.sort(handValues);
		
		return handValues;
	}
	
	public boolean isFiveOfAKind(ArrayList<Card> hand) {
		
		for(int i = 1; i < hand.size(); ++i) {
			
			Card c1 = hand.get(i);
			Card c2 = hand.get(i-1);
			
			if( !( c1.isEqualCard(c2) || c1.isSpecialCard() || c2.isSpecialCard() ) ) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isStraight(ArrayList<Card> hand) {
		
		ArrayList<Integer> handValues = sortByValue(hand);
		
		for(int i = 1; i < handValues.size(); ++i) {
			int diff = handValues.get(i) - handValues.get(i-1);
			if(! (diff == 1 || diff == handValues.get(i)) ) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isFullHouse(ArrayList<Card> hand) {
		
		ArrayList<Integer> handValues = sortByValue(hand);
		
		for(int i = 1; i < 3; ++i) {
			int diff = handValues.get(i) - handValues.get(i-1);
			if(!(diff == 0)) {
				return false;
			}
		}
		int diff = 0;
		int i = 1;
		while(diff!=0) {
			diff = handValues.get(i) - handValues.get(i-1);
			
		}
		
		if(handValues.get(3) != handValues.get(4)) {
			return false;
		}
		
		return true;
	}
	
	
}
