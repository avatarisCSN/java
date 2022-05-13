package omg;


import java.io.IOException;

import java.util.ArrayList;

public class ApplicationRunner {
	 static ArrayList<int[]> Bid = new ArrayList<int[]>();
		static ArrayList<int[]> Ask = new ArrayList<int[]>();
	
		

	public static void main(String[] args) throws IOException {
		
	//	System.out.println("Starting program");
		ArrayList<String> File = new ArrayList<String>();
		File =  Methods.Get_Strings_From_File();
		 int count = 0;
		
		for(int i=0; i<File.size();i++)
		{
			count = Methods.Analyze_String(File.get(i), Bid, Ask, count );
		}

		
			
//System.out.println("End Program");
	}

	

}
