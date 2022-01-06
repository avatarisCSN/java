package sql_tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Class1 {

	
	
	
	public static void main (String[] args) throws SQLException,
    ClassNotFoundException {
		{
		//String jdbcURL = "jdbc:mysql://localhost:3306/mybd";
		//String username = "user";
		//String password = "asdfgh665599";
	
		Connection connection = MysqlConnect.getMySQLConnection();
		String c="hello";
		Statement statement = connection.createStatement();
		String sql_query =  "INSERT INTO авторы  (псевдоним , фамилия , имя )"+"VALUES ('Бургон', 'Домогаева', 'Виктор')";
		int rows = statement.executeUpdate(sql_query);
		connection.close();
		System.out.println("table is changed");
		}	
		
	}

}
