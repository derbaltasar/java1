package app;

import java.util.Scanner;

public class RechnerEingabe {

	public static void main(String[] args) {
		// Rechner.rechne(a, b, op)

		Scanner sc = new Scanner(System.in);
		char end = 'j';

		while (end != 'n') {
			System.out.println("Zahl1: ");
			double a = sc.nextDouble();

			System.out.println("Zahl2: ");
			double b = sc.nextDouble();

			System.out.println("Operator:");

			String sOp = sc.next();
			char op = sOp.charAt(0);// '+' char -> String
			
			
			try {
				double result = Rechner.rechne(a, b, op);
				System.out.println(result);
			} catch (DivisionDurch0Exception e) {
				System.out.println("nicht durch 0!");
			}catch (IllegalArgumentException e) {
				System.out.println("Falscher Operator!");
			}
			
		
			
			System.out.println("Weiter (j/n)?");
			end = sc.next().charAt(0);
		}
		
		sc.close();
	}
}
