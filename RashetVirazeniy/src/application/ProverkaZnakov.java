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
    	   System.out.println("������ 3 �����");
    	   return false;
       }
       else
	    
	   if(  matcher.find())
	   {
		   System.out.println("������ * / ������ ���� �� ������ �����");
		   return false;
	   }
	   else
	   {
		   System.out.println("���� ���������");
		   return true;
	   }
	
		  
	   
	   
	}

	}


