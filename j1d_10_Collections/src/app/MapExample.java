package app;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String, String> farben = new HashMap<>();
		// Schlüssel müssen eindeutig sein
		farben.put("rot", "#FF0000");
		farben.put("grün", "#00FF00");
		farben.put("blau", "#0000FF");
		
		System.out.println(farben.get("grün"));//über Schlüssel den Wert bekommen
		
		
		// alle Objekt-Typen für Key und Value erlaubt
		Map<Integer, Point> points = new HashMap<>();
		points.put(111, new Point(2,3));
		points.put(222, new Point(5,3));
		points.put(333, new Point(5,3));
		
		points.remove(222);
		
		
		//Liste von Werten ohne Schlüssel
		Collection<Point> col =points.values();
		for (Point point : col) {
			System.out.println(point);
		}
	
		
		//Map durchlaufen
		for(Map.Entry<Integer, Point>  p : points.entrySet()){
			System.out.println(p.getKey()+":"+p.getValue() );
		}
		
		Set<Integer>keyset= points.keySet();
		for (Integer integer : keyset) {
			System.out.println(points.get(integer));
		}
		
	}

}
