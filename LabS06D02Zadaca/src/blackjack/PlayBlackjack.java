package blackjack;
/**
 * Classa blackjack je klasa sa mainom, u kojoj igrac igra igricu blackjack u konzoli.
 * Ovo je nastavak zadatka sa vjezbi 16.12.2014.
 * @author Vedad
 *
 */
public class PlayBlackjack {
/**
 * Main funkcija u koju sam napravio pravila za igranje igrica.
 * 
 * @param args
 */
	public static void main(String[] args) {
		boolean krajIgre = false; // Boolean kojim cemo provjeravati da li smo dosli do kraj igre.

		Deck spil = new Deck();
		//spil.ispisiKarte();
        
		//Prve dvije karte vuce igrac
		Hand player = new Hand();
		player.addCard(spil.getNext());
		player.addCard(spil.getNext());

		Hand dealer = new Hand();
        //Druge dvije karte uzima dealer
		dealer.addCard(spil.getNext());
		dealer.addCard(spil.getNext());

		//Ukoliko je zbir igracevih karata manji od 10, igrac vuce novu kartu.
		while(player.getSum()<10){   
		player.addCard(spil.getNext());
		}
				
		System.out.println("igrac ima " + player.getSum());
		System.out.println("dealer ima " + dealer.getSum());
      
		//provjeravamo da li je zbir karata 21, tj da li je korisnik dobio blackjack.
		if(player.getSum()==21){
			System.out.println("Cestitamo pobjedili ste!! BLACKJACK");
		return;
		}
				
		// Petlja da igrac vuce karte dokle zeli.
		while (player.getSum() < 21 || krajIgre == false) {
						
			
			//Korisnik bira da li ce da unese novu kartu.
			System.out.println("Unesite d ukoliko zelite povuci novu kartu");
					char igrajDalje = TextIO.getChar();
			if(igrajDalje != 'd'){
				break;
			
				/*Else  provjerava stanje igrice. Ima nekoliko uslova.
				 * Takodjer provjerava i mjenja stanje ruke ukoliko korisnik ima
				 * "A" u ruci.
				 * 
				 */
			}else{
									
			     player.addCard(spil.getNext());
			     
				// Kada nam je broj presao 21 i nemamo 'A' u ruci.
				if (player.getSum() > 21 && player.getAcesNum() < 1) {
					System.out.println("Izgubili ste igru!");
					krajIgre = true;
					break;
				}
				// Kada nam je broj presao 21 i imamo 'A' u ruci.
				if (player.getSum() > 21 && player.getAcesNum() > 0) {
					player.setSum();
					player.setCounter();
					player.setAcesNum();
					
									
				}
				//Kada smo izvukli blackjack
				if(player.getSum()==21){
					System.out.println("BLACKJACK!!!!");
					krajIgre = true;
					break;
					
					
				}
				System.out.println("novi zbir" +player.getSum());

			}
		}
		/*
		 * Ukoliko i dalje nije kraj igre, dealer vuce svoje karte.
		 * Zatim dolazi do provjera i za dealera, identicno kao kod igraca.
		 */
		if(krajIgre == false){
			while (dealer.getSum()<17 && krajIgre==false){
				dealer.addCard(spil.getNext());
					
				// Ukoliko dealer predje 21.
				if(dealer.getSum()>21){
					System.out.println("Cestitamo, pobjedili ste !!!");
					krajIgre = true;
					break;
				}
				// Kada  je dealerov broj presao 21 i nemamo 'A' u ruci.
				if (dealer.getSum() > 21 && dealer.getAcesNum() < 1) {
					System.out.println("Pobjedili  ste!");
					krajIgre = true;
					break;
				}
				// Kada  je dealerov broj presao 21 i imamo 'A' u ruci.
				if (dealer.getSum() > 21 && dealer.getAcesNum() > 0) {
					dealer.setSum();
					dealer.setCounter();
					dealer.setAcesNum();
									
				}
			}
		}
		/**
		 * Ukoliko i dalje nije kraj igre, dolazimo do trenutka kada gledamo
		 * ko ima veci zbir karata, dealer ili korisnik. Po tome odlucujemo
		 * ko je pobjednik ili pobjednika nema.
		 */
		if(krajIgre == false){
		
			if(dealer.getSum()>player.getSum())
				System.out.println("Pobjedio je dealer!");
			if(dealer.getSum()<player.getSum())
				System.out.println("Cestitamo, pobjedili ste");
			if(dealer.getSum()==player.getSum())
				System.out.println("Nerjeseno!");
		}
		
		System.out.println();
		System.out.println("Igrac ima " +player.getSum());
		System.out.println("Dealer ima " +dealer.getSum());
	}
}
