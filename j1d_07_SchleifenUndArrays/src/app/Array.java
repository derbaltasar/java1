package app;

import java.util.Arrays;
import java.util.List;

public class Array {
	
	public static void printIntArray(int[] arr){
		System.out.println();// Zeilenumbruch
		for (int i : arr) {
			System.out.print(i+"|");
		}
		System.out.println();// Zeilenumbruch
	}

	public static void main(String[] args) {

		
		//Array anlegen mit der Größe 10
		int[] zahlen = new int[10];
		for (int zahl : zahlen) {
			System.out.print(zahl+"|");
		}
		
		
		System.out.println();
		int[] zahlen2 = {3,5,7,3,4,5};
		
		for (int z : zahlen2) {
			System.out.print(z+"|");
		}
		
		//Array neue Werte geben
		zahlen[0] = 1; 
		printIntArray(zahlen);
		
		//Hilfsklasse für Arrays: Arrays
		System.out.println(Arrays.toString(zahlen)); //String-Umwandlung (lesbar)
		
		Arrays.sort(zahlen2); //Arrays sortieren
		
		System.out.println(Arrays.toString(zahlen2));
		// Array 2D
		int[][] zahlen3 = new int[5][3];//new int[5][]-> geht auch
		
		for (int[] zahlArray : zahlen3) {
//			[0, 0, 0]
//			[0, 0, 0]
//			[0, 0, 0]
//			[0, 0, 0]
//			[0, 0, 0]
	
			System.out.println(Arrays.toString(zahlArray));
		}
		
		for (int i = 0; i < zahlen3.length; i++) {
			for (int j = 0; j < zahlen3[i].length; j++) {
				System.out.println(zahlen3[i][j]);
			}
		}
		
		
		
		// Object -> Obertyp aller Javaklassen
		Object[] obs = {23,"Hallo", true};
		for (Object object : obs) {
			System.out.println(object);			
		}
		
		int z = (int) obs[0];
		System.out.println(z);
		String s  = (String) obs[1];
		System.out.println(s);
	
		// Arrays zu List umwandeln
		List<Object> li = Arrays.asList(obs);
	}

}
