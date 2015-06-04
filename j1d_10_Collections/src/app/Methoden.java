package app;

import java.util.ArrayList;

public class Methoden {
	
	
	/*
	 * soll ArrayList zurückgeben mit nur geraden Zahlen
	 */
	public static ArrayList<Integer> geradeZahlen(ArrayList<Integer> li){
		ArrayList<Integer> zahlenGerade = new ArrayList<>();
		for (Integer x : li) {
			if(x%2==0){
				zahlenGerade.add(x);
			}
		}
		return zahlenGerade;	
	}

	/*
	 * erzeugt ArrayList mit Zahlen bis max
	 */
	public static ArrayList<Integer> createArraylist(int max){
		ArrayList<Integer> zahlen = new ArrayList<>();
		for (int i = 0; i < max; i++) {
			zahlen.add(i);
		}
		return zahlen;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> testZahlen = createArraylist(20);
		System.out.println(testZahlen);
		
		System.out.println(geradeZahlen(testZahlen));
		

	}

}
