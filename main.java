package donguler;

public class main {

	public static void main(String[] args) {
		// Döngüler
		//1. for döngüsü
		for (int i=5; i<15; i+=3) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti");
		
		//2. while döngüsü
		int j = 3;
		while (j<6) {
		 System.out.println(j);
		 j++;
		}
	   System.out.println ("While döngüsü bitti");
	   
	   //3. do-while döngüsü
	   int k = 2;
	   do {
		   System.out.println(k);
		   k+=5;
		} while (k<25);
	   System.out.println("Do-while döngüsü bitti");
	   
		
		
		
	}

}
