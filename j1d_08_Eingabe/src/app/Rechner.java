package app;

public class Rechner {

	/**
	 * 
	 * @param a
	 *            - erste Zahl
	 * @param b
	 *            - zweite Zahl
	 * @param op
	 *            - Operator (+,-,*,/)
	 * @return Ergebnis der Berechnung
	 */
	public static double rechne(double a, double b, char op) {
		double x = Double.NaN;
		if(!istOp(op)){
			// TODO Exception
			
			throw new IllegalArgumentException();
			//return x;
		}
		
		switch (op) {
		case '+':
			x = a + b;
			break;
		case '-':
			x = a - b;
			break;
		case '*':
			x = a * b;
			break;
		case '/':

			// Prüfen: b
			if (b == 0) {
			
				throw new DivisionDurch0Exception();
			}	
			x = a / b;
			// TODO Meldung/ Exception
		default:
			System.out.println("nichts...");// TODO Exception
		}
		return x;
	}

	
	/**
	 * prüft ob ein Operator (+,-,*,/) gültig ist
	 * 
	 * @param op
	 * @return true / false
	 */
	public static boolean istOp(char op) {
		//
		return op == '+' || op == '-' || op == '*' || op == '/';
	}
	
}
