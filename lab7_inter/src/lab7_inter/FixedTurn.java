

package lab7_inter;

import java.util.HashSet;
import java.util.Scanner;

public class FixedTurn implements inTurn {
	Scanner scanner = new Scanner(System.in);
	 HashSet hash = new HashSet();

	@Override
	public void goIn() {
		// TODO Auto-generated method stub
       System.out.println("Input Element ");
       for (int i=0;i<3;i++)
       {
       	System.out.println("Enter next element");
       	hash.add(scanner.nextInt());	
       }
       	System.out.println("array is full");
       	System.out.println(hash);
       
		

	}

	@Override
	public void goOut() {
		// TODO Auto-generated method stub
		  System.out.println("Remove element ");
	    
	        	
	        	hash.remove(scanner.nextInt());	
	        	System.out.println("element is deleted");
	        	System.out.println(hash);
	       
	}

	}


