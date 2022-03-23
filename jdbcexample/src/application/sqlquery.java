package application;
import java.sql.*;

import application.MysqlConnect;

public class sqlquery {
	

	


	

		
		
		
		public static void main (String[] args) throws SQLException,
	    ClassNotFoundException {
			{
		
		
			Connection connection = MysqlConnect.getMySQLConnection();
			String z= "hello";
			PreparedStatement statement = connection.prepareStatement(z);
			
			// public void CreateTable(String name) {
			
           //  String sql_query1 =  "CREATE TABLE "+name+"( ?, ?, ?, ? )"		;
			
			// statement.setString(1, "id INT");
			// statement.setString(2, "name VARCHAR(50)");
			// statement.setString(3, "specialty VARCHAR(50)");
			// statement.setString(4, "salary INT");
			 //statement = connection.prepareStatement(sql_query1);
			// System.out.println("table created");
		//	int rows2 = statement.executeUpdate();
			// }
			
			
			// public void DeleteTable(String name) {
			
		//	String sql_query2 =  "DROP TABLE name"	;
		
		// statement = connection.prepareStatement(sql_query2);
		//System.out.println("table is changed3");
		//int rows3 = statement.executeUpdate();
			// очистка поля и/или ничего
			// }
			
			
			//public void AddColumn (String name3){
		//	String f=" developers "; 
			//разделение строки name3
	//	String v=" hell INT ";
	//	String sql_query3 =  "ALTER TABLE" +name3+ "ADD COLUMN"+name3;	
	// statement = connection.prepareStatement(sql_query3);
	//System.out.println("table is changed2");
	//int rows4 = statement.executeUpdate();
			// показ таблицы
			//}
		
			
		//metod4
			//public void DeleteColumn (String name4){
			
			//	String f2=" developers ";
			//	String v2=" hell  ";
			//разделение строки name4
		//String sql_query4 =  "ALTER TABLE " +name4 " Drop COLUMN " +name4  ;
		// statement = connection.prepareStatement(sql_query4);
		//System.out.println("table is changed2");
		//int rows5 = statement.executeUpdate();
			// показ таблицы
			// }
		
		//метод5
			//public void AddField (String name5){
			//String a = "developers";
			//разделение строки + получение данных о атрибутах строки
			//String sql_query5 =  "INSERT INTO "+a+ " (? , ? , ?, ? )"+"VALUES (?, ?, ?, ?)";
			//statement = connection.prepareStatement(sql_query5);
			//statement.setString(1, "java");
			//statement.setString(2, "java");
			//statement.setString(3, "java");
			//statement.setString(4, "java");
			//statement.setInt(5, 1);
		//	statement.setString(6, "java");
			//statement.setString(7, "java");
		//	statement.setInt(8, 500);
		//	int rows5 = statement.executeUpdate();
			//показ таблицы
			//}
			
			//metod6
			//public void DeleteField (String name6){
			//разделить name6
			//String b2 = "developers";
			//String c2 = "developers";
		//	String sql_query6 =  "DELETE FROM "+name6+" WHERE "+name6+"=name6";
			// statement = connection.prepareStatement(sql_query6);
			//int rows6 = statement.executeUpdate();
			//System.out.println("table is changed");
			// обновление таблицы
			//}
			
			//public void ShowTable (String name7){
			//метод7 show table
			//String b3 = "developers";
			//String sql_query7 =  "Select * FROM "+b3+" ";
			//ResultSet resultSet = statement.executeQuery(sql_query7);
		//	 statement = connection.prepareStatement(sql_query7);
		//	System.out.println("table is changed2");
		//	resultSet = statement.executeQuery();
		//	while (resultSet.next()) {
         //       id = resultSet.getInt("id");
        //        name = resultSet.getString("name");
        //        specialty = resultSet.getString("specialty");
         //       salary = resultSet.getInt("salary");
         //       System.out.println("id: " + id);
           //     System.out.println("Name: " + name);
             //   System.out.println("Specialty: " + specialty);
              //  System.out.println("Salary: $" + salary);
              //  System.out.println("\n=========================\n");
          //  }
			//System.out.println("table is show");
			// показ таблицы
		   // }
			connection.close();
			}	
		}

	}
