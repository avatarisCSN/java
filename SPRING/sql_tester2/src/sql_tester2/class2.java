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
    			//String sql_query =  "Select ���������, '��������� ���������' FROM ���������� WHERE '��������� ���������' >= 3.0"; //���-�� �������� ���������
    			String sql_query =  "Select ���������, ���������  FROM ���������� " ; //���-�� �������� ���������
    			ResultSet resultSet = statement.executeQuery(sql_query);
    			while (resultSet.next()) {
    			System.out.println(resultSet.getString("���������"));
    			System.out.println(resultSet.getDouble("���������"));	
            }
    			connection.close();       						
			} catch (ClassNotFoundException | SQLException e1) {			
				System.out.println("������");
			}
		}	
		
	}

}
