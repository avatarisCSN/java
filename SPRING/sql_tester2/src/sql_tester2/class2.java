package sql_tester2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sql_tester2.MysqlConnect;


public class class2 {

	
	
	
	public static void main (String[] args) throws SQLException,
    ClassNotFoundException {
		{
	
	
			Connection connection;
			try {
				connection = MysqlConnect.getMySQLConnection();
    			Statement statement = connection.createStatement();
    			//String sql_query =  "Select выражение, 'результат выражения' FROM результаты WHERE 'результат выражения' >= 3.0"; //как-то получить выражение
    			String sql_query =  "Select выражение, результат  FROM результаты " ; //как-то получить выражение
    			ResultSet resultSet = statement.executeQuery(sql_query);
    			while (resultSet.next()) {
    			System.out.println(resultSet.getString("выражение"));
    			System.out.println(resultSet.getDouble("результат"));	
            }
    			connection.close();       						
			} catch (ClassNotFoundException | SQLException e1) {			
				System.out.println("ошибка");
			}
		}	
		
	}

}
