package app;

import java.util.Scanner;

public class Eingabe {


	public static void main(String[] args) {

		Scanner sc  = new  Scanner(System.in);
		
		System.out.print("Vorname: ");
		
		String vorname = sc.next();//hält an
		
		System.out.print("Nachname:");
		
		String nachname = sc.next();//hält an
		
		System.out.println("Alter:");
		int alter = sc.nextInt();
		
		//Formatstring
		System.out.printf("Vorname: %s, Nachname: %s, Alter: %d", vorname,nachname,alter);
		
		
	}

}
