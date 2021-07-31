package application;
import java.io.*;
import java.util.*;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;


public class AppUsObj {
    private String name;
    private double price;
    private int quantity;
    String Param1;
    String Param2;
    String Param3;
    String Param4;
    String Param5;
    String StrParams;
    //static String Param1;
   // static String Param2;
    //static String Param3;
   // static String Param4;
  //  static String Param5;

    

    public  AppUsObj()
    {
    	name=" ";
        price= 0;
        quantity= 0;
        Param1=" ";
        Param2=" ";
        Param3=" ";
        Param4=" ";
        Param5=" ";
        StrParams=" ";
    }
    public void print()
    {

        System.out.println(Param1+" "+Param2+" "+Param3+" "+Param4+" "+Param5);

        
    }
    public void printList()
    {
    	System.out.println(Param1+" "+Param2+" "+Param3+" "+Param4+" "+Param5);
    	
    	StrParams = Param1+" "+Param2+" "+Param3+" "+Param4+" "+Param5;
    	System.out.println(StrParams);
    }
    public void PutBuff()
    {

    	//Param1=  Main.textField1.getText();
    	//Param2=  Main.textField2.getText();
    //	Param3=  Main.textField3.getText();
    //	Param4=  Main.textField4.getText();
    //	Param5=  Main.textField5.getText();
    	//AppUsObj1[1] = Param1;
    	
    	
    	
    //	System.out.println("OK " + Param1);
   // 	System.out.println("OK " + Param1);
   // 	Param1=" ";
   //     Param2=" ";
   //     Param3=" ";
    //    Param4=" ";
    //    Param5=" ";

    }
    public void writeData(PrintWriter out)
    throws IOException
    {
        out.println(Param1+"|"+Param2+"|"+Param3+"|"+Param4+"|"+Param5);
    }
    public void readData(BufferedReader in)
    throws IOException
    {

    	String s=in.readLine();
        StringTokenizer t=new StringTokenizer(s,"|");
        Param1=t.nextToken();
        Param2=t.nextToken();
        Param3=t.nextToken();
        Param4=t.nextToken();
        Param5=t.nextToken();
       // price=Double.parseDouble(t.nextToken());
      //  quantity=Integer.parseInt(t.nextToken());
    }

    
    
    
    

}
