package blackjack;

public class Deck {

	private Card[] cards;

	private int counter;
/**
 * Konstruktor decka, pravi deck karata i promjesa ih.
 */
	public Deck() {
        int counter = 0;
		cards = new Card[52];
		for (int i = 0; i < cards.length; i++)
			cards[i] = new Card(i + 1);
 		Shuffle();
	}
/**
 * Shuffle metoda, kojom cemo promjesati karte.
 */
	public void Shuffle() {

		Card[] temp = new Card[52];
		for (int i = 0; i < cards.length; i++) {
			int b = (int) (Math.random() * 52);
			if (temp[b] == null)
				temp[b] = cards[i];
			else
				i--;
		}
		cards = temp;
	}
/**
 * Funkcija ispisiKarte, ispisuje sve naste karte.
 */
	public void ispisiKarte() {

		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i].toString());

	}
/**
 * Funkcija getNext uzima sljedecu kartu iz decka ( counter se povecava nakon sto uzmemo kartu)
 * @return
 */
	public Card getNext(){
		return cards[counter++];
	}
}
