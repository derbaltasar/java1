package app;

public class Main {

	public static void main(String[] args) {
//		IFahrzeug f1 = new Auto();
//		f1.fahre();
		
		
		Rennbahn rennbahn = new Rennbahn();
		
		rennbahn.fahreAlles(new Motorrad());
		rennbahn.fahreAlles(new Auto());

	}

}
