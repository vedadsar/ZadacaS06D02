/**
 * Zadatak da napravimo klasu student koja ce sadrzavati informacije o studentu. 
 * Zatim sam u klasi BitCamp napravio izgled kako nasa ucionica BitCampa izgleda.
 * S obzirom da je raspored sjedenja, imena i sve ostalo poznato, nisam trazio
 * da korisnik programa unosi podatke, vec sam sam vec unio sve podatke preko funkcije
 * dodajStudenta koja poziva konstruktor iz klase Student.
 * @author Vedad
 *
 */
public class BitCamp {
/**
 * Funkcija koja poziva konstruktor iz klase student, i kreira studenta.
 * @param ime...
 * @param prezime...
 * @param email...
 * @return
 */
	public static Student dodajStudenta (String ime, String prezime, String email){
		Student noviStudent = new Student(ime, prezime, email);
		/**Ovdje mogu staviti i TextIO da sam unosim svakog studenta ali, posto vec znam imena 
		studenata samo cu ih ubacivati preko ove klase.
		*/
		return noviStudent;
		
	}
	
	public static void main(String[] args) {
	Student [][] ucionica = new Student[6][4];
	//Prvi red
	ucionica[0][0] = dodajStudenta("Gorjan", "Kalauzovic", "gorjan.kalauzovic@bitcamp.ba");
	ucionica[0][1] = dodajStudenta("Amra", "Poprzanovic", "amra.poprzanovic@bitcamp.ba");
	ucionica[0][2] = dodajStudenta("Sanela", "Grcic", "sanela.grcic@bitcamp.ba");
	ucionica[0][3] = dodajStudenta("Jesenko", "Gavric", "jesenko.gavric@bitcamp.ba");
	//Drugi red
	ucionica[1][0] = dodajStudenta("Edib", "Imamovic", "edib.imamovic@bitcamp.ba");
	ucionica[1][1] = dodajStudenta("Nedzad", "Hamzic", "nedzad.hamzic@bitcamp.ba");
	ucionica[1][2] = dodajStudenta("Emir", "Imamovic", "emir.imamovic@bitcamp.ba");
	ucionica[1][3] = dodajStudenta("Davor", "Stankovic", "davor.stankovic@bitcamp.ba");
	//Treci red
	ucionica[2][0] = dodajStudenta("Nermin", "Graca", "nermin.graca@bitcamp.ba");
	ucionica[2][1] = dodajStudenta("Neldin", "Dzeko", "neldin.dzeko@bitcamp.ba");
	ucionica[2][2] = dodajStudenta("Adnan", "Alic", "adnan.alic@bitcamp.ba");
	ucionica[2][3] = dodajStudenta("Selma", "Tabakovic", "selma.tabakovic@bitcamp.ba");
	//Cetvrti red
	ucionica[3][0] = dodajStudenta("Mustafa", "Ademovic", "mustafa.ademovic@bitcamp.ba");
	ucionica[3][1] = dodajStudenta("Haris", "Arifovic", "haris.arifovic@bitcamp.ba");
	ucionica[3][2] = dodajStudenta("Gordan", "Sajevic", "gordan.sajevic@bitcamp.ba");
	ucionica[3][3] = dodajStudenta("Haris", "Krkalic", "haris.krkalic@bitcamp.ba");
	//Peti red
	ucionica[4][0] = dodajStudenta("Nedim", "Omerovic", "nedim.omerovic@bitcamp.ba");
	ucionica[4][1] = dodajStudenta("Hikmet", "Durgutovic", "hikmet.durgutovic@bitcamp.ba");
	ucionica[4][2] = dodajStudenta("Mirza", "Becic", "mirza.becic@bitcamp.ba");
	ucionica[4][3] = dodajStudenta("Nermin", "Vucinic", "nermin.vucinic@bitcamp.ba");
	//Sesti red
	ucionica[5][0] = dodajStudenta("Emina", "Muratovic", "emina.muratovic@bitcamp.ba");
	ucionica[5][1] = new Student();
	ucionica[5][2] = new Student();
	ucionica[5][3] = dodajStudenta("Vedad", "Zornic", "vedad.zornic@bitcamp.ba");
	
	// Ispis tabele ( nase bitCamp ucionice)
	for(int i=0;i<ucionica.length;i++){
		for(int j=0; j<ucionica[i].length;j++){
			System.out.print(ucionica[i][j].getIme() +"\t\t\t");
		}
		System.out.println();
	}
	
	}

}
