package app;

public class ExceptionTest2 {

	public void m1(int a) throws Exception {
		if (a < 0) {
			throw new Exception();// geprüfte Ausnahme auslösen
		}
		
		System.out.println("m1...... :-)");
	}

	public void m2() throws Exception {// Behandlung an den Aufrufer delegieren
		m1(-2);
	}

	public void m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Fehler in m3()");
			// e.printStackTrace();
			throw new RuntimeException(); // ungeprüfte Exception

		}
	}
	
	public void m4(){
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		ExceptionTest2 test = new ExceptionTest2();
		try {// freiwilliges Behandeln
			test.m4();
			test.m3();
			
		}catch (NullPointerException  e) {
			System.out.println("nullpointer");
		}catch(RuntimeException ee){
			System.out.println("Fehler in main");
		}
	}

}
