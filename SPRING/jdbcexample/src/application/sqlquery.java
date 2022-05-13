package application;
import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import application.MysqlConnect;

public class sqlquery {
	

	public static String[] TextToString (String text)
	{

		
		 text = "ghbdtn, fhehehe,djdjej,eeee eeeee";
		
		StringTokenizer st = new StringTokenizer(text, " \t\n\r,.");
		int c   = st.countTokens() ;
		 String[] mass = new String[c];
		 int count =0;
		while (st.hasMoreTokens()) {
		    // Выводим лексемы в консоль
		    mass[count]= st.nextToken();
		    count++;
		}
	


		// сделать чтобі віводило и кол-во на которое разделило count11
		return mass;
	}
	
	


	

		
		
		
		public static void main (String[] args) throws SQLException,
	    ClassNotFoundException {
			{
				
				
				
		
		
			Connection connection = MysqlConnect.getMySQLConnection();
			String z= "hello";
			PreparedStatement statement = connection.prepareStatement(z);
			
			// public void CreateTable(String name) {
			
           //  String sql_query1 =  "CREATE TABLE "+name+"( ? )"		;
			
			// statement.setString(1, "id INT");
			
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
			//имя строки и тип
			//разделение строки name3
			String name3 = "sasas";
			String temp3[] = TextToString(name3);
			String name31 =temp3[0]; 
			String name32 =temp3[1]; 
	//	String v=" hell INT ";
	//	String sql_query3 =  "ALTER TABLE" +name31+ "ADD COLUMN"+name32;	
	// statement = connection.prepareStatement(sql_query3);
	//System.out.println("table is changed2");
	//int rows4 = statement.executeUpdate();
			// показ таблицы
			//}
		
			
		//metod4
			//public void DeleteColumn (String name4){
			String name4 = "sasas";
			String temp4[] = TextToString(name4);
			String name41 =temp4[0]; 
			String name42 =temp4[1]; 
			//	String f2=" developers ";
			//	String v2=" hell  ";
			//разделение строки name4
		//String sql_query4 =  "ALTER TABLE " +name41 " Drop COLUMN " +name42  ;
		// statement = connection.prepareStatement(sql_query4);
		//System.out.println("table is changed2");
		//int rows5 = statement.executeUpdate();
			// показ таблицы
			// }
		
		//метод5
		
			//public void AddField (String name5){
			//String a = "developers";
			//получить кол-во колонок!
			String name5 = "sasas";
			String temp5[] = TextToString(name5);
			int count11=5;
			String sum;
			for(int i=0; i<count11; i++) {
			 sum =sum.concat(temp5[i])  ;
			 sum += ", ";
			}
			//разделить на кол-во колонок!
			// метод по получению кол-ва колонок 
			
			//String sql_query5 =  "INSERT INTO "+temp5[0]+" VALUES ("+sum+")";
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
			
			String name6 = "sasas";
			String temp6[] = TextToString(name6);
			String name61 =temp6[0]; 
			String name62 =temp6[1]; 
			String name63 = temp6[2];
			
		//	String sql_query6 =  "DELETE FROM "+name61+" WHERE "+name62+"=name63";
			// statement = connection.prepareStatement(sql_query6);
			//int rows6 = statement.executeUpdate();
			//System.out.println("table is changed");
			
			//}
			
			
			//public void ShowTable (String name7){
			//метод7 show table
			
			
			//String sql_query71 =  "Show Columns from"+ name;
			//ResultSet resultSet = statement.executeQuery(sql_query71);
		//	 statement = connection.prepareStatement(sql_query7);
		//	System.out.println("table is changed2");
		//	resultSet = statement.executeQuery();
		//	ArrayList<String> ColumnNames = new ArrayList<>();
			 int count2 =0;
			 
			//Cделать из верхнего метод по получению кол-ва строк!!! выдает кол-во колонок и имена 
			 
			 
		//	while (resultSet.next()) {
			 //ColumnNames.add(resultSet.getString(1));	
			//count2++;
			// }
		
			//String sql_query72 =  "Select * FROM "+name7+" ";
			//ResultSet resultSet = statement.executeQuery(sql_query72);
		//	 statement = connection.prepareStatement(sql_query7);
		//	System.out.println("table is changed2");
		//	resultSet = statement.executeQuery();
			ArrayList<ArrayList<String>> TableInfo = new ArrayList<ArrayList<String>>();
			int j=0;
		//	while (resultSet.next()) {
			int count3 = 1;
        for(int i=0; i<count2; i++) { 
			 TableInfo.get(j).add(i, resultSet.getString(count3));
			 count3++;
        }
			j++;
			//System.out.println("table is show");
		   // }
			connection.close();
			}	
		}

	}
