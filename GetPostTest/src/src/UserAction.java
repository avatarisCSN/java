package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import src.Connector;

public class UserAction {

	public static String Autorization (String Login, String Password)
	{
		String Role="";
		Connection connection;
		
		try {
			connection = Connector.Connect();  
			
		Statement statement = connection.createStatement();
		String sql_query =  "SELECT Login, Password, UserRole FROM user";
		ResultSet rs = statement.executeQuery(sql_query);
		while (rs.next()) {
	      if(rs.getString(1).equals(Login))
	      {
	    	  if(rs.getString(2).equals(Password))
	    	  {
	    		  //удача
	    		  Role = rs.getString(3);
	    		  System.out.println(Role);
	    	  }
	    	  else
	    	  {
	    		  System.out.println("wrong password");
	    	  }
	      }
	      else
	      {
	    	  System.out.println("no registr"); 
	      }
	    	 
		     }
		connection.close();
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
			}		
		
	
	return Role;
	}
	
	public static void Registration (String Login, String Password, String UserRole)
	{
		 Connection connection;
		 
			try {
				connection = Connector.Connect();
		      
			Statement statement = connection.createStatement();
			String sql_query =  "INSERT INTO  голубов_диплом.user(Login, Password, UserRole) VALUES ("+Login+", "+Password+", "+UserRole+")";
			ResultSet rs = statement.executeQuery(sql_query);
			
		 
			connection.close();

			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
				}	
	}
}
