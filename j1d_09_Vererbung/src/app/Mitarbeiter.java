package app;


//Mitarbeiter erweitert Person 
public class Mitarbeiter extends Person{
	
	private String mitarbeiterNummer;

	public Mitarbeiter(String vorname, String nachname) {
		super(vorname, nachname);//Person-Konstruktor
	}
	


	public Mitarbeiter(String vorname, String nachname, String mitarbeiterNummer) {
		super(vorname, nachname);
		this.mitarbeiterNummer = mitarbeiterNummer;
	}




	public String getMitarbeiterNummer() {
		return mitarbeiterNummer;
	}

	public void setMitarbeiterNummer(String mitarbeiterNummer) {
		this.mitarbeiterNummer = mitarbeiterNummer;
	}

	@Override
	public String toString() {
		return "[Mitarbeiter "+
				mitarbeiterNummer+" + mitarbeiterNummer +"+super.toString()+"]";
	}

	
}
