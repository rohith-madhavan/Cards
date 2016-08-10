package cards;

public class Card {
	private String name;
	private String suit;
	
	public Card(String name, String suit ){
		this.name = name;
		this.suit = suit;
	}
	public Card(Card c) {
		this.name = c.name;
		this.suit = c.suit;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSuit() {
		return this.name;
	}
	
	public boolean isEqualCard(Card other) {
		
		return other.getCard().equals(this.getCard());
	}
	
	public boolean isEqualName(Card other) {
		
		return other.getName().equals(this.getName());
	}
	
	public boolean isEqualSuit(Card other) {
		
		return other.getSuit().equals(this.getSuit());
	}
	
	public String getCard() {
		return name + "-" + suit;
	}
}