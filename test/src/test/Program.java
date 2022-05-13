package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import javafx.application.Application;

class Sugar {}

public class Program {
    public static  class Milk {
    }





 public static void main(String[] args) 
 {
	
		    String text = "Егор Алла Александр";
		    Pattern pattern = Pattern.compile("А.+л");
		    Matcher matcher = pattern.matcher(text);
		    while (matcher.find()) {
		        System.out.println(text.substring(matcher.start(), matcher.end()));
		    }
	
 }






}
 
	 