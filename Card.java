package Week_2.day2;

public class Card {
	private String name;
	private String suit;
	private int value;
	Card(String name, String suit, int value ){
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
	
	Card(String name, String suit ){
		this.name = name;
		this.value = 0;
		this.suit = suit;
	}
	
}
