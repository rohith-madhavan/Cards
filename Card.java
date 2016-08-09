package cards;

public class Card {
	private String name;
	private String suit;
	
	Card(String name, String suit ){
		this.name = name;
		this.suit = suit;
	}
	
	public String getCard() {
		return name + "-" + suit;
	}
	
}