package findNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double rnd = Math.random();
		int chislo = (int)Math.round(100*rnd);
		 System.out.println(chislo);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
      int chislo2;
        do {
           chislo2 = scan.nextInt();
           System.out.println(chislo2+" chislo2");
        } while (chislo!=chislo2);
        System.out.println("Угадал УРА!");
        scan.close();  
     
      
      int n=10;
      String d=String.valueOf(n);
      System.out.println(d);

	}

}
