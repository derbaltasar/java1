package j1d_UE_FileFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;


public class FileFilter {
	public final static String IN_FILE = "top10000de.txt";
	public final static String OUT_FILE = "top10000de_new.txt";
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TreeSet -> sortiert und ohne Mehrfach-Elmente
		Collator col = Collator.getInstance(Locale.GERMAN);
		TreeSet<String> set = new  TreeSet<>(col);
		
		try {
			Scanner sc = new Scanner(new File(IN_FILE));
			while(sc.hasNext()){
				set.add(sc.nextLine());
			}
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(OUT_FILE));
			for (String line : set) {
				bw.write(line);
				bw.newLine();
			}
			
			bw.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Laufzeit:" + (System.currentTimeMillis() - start));
		
	
	}

}
