package application;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RashetSkobki {

	public static String MultDel (String full) {
		String full2; 
	
		
		
		
		//if( full.indexOf('(') == 0  && full.lastIndexOf(')')==full.length()) {
       full2 =full.substring(1, full.length()-1);
    //   System.out.println(full2 + " fffddd");
     //  System.out.println(full2 + " fffddd222");
	//	}
	//	else
		//{
		//full2 = full;	
	//	System.out.println(full2 + " fffddd");
	//	System.out.println(full2 + " fffddd222");
	//	}
		
		// операнд+второе число
		Pattern pattern = Pattern.compile("[\\*\\/]([\\+\\-]){0,1}");
		 Matcher matcher = pattern.matcher(full2);
		// второе число
		Pattern pattern2 = Pattern.compile("[\\+\\-]?(\\d+\\.?\\d*)");
		Matcher matcher2 = pattern2.matcher(full2);
		// первое число
		Pattern pattern3 = Pattern.compile("[\\+\\-]?(\\d+\\.?\\d*)[\\*\\/]");
		Matcher matcher3 = pattern3.matcher(full2);
		
		
		
	  double result = 0; 
	  
	  ArrayList<Double> resultMass = new ArrayList<Double>();
	
	   while(  matcher.find())
	   {
		   String operand = matcher.group();
		   operand =operand.substring(0,1);
		        //    System.out.println(operand+"  знак");
  
		  matcher3 = pattern3.matcher(full2); 
		  matcher3.find();
		
		  String sub3=matcher3.group();
		           //  System.out.println(sub3+" до знака вместе с знаком");
		  int index1=full2.indexOf(sub3);
		           //  System.out.println(index1+" index1");
		  sub3 = sub3.substring(0, sub3.length()-1);
		           //  System.out.println(sub3+" то, что до знака");//  срезание всего, что идет до Їтого места
		             
		  String sub4 =full2.substring(index1+sub3.length()+1);
		          //  System.out.println(sub4+" то, что после знака");
		            
		  matcher2 = pattern2.matcher(sub4);
		  matcher2.find();
		  String sub5 =matcher2.group();
		          // System.out.println(sub5+" второе число");

		  if(  0==operand.compareTo("*"))
		  {		  
		  result=Double.parseDouble(sub3)*Double.parseDouble(sub5);
		           //   System.out.println(Double.parseDouble(sub3)+ " sub3 parsing");
		           //   System.out.println(Double.parseDouble(sub5)+ " sub5 parsing");
		           // вывод результата умножени€
		           
		  }
		  else
		  {        
			  result=Double.parseDouble(sub3)/Double.parseDouble(sub5);
			       //вывод результата делени€
		  }
		   full2=full2.replace(sub3+operand+sub5, Double.toString(result));
		          //    System.out.println(sub3+operand+sub5);
		          //    System.out.println(result+ " результат действи€");
		           //   System.out.println(full2+" full2 - result string");
		  
		  
                     
           matcher = pattern.matcher(full2);  
           			  
		  resultMass.add(result);     
		          //   System.out.println(result);
		          //   System.out.println(" ");
	   }
	              //  System.out.println(full2+" otvet*/");
	   return full2;
	   
	}
	
public static double PlusMinus (String insert)  {

	Pattern pattern = Pattern.compile("([\\\\+\\\\-])*\\d+(\\.\\d+){0,1}");
	 Matcher matcher = pattern.matcher(insert);
	 Pattern pattern2 = Pattern.compile("([\\+\\-])+");
	 Matcher matcher2 = pattern2.matcher(insert);
	 double resulter=0;
	 String Znak="";
	 int ZnakLength=0;
      
	 while( matcher.find() )
	 {
		      
		 String ChisloIn=matcher.group();
		          // System.out.println(ChisloIn+" число»н");
		
		          //  System.out.println(ChisloIn.length()+" длина число»н");
		 matcher2 = pattern2.matcher(ChisloIn);
		 if(matcher2.find())
		 {
			 Znak=matcher2.group();
			       // System.out.println(Znak+" Znak");
			 if(Znak.length()==2)
			 {
				 ZnakLength=2;
				 switch (Znak) {
		           case  ("+-"):
		             Znak="-";
		               break;
		           case ("++"):	
		        	   Znak="+";
		               break;
		           case  ("-+"):
		        	   Znak="-";
			               break;
			           case ("--"):
			        	   Znak="+";
			               break;
                             }
		     }
			 else if (Znak.length()==1)
			 {
				 ZnakLength=1;
			 }	 
			 else
			 {
				 ZnakLength=0; 
			 }
		 }
		 
		 //получить число с исправленным знаком
	              	// System.out.println(ZnakLength+" ZnakLength");
		 String chislo = ChisloIn.substring(ZnakLength);
		             //  System.out.println(chislo+" chislo");
		            //   System.out.println(Znak+" Znak"); 
		 String chislo2 = Znak.concat(chislo);
		            //   System.out.println(chislo2);
		             //   System.out.println(Double.parseDouble(chislo2));
		  resulter+=Double.parseDouble(chislo2);              
	               //   System.out.println(resulter+" otvet");      
	  Znak="";
	  ZnakLength=0;     
}
	                   System.out.println(resulter+" otvet+-"); 
		return resulter;    
	}
}
