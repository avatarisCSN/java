package omg;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.net.URL;
import java.util.ArrayList;

import java.util.Scanner;

public class Methods {
	
	
	
	
    //static ArrayList<int[]> Bid = new ArrayList<int[]>();
	//static ArrayList<int[]> Ask = new ArrayList<int[]>();
	
	public static int[] findMax(ArrayList<int[]> str) {
		int PriceMax = 0;
		int IndexOfMax = 0;
		int sizeMax=0;
		int[] result = new int[3];
	for (int i = 0; i < str.size(); i++)
	{
		 
		  int[] bufferMas = str.get(i);
		  int price = bufferMas[0];
		  int size = bufferMas[1];
		  if (price > PriceMax)
		    {
			  PriceMax = price;
		        IndexOfMax = i;
		        sizeMax = size;
        
		    }	  
	}

 
 result[0] = IndexOfMax;
 result[1] = PriceMax;
 result[2]=sizeMax;
	return result;
	} 
	
	public static int[] findMin(ArrayList<int[]> str) {
		int PriceMin=0;
		int IndexMin = 0;
		int SizeMin=0;
		int[] result = new int[3];
		 
	for (int i = 0; i < str.size(); i++)
	{
		 
		  int[] bufferMas = str.get(i);
		  // bufferMas[0];  price
		  //  bufferMas[1];  size
		   
		  if(i==0)
		  {
			  IndexMin = i;
			  PriceMin=bufferMas[0];
			  SizeMin= bufferMas[1];
			  
		  }
		  
		  if (bufferMas[0] < PriceMin)
		    {
			  IndexMin = i;
			  PriceMin = bufferMas[0];
			  SizeMin= bufferMas[1];
		    }	
	}
	 
	  
	  result[0] = IndexMin;
	  result[1] = PriceMin;
	  result[2]=SizeMin;
	
	return result;
	} 
	
	public static int Find_By_Price(ArrayList<int[]> str, int price)
	{
		int size=0;
		for(int i = 0; i < str.size(); i++)
		{
			int[] bufferMas = str.get(i);
			  int price2 = bufferMas[0];
			  if(price2==price)
			  {
			   size = bufferMas[1];
			  }		
		}
		return size;
	}
	
	public static int[] Search_Price_In_Array (ArrayList<int[]> Str,  int price2)
	{
		int[] result = new int[3];
	for (int i = 0; i < Str.size(); i++)
	{
		 
		  int[] bufferMas = Str.get(i);
		  int price = bufferMas[0];
		   
		  if (price == price2)
		    {
			  
				
			  result[0] = i;
			  result[1] = bufferMas[0];
			  result[2]=bufferMas[1];
		    }	  
	}
return result;
	}
	
