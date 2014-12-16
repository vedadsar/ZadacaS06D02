package blackjack;

public class Card {
	
	private int broj;
	private int vrijednost;
	private int znak;
	private String znakovi;
	
	public Card(int broj) {
				
		this.broj = broj % 13;
		this.broj++;
		if (this.broj == 1) {
			this.vrijednost = 11;
		} else if (this.broj >= 10) {
			this.vrijednost = 10;
		} else {
			this.vrijednost = this.broj;
		}
		if(this.broj >= 11){
			this.broj++;
		}
		this.znak = broj / 13;
		
		if(znak == 0)
			znakovi = "\u2665";
		if(znak == 1)
			znakovi = "\u2660" ;
		if(znak == 2)
			znakovi = "\u2666";
		if(znak == 3)
			znakovi = "\u2663";
	}
	
	
	/**
	 * @return the vrijednost
	 */
	public int getVrijednost() {
		return vrijednost;
	}


	/**
	 * @param vrijednost the vrijednost to set
	 */
	public void setVrijednost(int vrijednost) {
		this.vrijednost = vrijednost;
	}


	/**
	 * @return the broj
	 */
	public int getBroj() {
		return broj;
	}


	/**
	 * @param broj the broj to set
	 */
	public void setBroj(int broj) {
		this.broj = broj;
	}


	public String toString() {
		String out = "";
		out += this.broj +" ";
		out += this.znakovi + ", ";
		out += this.vrijednost + "\n";
		return out;
	}
	
}
