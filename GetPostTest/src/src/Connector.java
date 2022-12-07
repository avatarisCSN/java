package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public  class Connector {
	

	static final  String dbName = "голубов_диплом";
	    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    static final String DATABASE_URL = "jdbc:mysql://localhost/"+dbName;

	    static final String USER = "user";
	    static final String PASSWORD = "asdfgh665599";

	    public static Connection Connect() throws ClassNotFoundException, SQLException {
	        Connection connection = null;
	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
	        return connection;
	    }
	}
	

