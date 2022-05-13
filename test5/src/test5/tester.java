package test5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.ProverkaSkobok;
import application.ProverkaZnakov;
import application.RashetVirazenia;

public class tester {

	public static void main(String[] args) {
String input = "(5*2+(2+2-10*8)+5)";
boolean bool =ProverkaSkobok.Main(input); 
System.out.println(bool);
if(bool)
{
boolean bool2 =ProverkaZnakov.Main(input); 
System.out.println(bool2);
if(bool2)
{
	double result = RashetVirazenia.Main(input);
	System.out.println(result +" result all");
}
}		

       
}
}