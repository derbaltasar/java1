package app;

public class ExceptionTest {
	
	
	public void m1(int a){
		if(a < 0){ //Exception auslösen
			throw new IllegalArgumentException("Zahl < 0"); // springt hier raus
		}
		
		System.out.println("m1...macht was"+a);
	}
	
	
	public void m2(){
		
		try {//Exception behandeln (auffangen)
			m1(-4);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fehler m2()...falsche Eingabe");
		}
		
	}
	
	
	public void m3() throws IllegalAccessException{
		try {
			m1(-4);
		} catch (Exception e) {// Exception weiter werfen
			System.out.println("Fehler m3()");
			throw new IllegalAccessException();
		}
		
	}

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		//test.m1(2);
		//test.m2();
		try {
			test.m3();
		} catch (IllegalAccessException e) {
			//Fehler in main
			e.printStackTrace();
		}
	}

}
