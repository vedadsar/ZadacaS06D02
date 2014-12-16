
public class Student {
private String ime;
private String prezime;
private String email;
/**
 * Prazan konstruktor, u slucaju da je mjesto prazno.
 */
public Student(){
	this.ime = "PRAZNO";
	this.prezime="PRAZNO";
	this.email="PRAZNO";
}

/**
 * Konstruktor sa vrijednostima ime,prezime i email.
 * @param ime: Ime studenta.
 * @param prezime: Prezime Studenta
 * @param email: Email studenta
 */
public Student(String ime, String prezime, String email){
	this.ime = ime;
	this.prezime=prezime;
	this.email=email;
}

/**
 * @return the ime: getter za ime
 */
public String getIme() {
	return ime;
}

/**
 * @param ime the ime to set
 */
public void setIme(String ime) {
	this.ime = ime;
}

/**
 * @return the prezime
 */
public String getPrezime() {
	return prezime;
}

/**
 * @param prezime the prezime to set
 */
public void setPrezime(String prezime) {
	this.prezime = prezime;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * toString metoda, vraca String koji sam formatirao.
 */
public String toString(){
	String out = "Ime studenta: " +ime +"\nPrezime Studenta: " +prezime +"\nEmail: " +email;
	return out;
}

}
