package app;


//Beispiel f�r viele andere Klassen,
//die Fahrzeuge benutzen
public class Rennbahn {
	
	
	public void fahreAlles(IFahrzeug f){// f== Auto, Motorrad, ...
		f.fahre();
	}

}
