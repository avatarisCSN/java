import java.util.Scanner;

public class lab1 {
	
	public static  Scanner scan1;





	public static int sumDigits(int numb) {
        int sum = 0;
        while (numb > 0) {
            sum += numb % 10;
            numb /= 10;
        }
        return sum;
    }
	public static int[] sumEachDigit(long number, int i1[]) {
        long check;
        
        while (number > 0) {
            check = number % 10;
            number /= 10;
            i1[(int) check]+=1;
         }
        return i1;
    }
	public static int[]  sumDigit2_4( int chislo_n, int i1[])
	{
		 if(chislo_n<=12 && chislo_n>=10)
		  {
			  i1[chislo_n]=+1;
		  }
		  else
		  {
			   i1=sumEachDigit(chislo_n, i1);  
		  }
		
		return  i1;
	}
		
	public static int entering() {
		int number1 = 0;
		
		
		while(number1 < 1)
		{
			System.out.println("������� �����");
			
		scan1 = new Scanner(System.in);
		if (scan1.hasNextInt()) {
	            number1 = scan1.nextInt();
	           System.out.println("�������! �� ����� ����� " + number1);
	       } else {
	           System.out.println("��������, �� ��� ���� �� �����. ������������� ��������� � ���������� �����!");
	       }
			
		System.out.println(number1);
		
	}
		return number1; }
       
	public static int[] Main()
	{
		int d=5;
		if( d<=12 && d>=10)
		  {
			System.out.println(d); 
		  }
		
		
	int chislo2=0;	
	int date1 = entering();
	int date2 = entering();
	int date3 = entering();
	System.out.println(date1+" "+date2+ " "+date3);
	int chislo1=sumDigits(date1)+sumDigits(date2)+sumDigits(date3);	
	
	
	if (chislo1 >= 10)
	{
	 chislo2=sumDigits(chislo1);
	}
	
	int chislo3=chislo1-2*(date1/=10);
	
	int chislo4=sumDigits(chislo3);
	int chislo5=chislo1+chislo3;
	int chislo6=chislo2+chislo4;
	
	String s = chislo1+""+chislo3+""+date1+""+date2+""+date3;
	System.out.println(chislo1+" "+chislo2+" "+chislo3+" "+chislo4+" "+chislo5+" "+chislo6+" "+date1+" "+date2+" "+date3);
	long numbers=Long.parseLong(s);
	
	
	int i1[] = new int[13];
	int i;
	i1=sumEachDigit(numbers, i1);
	
	i1=sumDigit2_4( chislo2, i1);
	i1=sumDigit2_4( chislo4, i1);
 
	
	for( i=0; i < 13; i++ )
	{
		System.out.print(i+" "+i1[i]+"    ");
	}
	int chislo[]  = new int[6];
	
	chislo[0]=chislo1;
	chislo[1]=chislo2;
	chislo[2]=chislo3;
	chislo[3]=chislo4;
	chislo[4]=chislo5;
	chislo[5]=chislo6;
	return  chislo;
}
	
	}

