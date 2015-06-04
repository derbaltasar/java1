package app;

public class Schleifen {

	public static void main(String[] args) {
		//
		int i = 0;
		while(i <10){
			System.out.println("while"+i);
			i++;
			
		}
		
		int y=0;
		do{
			System.out.println("do while"+y);
			y++;
		}while(y<10);
		
		
		for(int j=0;j<10 ;j++){
			System.out.println("for "+j);
		}
		//-----------------------------------------
		String[] namen = {"Max","Otto","Ina"};
		
		for (int j = 0; j < namen.length; j++) {
			System.out.println(namen[j]);
			
		}
		//foreach
		for (String name : namen) {
			System.out.println(name);//aktuelle Element
		}
		
		
		
	}

}
