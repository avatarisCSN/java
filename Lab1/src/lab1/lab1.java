package lab1;
import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter d1, d2, angle a");
		 int d1= scanner.nextInt();
		 int d2= scanner.nextInt();
		 int a= scanner.nextInt();
	
		
		 
		 double b = Math.toRadians(a); 
		  
	        double sin = Math.sin(b); 
		if (d1<1)
		{
			System.out.println("mistake");
		}
		else 
		{
			double s=d1*d2*0.5*sin;
			System.out.println(s);
		}
	}

}
