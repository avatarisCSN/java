package application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class MysqlConnect {
	
	
			
	// Connect to MySQL
	   public static Connection getMySQLConnection() throws SQLException,
	           ClassNotFoundException {
	       String hostName = "localhost";

	       String dbName = "mybd";
	       String userName = "user";
	       String password = "asdfgh665599";

	       return getMySQLConnection(hostName, dbName, userName, password);
	   }

	   public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws SQLException,
       ClassNotFoundException {
		   String jdbcURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		   Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
		   return conn;  
		 
	   }
	
}
