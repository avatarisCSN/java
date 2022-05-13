package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProverkaZnakov {

	public static boolean Main(String input) {
        //String input = "(5((845/8-)74/52)++))";
		
		Pattern pattern = Pattern.compile("[\\*\\+\\/\\-][\\*\\/]");
	    Matcher matcher = pattern.matcher(input);
	    Pattern pattern2 = Pattern.compile("[\\*\\+\\/\\-]{3}");
	    Matcher matcher2 = pattern2.matcher(input);

       if(matcher2.find())
       {
    	   System.out.println("ќшибка 3 знака");
    	   return false;
       }
       else
	    
	   if(  matcher.find())
	   {
		   System.out.println("ќшибка * / должны быть на первом месте");
		   return false;
	   }
	   else
	   {
		   System.out.println("¬вод правильн≥й");
		   return true;
	   }
	
		  
	   
	   
	}

	}


