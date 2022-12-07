package test4;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	
		
		
	
		

	
	


	public static void main(String[] args) throws SQLException,
    ClassNotFoundException
	{
		String s;
		s = "“естова€ строка, используема€ дл€ разложени€ на слова";
		StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
		while (st.hasMoreTokens()) {
		    // ¬ыводим лексемы в консоль
		    System.out.println(st.nextToken());
		   
		}
		 Second.SecondWork();
Second sec = Second.getInstance();
Second sec2 = sec;
		 System.out.println(sec2.qwe);



		
		
		
		
			   
	

	}

}