  public static int Splitter(String s)
  {
	  String[] strg = s.split(" ");
		int d = Integer.parseInt(strg[0]);  
		return d;
  }
	
	
public static ArrayList<String>  Get_Strings_From_File() throws IOException
{
	ArrayList<String> STR = new ArrayList<String>();
	//Methods  ApplicationRunner
	//URL url = Methods.class.getResource("/input.txt");
	//File file = new File(url.getFile());
	File file = new File("input.txt");
	
	
	Scanner scan = new Scanner(file);
	while(scan.hasNextLine()) {
		
	String d = scan.nextLine();
	STR.add(d);
	//str[i]= d;


	}
	
	
	scan.close();
	
	return STR;
}

public static ArrayList<int[]> Add_Price_In12 (ArrayList<int[]> Bid,  int price , int size)
{
	
	int[] Buffer =  Methods.Search_Price_In_Array(Bid, price);
	if(Buffer[2]==0)
	{
		Bid.add(new int[] {price,size});
	
		
	}
	else
	{
		int index2=Buffer[0];
		int price2=Buffer[1];
		int size2=Buffer[2];
		int[] insert = new int[2]; 
		size2=+size;
		insert[0]= price2;
		insert[1]=size2;
		Bid.add(index2, insert );
		
	}	
	return Bid;
}

public static int Print_Best_Bid3 (ArrayList<int[]> Bid,int count) throws IOException
{
	
	Methods.findMax(Bid);
	int[] result = new int[3];
	result = Methods.findMax(Bid);
	 FileWriter fw = new FileWriter("output.txt", true);
	 if(count==1)
	 {
	 fw.write("\r\n");	
	 }
	 count =1;
	 fw.write(result[1]+","+result[2]);
	
	 fw.close(); 

return count;
}

public static int Print_Best_Ask4 (ArrayList<int[]> Ask,int count) throws IOException
{	
	
	 Methods.findMin(Ask);
	int[] result = new int[3];
	result =  Methods.findMin(Ask);
	 FileWriter fw = new FileWriter("output.txt", true);
	 if(count==1)
	 {
	 fw.write("\r\n");
	 }
	 count=1;
	 fw.write(result[1]+","+result[2]);
	
	 fw.close(); 
	
	 return count;		
}


public static int Print_Size_At_price5 (ArrayList<int[]> Bid, ArrayList<int[]> Ask, int price,int count) throws IOException
{
	
	int size1= Methods.Find_By_Price(Bid, price);
	int size2= Methods.Find_By_Price(Ask, price);
	int result=size1+size2;
	 FileWriter fw = new FileWriter("output.txt", true);
	 if(count==1)
	 {
	 fw.write("\r\n");
	 }
	 count=1;
	
	 fw.write(Integer.toString(result));
	
	 fw.close(); 
	
	 return count;
}

public static void Method_O_Buy_6 ( ArrayList<int[]> Ask, int size)
{
	// поиск минимума
	
	int Min[] =  Methods.findMin(Ask);
	int index2=Min[0];
	int price2=Min[1];
	int size2=Min[2];
	
	if(size2 < size)
	{
		int Min3[] = new int[2];
		Min3[0]=price2;
		Min3[1]=size2-size;
		
		Ask.remove(index2);
		Ask.add(index2, Min3);
		//System.out.println("We bought all");
	}
	else if(size2 > size)
	{
		
		Ask.remove(index2);
		
	//	System.out.println("We bought only "+size2 +" amount");
	}
	else
	{
		Ask.remove(index2);
	//	System.out.println("We bought all");	
	}	
}

public static void Method_O_Sell_7 (ArrayList<int[]> Bid, int size)
{
	
		int Max[] =  Methods.findMax(Bid);
		int index2=Max[0];
		int price2=Max[1];
		int size2=Max[2];
		
		
		
		if(size2 > size)
		{
			
			int Max3[] = new int[2];
			Max3[0]=price2;
			Max3[1]=size2-size;
			
			Bid.remove(index2);
			Bid.add(index2, Max3);
		//	System.out.println("We bought all");
		}
		else if(size2 < size)
		{
			
			Bid.remove(index2);
		//	System.out.println("We bought only "+size +" amount");
		}
		else
		{
			Bid.remove(index2);
		//	System.out.println("We bought all");
			
		}

		
}



public static int  Analyze_String(String str, ArrayList<int[]> Bid, ArrayList<int[]> Ask, int count ) throws IOException 
{
String[] strg = str.split(",");

if (strg[0].equals("u"))
{

	if (strg[3].equals("bid"))
	{
		//System.out.println("method1");
		int c =Splitter(strg[1]);
		int d =Splitter(strg[2]);
		Methods.Add_Price_In12(Bid, c, d);	
		
	}
	else {
		//System.out.println("method2");
		int c =Splitter(strg[1]);
		int d =Splitter(strg[2]);
		Methods.Add_Price_In12(Ask, c, d);
		
	}
	
}
else if (strg[0].equals("q"))
{
	if (strg[1].equals("best_bid"))
	{
	//	System.out.println("method3");
		count= Methods.Print_Best_Bid3(Bid, count);
	}
	else if (strg[1].equals("best_ask"))
	{
	//	System.out.println("method4");
		count=	Methods.Print_Best_Ask4(Ask, count);
	}
	else
	{
		
		int c =Splitter(strg[2]);
		count=	Methods.Print_Size_At_price5(Bid, Ask,c,count );	
	}
	
}
else if (strg[0].equals("o"))
{
	if(strg[1].equals("buy"))
	{
		//System.out.println("method6");
int c =Integer.parseInt(strg[2]);
		Methods.Method_O_Buy_6(Ask, c);	
	}
	else
	{
	//	System.out.println("method7");
		int d =Splitter(strg[2]);
		Methods.Method_O_Sell_7(Bid, d);
	}
}
return count;
}
}
