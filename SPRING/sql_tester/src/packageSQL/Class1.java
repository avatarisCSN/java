package packageSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import packageSQL.MysqlConnect;


public class Class1 {

	
	
	
	public static void main (String[] args)  {
		Connection connection;
		try {
			connection = MysqlConnect.getMySQLConnection();

		Statement statement = connection.createStatement();
		String sql_query =  "Show Columns from developers";
		ResultSet rs = statement.executeQuery(sql_query);
		while (rs.next()) {
		      System.out.println(rs.getString(1));
		       
		     }
		connection.close();
		System.out.println("table is changed");
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
			}	
		
		}	

		}	
	


