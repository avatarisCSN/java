package test;

public class Program {

	public static void main(String[] args) {
		test1.printText();
		int [][] i3= new int[2][10];
		int[] i1 = new int[10];
		int[] i2 = new int[10];

		for (int i=1;i<11;i++)
		 {
			 i3[0][i-1]=i;
		     i3[1][i-1]=i+10;
		     
		 }
		 i1= i3[0];
		 i2= i3[1];
		 for (int i=0;i<10;i++)
		 {
			 System.out.println(i1[i]);
			 System.out.println(i2[i]);

		     
		 }


	}

}
