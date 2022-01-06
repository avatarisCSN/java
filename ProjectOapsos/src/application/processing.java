package application;

import java.util.Scanner;

public class processing {
	
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
	
	public static int sumDigitsInNumber(int number) {
        int check;
        
        while (number > 12) {
            check = number % 10;
            number /= 10;
          number =+ check;
         }
        return number;
    }
	
	public static int[]  sumDigit0_5( int chislo_n, int i1[])
	{
		 if(chislo_n<=12 && chislo_n>=10)
		  {
			  i1[chislo_n]=+1;
			  if(chislo_n==10)
			  {
				  i1[1]=+1;
				  i1[0]=+1;
			  }
			  if(chislo_n==12)
			  {
				  i1[1]=+1;
				  i1[2]=+1;
			  }
		  }
		  else
		  {
			   i1=sumEachDigit(chislo_n, i1);  
		  }
		
		return  i1;
	}
	
	public static int[]  sumDigit1_3( int chislo_n, int i1[])
	{
		 if(chislo_n<=12 && chislo_n>=10)
		  {
			  i1[chislo_n]=+1;
			  if(chislo_n==10)
			  {
				  i1[1]=+1;
				  i1[0]=+1;
			  }
			  if(chislo_n==12)
			  {
				  i1[1]=+1;
				  i1[2]=+1;
			  }
		  }
		  else
		  {
			   i1=sumEachDigit(chislo_n, i1);  
		  }
		 if(chislo_n > 12)
		 {
		 int j = sumDigitsInNumber(chislo_n);
		 i1[j]=+1;
		 }
		return  i1;
	}
	
	
	
	
	public static String[]  sumDigitIntToString0_12(  int i1[], int i2[])
	{
		String[] i3 = new String[17];
		for(int d =0; d<13; d++)
		{
			int c = i1[d];
			int v = i2[d];
			String h="";
			String k="";
			while(c>0)
			{
				
				String f=Integer.toString(d);
				 h =h.concat(f);
				 i3[d]=h;
				 c=c-1;			
			}
			while(v>0)
			{
				
				String f=Integer.toString(d);
				 k =k.concat(f);
				 i3[d]=i3[d]+"("+k+")";
				 v=v-1;			
			}
			
			
		}
		
		
		
		return i3;
	}
	public static String[]  sumDigitIntToString13_16(  int i1[], int i2[], String i3[])
	{
	for(int i =13; i<17; i++)
	{
		i3[i]=i1[i]+"("+i2[i]+")";
	}
		
		
		
		return i3;
	}
	
	
	public static int entering() {
		int number1 = 0;
		
		
		while(number1 < 1)
		{
			System.out.println("Введите число");
			
		scan1 = new Scanner(System.in);
		if (scan1.hasNextInt()) {
	            number1 = scan1.nextInt();
	           System.out.println("Спасибо! Вы ввели число " + number1);
	       } else {
	           System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
	       }
			
		// System.out.println(number1);
		
	}
		return number1; }
       
	public static int[] Main(String date11, String date22, String date33 )
	{
		int d=5;
		if( d<=12 && d>=10)
		  {
			System.out.println(d); 
		  }
		
		
	int chislo2=0;	
	int date1 = Integer.parseInt(date11);
	int date2 = Integer.parseInt(date22);
	int date3 = Integer.parseInt(date33);
	
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
	
	
	int chislo[]  = new int[6];
	
	chislo[0]=chislo1;
	chislo[1]=chislo2;
	chislo[2]=chislo3;
	chislo[3]=chislo4;
	chislo[4]=chislo5;
	chislo[5]=chislo6;
	
	return  chislo;

}
	public static int[][] numbers12(String date1, String date2, String date3, int[] chislo )
	{
		String s = date1+""+date2+""+date3;
		// System.out.println(chislo[0]+" "+chislo[1]+" "+chislo[2]+" "+chislo[3]+" "+chislo[4]+" "+chislo[5]+" "+date1+" "+date2+" "+date3);
		long numbers=Long.parseLong(s);
		
		
		int i1[] = new int[17];
		int i2[] = new int[17];
		int i;
		i1=sumEachDigit(numbers, i1);
		
		i1=sumDigit0_5( chislo[0], i1);
		i1=sumDigit1_3( chislo[1], i1);
		i1=sumDigit0_5( chislo[2], i1);
		i1=sumDigit1_3( chislo[3], i1);
		i2 =sumDigit0_5( chislo[4], i2);
		i2 =sumDigit0_5( chislo[5], i2);
		
		
		
		
		i1[13]=sumDigitsInNumber(sumDigits(i1[1]*1+i1[2]*2+i1[3]*3));
		i2[13]=sumDigitsInNumber(sumDigits(i2[1]*1+i2[2]*2+i2[3]*3));
		
		
		i1[14]=sumDigitsInNumber(sumDigits(i1[4]*4+i1[5]*5+i1[6]*6));
		i2[14]=sumDigitsInNumber(sumDigits(i2[4]*4+i2[5]*5+i2[6]*6));
		
		i1[15]=sumDigitsInNumber(sumDigits(i1[7]*7+i1[8]*8+i1[9]*9));
		i2[15]=sumDigitsInNumber(sumDigits(i2[7]*7+i2[8]*8+i2[9]*9));
		
		i1[16]=sumDigitsInNumber(sumDigits(i1[10]*10+i1[11]*11+i1[12]*12));
		i2[16]=sumDigitsInNumber(sumDigits(i2[10]*10+i2[11]*11+i2[12]*12));
		
		 for( i=0; i < 17; i++ )
			 
			{
				// System.out.print(i+" "+i1[i]+"    ");
			}
		// System.out.println();
		 
		 for( i=0; i < 17; i++ )
			 
			{
			//	System.out.print(i+" "+i2[i]+"    ");
			}
		 System.out.println();
		 int [][] i3 = new int[2][17];
		 for ( i=0;i<17;i++)
		 {
			 i3[0][i]=i1[i];
		     i3[1][i]=i2[i];
		 }
		 return i3;
	}
	public static String[] matrToString(int[][] i3)
	{
		int i1[] = new int[17];
		int i2[] = new int[17];
		i1 = i3[0];
		i2 = i3[1];

		String lambo[] = new String[17];
		 lambo = sumDigitIntToString0_12(i1, i2);
		 lambo = sumDigitIntToString13_16(i1, i2, lambo);
		 
		 
		 
		 for(int  i=0; i < 17; i++ )
			{
			//	System.out.print(i+" "+lambo[i]+"    ");
			}
		
		return lambo;
	}
	public static String digit03 (int i)
	{
		String color="";
		if(i==2)
		{
			color="Green";
		}
		if(i<2)
		{
			color="Yellow";
		}
		if(i>2)
		{
			color="Red";
		}
		return color;
	}
	public static String digit12 (int i)
	{
		String color="";
		if(i==3)
		{
			color="green";
		}
		if(i<3)
		{
			color="yellow";
		}
		if(i>3)
		{
			color="red";
		}
		return color;
	}
	public static String digit4_more (int i)
	{
		String color="";
		if(i==1)
		{
			color="green";
		}
		if(i<1)
		{
			color="yellow";
		}
		if(i>1)
		{
			color="red";
		}
		return color;
	}
	
	}

