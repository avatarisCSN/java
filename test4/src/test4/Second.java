package test4;

import java.sql.SQLException;

public class Second {
	public   String qwe="hello";
	public static Second sec2;
	private Second() throws SQLException,
    ClassNotFoundException {}
	
	 public static Second getInstance() throws SQLException,
     ClassNotFoundException {
		    if (sec2 == null) {
		      sec2 = new Second();
		    }
		    return sec2;
		  }	

 
 public static void SecondWork()
{
	 String d="Hello";
	System.out.println(d+ " my  friend");
}
}
	