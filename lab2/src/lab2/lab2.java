package lab2;
import java.util.Scanner;

public class lab2 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		
		 System.out.println("enter numbers");
		 double eps_stat, eps_now, x, S1 , S2, Sum;
		
		 
		 System.out.println("enter x");
		 x=scan.nextDouble();
		 S1=1/(x+2);
		 Sum=S1;
		 S2=-1/(4-2*x);
		 int n=3;
		 System.out.println("enter eps_stat");
		 eps_stat=scan.nextDouble();
		
		 eps_now=Math.abs(S2-S1);
		 System.out.println(eps_stat);
		 System.out.println(eps_now);
		 while(eps_stat < eps_now) {
		 
		 Sum=Sum+S2;
		 S1=S2;
		  S2=Math.pow((-1), (n+1))*(1/(Math.pow(x, n)+n+1));
		  eps_now=Math.abs(S2-S1);
		  System.out.println(n);
		  System.out.println(eps_stat);
			 System.out.println(eps_now);
			 n++;
		 
	 }
		 System.out.println("sum="+ Sum);
		
	}

}





 

