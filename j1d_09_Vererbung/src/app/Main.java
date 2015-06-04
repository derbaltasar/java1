package app;

public class Main {


	public static void main(String[] args) {

		Person p1 = new  Person("Max", "Maeier");
		
		System.out.println(p1);
		
		Mitarbeiter m1 = new Mitarbeiter("Otto", "Lehmann", "M1111");
		
		m1.setNachname("Werner"); // geerbte Methode von Person
		
		System.out.println(m1);
		
		
		// auf linker Seite (Datentyp) kann Obertyp verwendet werden
		Person p2  = new Mitarbeiter("Ina", "Schultz");
		
		
		//Mitarbeiter m2 = new Person("Peter", "Meier");-> 
		
		
		
	}

}
