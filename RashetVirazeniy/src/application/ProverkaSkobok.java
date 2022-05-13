package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProverkaSkobok {

	public static boolean  Main (String input) {
		
		//String input = "(5+(5-)+(5+5)+-(10)+5)";
		boolean checker;
		
		Pattern pattern = Pattern.compile("\\([\\d\\+\\/\\*\\-]*\\)");
	    Matcher matcher = pattern.matcher(input);
	    
	    Pattern pattern1 = Pattern.compile("\\d+\\(");
	    Pattern pattern2 = Pattern.compile("\\)\\d+");
	    Matcher matcher1 = pattern1.matcher(input);
	    
	    Pattern pattern3 = Pattern.compile("[\\*\\/\\-\\+]+\\)");
	    Matcher matcher3 = pattern3.matcher(input);
	    
	    if(matcher3.find())
	    {
	    	System.out.println(matcher3.group()+" ошибка,перед закрывающей скобкой не должно быть знака");
	    	 return false;
	    }
	    
	    if( matcher1.find())
	    {
	    	 System.out.println(" 1");
	    	            System.out.println(matcher1.group()+" Ошибка перед скобкой нет действия");
	    	            return false;
	    }
	    matcher1 = pattern2.matcher(input);	 
	    if( matcher1.find())
	    {
	    	            System.out.println(matcher1.group()+" После скобки нет действия");
	    	            return false;
	    }
	    
	    
	    
	
	    while (matcher.find())
	    	{
	    	
		    //	 matcher = pattern.matcher(input);
		    	   //      System.out.println(matcher.group());    
		    	   //      System.out.println(input + " 1");
		      input = matcher.replaceAll(""); 
		           //      System.out.println(input + " 2");
		      matcher = pattern.matcher(input);
		                
		    }
	             
	    
	    if( input.indexOf("(") !=-1 && input.indexOf(")")==-1 || input.indexOf("(") ==-1 && input.indexOf(")")!=-1  )
	    {
	    	 System.out.println(" не верно");
	    	 return false;
	    }
	    else {
	    	System.out.println(" верно");
	    	 return true;
	    }
	}

}
