package sql_tester2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class class2 {

	
	
	
	public static void main (String[] args) throws SQLException,
    ClassNotFoundException {
		{
	
	
		Connection connection = MysqlConnect.getMySQLConnection();
		
		Statement statement = connection.createStatement();
		String sql_query =  "INSERT INTO авторы  (псевдоним , фамилия , имя )"+"VALUES ('rfrrfr', 'Домогаева', 'Виктор')";
		boolean rows = statement.execute(sql_query);
		connection.close();
		System.out.println("table is changed");
		}	
		
	}

}
