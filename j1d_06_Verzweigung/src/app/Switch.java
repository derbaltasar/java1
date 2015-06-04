package app;

public class Switch {

	public static void main(String[] args) {
		
		
		String farbe = "grün";
		
		switch(farbe){//
			case "rot": System.out.println("#FF0000");break; 
			case "grün": System.out.println("#00FF00");break; 
			case "blau": System.out.println("#0000FF");break; 
			default: System.out.println("nichts...");
		}

	}

}
