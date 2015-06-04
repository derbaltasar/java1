package app;

public class Main {

	public static void main(String[] args) {
		KlasseMitStatic k = new KlasseMitStatic();
		k.dynamischeMethode();
		
		
		// Klassenmethoden werden über den Klassennamen aufgerufen
		KlasseMitStatic.klassenMethode();
		
		int max = KlasseMitStatic.MAX;
		
		
		new Test();
		new Test();
		new Test();
		new Test();
		
		// hier soll jetzt die Anzahl der Objekte ausgegeben werden (4)
		System.out.println(Test.count);
	}

}
