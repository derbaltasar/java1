package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	
	public static void main(String[] args) {
		
		// unsicher -> Typ Object
		ArrayList objectList = new ArrayList();
		objectList.add("Max");
		objectList.add(345);
		
		for (Object object : objectList) {
			
		//	String s = (String) object;  !!!!!!!!!
			System.out.println(object);
			
			if(object instanceof String){// ist Elment Stringinstanz
				String s = (String) object;
			}
		}
		
		//------------ Sicher!
		ArrayList<String> namen = new ArrayList<>();
		namen.add("Max");
		namen.add("Otto");
		namen.add("Ina");//2
		
		for (String name : namen) {
			System.out.println(name);
		}
		
		namen.remove(2);
		System.out.println(namen);
		
		ArrayList<String> namen2 = new ArrayList<>();
		namen2.add("Erwin");
		
		namen.addAll(namen2);
		System.out.println(namen);
		
		for (int i = 0; i < namen.size(); i++) {
			System.out.println(namen.get(i));
		}
		Collections.sort(namen);
		System.out.println(namen);
		
		List<Boolean> boolList  = new ArrayList<>();
		
		boolList.add(true);
		boolList.add(false);
		boolList.add(new Boolean(true));
		///------------ List initialisieren mit asList-------
		List<Integer>  zahlen = Arrays.asList(3,4,52,1);
		
		for (Integer x : zahlen) {
			System.out.println(x);
		}
		
		
	}

}
