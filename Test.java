package cards;

public class Test {
	
	public static void main(String[] args) {
				
		int jokerCount = 1;
		Deck d = new Deck(2, jokerCount);
		Hand h = new Hand(d.getCards());
		for(int i = 0; i < h.getCards().size(); ++i) {
			System.out.println(h.getCards().get(i).getCard());
		}
		h.shuffle();
		h = new Hand(h.getCards());
		for(int i = 0; i < h.getCards().size(); ++i) {
			System.out.println(h.getCards().get(i).getCard());
		}
	}
	
}
