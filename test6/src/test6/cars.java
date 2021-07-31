package test6;
public class cars {

	   String model;
	   int maxSpeed;

	   public cars (String model, int maxSpeed)
	   {
		   this.model=model;
		   this.maxSpeed=maxSpeed;
	   }

	   public static void main(String[] args) {
		   
	       cars bugatti = new cars("Bugatti",400);
	      
	       System.out.println(bugatti.model);
	       System.out.println(bugatti.maxSpeed);
	   }

	}
