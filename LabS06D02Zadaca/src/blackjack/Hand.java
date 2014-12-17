package blackjack;
public class Hand {
private Card[] hand;
private int acesNum;
private int  counter;
private int sum;
 
     /**
     * Konstruktor hand.
     */
	public Hand(){
		
		this.hand= new Card[52];
		this.acesNum=0;
		this.counter=0;
				
		
	}
	/**
	 * Funkcija dodaje kartu u ruku.
	 * @param newCard
	 */
	public void addCard(Card newCard){
		hand[counter] = newCard;
		counter++;
		
		if(newCard.getBroj()==1)
			acesNum++;
		
				
	}
	/**
	 * Funkcija getSum, uzima vrijednosti karti iz niza i dodaje ih na sumu.
	 */
	public int getSum(){
		
		this.sum = 0;
		for(int i=0;i<counter;i++){//Prolazimo kroz niz karata, i dodajemo vrijednosti.
			sum += hand[i].getVrijednost();
		}
		
		
		return sum;
	}
	
	
	
	public  void  setSum(){
		this.sum = this.sum-10;
	}
	/**
	 * @return the acesNum

	 */
	public int getAcesNum() {
		return acesNum;
	}
	
		public void setAcesNum(){
		this.acesNum--;
	}
		
		public int getCounter() {
			return counter;
		}
		public void setCounter() {
			counter --;
		}
}
