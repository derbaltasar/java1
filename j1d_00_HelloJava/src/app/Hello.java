package app;


/**
 * Kommentar für Javadoc
 * 
 * @author Student
 *
 */
public class Hello {
	
	
	/**
	 * Methoden-Definition
	 */
	public  void methode1(){
		System.out.println("methode1...");
	}
	
		
	/*
	 * mehrzeiliger Kommetar
	 */
	public static void main(String[] args) {
		// Programm start
		
		System.out.println("Hallo Java"); // einzeiliger Kommentar
		
	
		
		Hello  h = new Hello();
		h.methode1();
		// Programm ende
	}

}
