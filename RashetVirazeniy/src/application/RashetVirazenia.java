package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RashetVirazenia {

	
		
		public static double Main(String input) {
        if(input.indexOf('(')  !=0 && input.lastIndexOf(')')!=input.length())
        {
        	input = "("+input+")";
        }
		
		Pattern pattern = Pattern.compile("\\([\\d\\+\\/\\*\\-\\.]*\\)");
	    Matcher matcher = pattern.matcher(input);
	    double plusMinus=0;
	    
	    do {
	    	              //       System.out.println(input+"first");
	    	 matcher = pattern.matcher(input);
	    	 while (matcher.find())
	    	 {
	    		 String input2=matcher.group();
	    		         //      System.out.println(input2+" inside");
	    		 
	    		 // Здесь должен быть метод расчета скобки input2
	    		 String multDel = RashetSkobki.MultDel(input2);
	    		           //     System.out.println(multDel+" multDel");  
	    		  plusMinus=RashetSkobki.PlusMinus(multDel);               
	    		            //     System.out.println(plusMinus+" plusMinus"); 
	    		
	    		 
	    		 //здесь надо вставить результат расчета в строку input2
	    		 input = input.replace(input2, Double.toString(plusMinus));
	    	 }
	    
	      	      
	           // System.out.println(input+"third");
	      matcher = pattern.matcher(input);
	    } while (matcher.find());
	    
	    
	    
	                System.out.println(plusMinus+" otvet_rash");
	                return plusMinus;
	}     
}
