package app;

import java.util.Arrays;

public class Methoden {
	
	
	
	//1.
	public static void spalten() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			if(i%2 != 0){
				System.out.println();
			}
		}
	}

	//2.
	public static int max(int[] arr){
		int max =arr[0];
		for (int x : arr) {
			if(x > max){
				max=x;
			}
		}
		return max;
		
	}
	
	//3.
	public static void printGerade(int[] arr){
		for (int x : arr) {
			if(x%2 == 0){
				System.out.println(x);
			}
		}
	}
	
	public static boolean istEnthalten(int x, int[] arr){
		for (int n : arr) {
			if(n==x){
				return true;
			}
		}
		
		return false;
	}
	
	public static int quersumme(int[] arr){
		int summe = 0;
		
		for (int x : arr) {
			summe += x;
		}
		return summe;
	}
	
	public static void printRueckwerts(int[] arr){
		for (int i = arr.length-1  ; i >= 0 ; i--) {
			System.out.print(arr[i]+"|");
		}
		
	}
	
	public static int[] einsAusZwei(int[]arr1, int[] arr2){
		
		int[] arrNew = new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arrNew[i] = arr1[i]; //erste Array verarbeiten
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arrNew[i+arr1.length] = arr2[i];
		}
		
		return arrNew;
	}
	
	public static void print2D(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String[] toUpper(String[] arr){
		String[] upperArray = new String[arr.length];
		
		
		for (int i = 0; i < upperArray.length; i++) {
			upperArray[i]= arr[i].toUpperCase();
		}
		
		return upperArray;
	}
	
	//-------------------------------------------
	public static void main(String[] args) {
		int[][] arr2d = {
				{2,4,2,5},//arr2d[0]
				{2,3,5,3},
				{1,4,5,4}
				
		};
		int[] zahlen1 = {7,2,33,2,7,-56};
		int[] zahlen2 = {5,6,5};
		
		//print2D(arr2d); *
		//spalten();
		
		//System.out.println(max(zahlen1));
		
//		istEnthalten(4, zahlen1);
//		istEnthalten(2, zahlen1);
//		
	//	System.out.println(quersumme(zahlen1));
	//	printRueckwerts(zahlen1);
		
		int[] arrNew = einsAusZwei(zahlen1, zahlen2);
		System.out.println(Arrays.toString(arrNew));
		
		String[] stringArray1 = {"Max","Emil","Otto"};
		String[] stringArrayNew= toUpper(stringArray1);
		System.out.println(Arrays.toString(stringArrayNew));
	}

}
