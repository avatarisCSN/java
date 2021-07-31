package test4;


import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	
		
		
	
		

	
	


	public static void main(String[] args)
	{
		int x = 5;
String[] Result= new String[x];
			
			   
				   String str = "5lk-8l-6h+44k=20";
				   StringTokenizer tokenizer = new StringTokenizer(str,"+-=");
				   int c=0;
				   while (tokenizer.hasMoreTokens())
				   {
					   
					   
				      String token = tokenizer.nextToken();
				      Result[c] = token; 
				      System.out.println(token);
				      c++;
				       
				   }
				   
				// создаем список строк
				   String[] result2 = new String[x];
					for (int count=0; count < x; count++ )
					{
					// создаем два буферных массива символов
					char[] buff = Result[count].toCharArray();
					char[] buff2 = new char[buff.length];
					
					
					
					// создание переменных для оператора while
					// ап 3>0 2>0 1>0
					// даун 0  1.0 2.1 3.2
					int lengthUP = buff.length;
					int lengthDN = 0;
					// проверка на число 
					while(lengthUP>0)
					{
						lengthUP--;
						lengthDN++;
						
						 boolean tru = Character.isDigit(buff[lengthDN-1]);
						
						 //присвоение
						 if (tru)
						 {
							buff2[lengthDN-1] = buff[lengthDN-1];
							
							if(result2[count] == null)
							{
							result2[count]=Character.toString(buff2[lengthDN-1]); 
							}
							else
							{
							
							result2[count]+=Character.toString(buff2[lengthDN-1]); 
							}
						 }
						 
						
					}
					System.out.println(result2[count]);
					
				
					
					}
					
		
					int[] resultInt = new int[x];
					for (int i=0; i<x; i++)
					{
						resultInt[i]=Integer.parseInt(result2[i]);
						System.out.println(resultInt[i]);
					}
		
		
		
		
			   
	

	}

}

