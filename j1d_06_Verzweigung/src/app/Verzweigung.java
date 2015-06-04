package app;

public class Verzweigung {

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
			return x;
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
			if (b != 0) {
				x = a / b;
				break;
			}
			// TODO Meldung/ Exception
		default:
			System.out.println("nichts...");// TODO Exception
		}
		return x;
	}

	/**
	 * 
	 * @param a
	 *            eine Ganzzahl
	 * @param b
	 *            eine Ganzzahl
	 * @return größere von zwei Zahlen a,b
	 */
	public static int max(int a, int b) {
		// return a > b ? a : b;
		if (a > b) {
			return a;
		}
		return b;
	}

	public static boolean ist0(int a) {
		return a == 0;
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

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		if (a < b) {
			System.out.println(a + " ist kleiner als " + b);
		}
		// ----------------------------------------------
		if (b < a) {
			System.out.println(b + " ist kleiner als " + a);
		} else {
			System.out.println(b + " ist größer oder gleich als " + a);
		}
		// --------------------------------------------

		if (a > b) {
			System.out.println(a + " ist größer als " + b);
		} else if (a < b) {
			System.out.println(a + " ist kleiner als " + b);
		} else {
			System.out.println(a + " ist gleich " + b);
		}

		// --------------------------------
		int m = max(3, 6);
		System.out.println("max: " + m);

		boolean ist0 = ist0(0);
		System.out.println("ist0: " + ist0);

		// ---------------------------
		double result = rechne(3, 0, '/');

		if (Double.isNaN(result)) {
			System.out.println("Fehler!");
		} else {
			System.out.println("rechne " + result);
		}

		System.out.println(istOp('?'));// true

	}

}
