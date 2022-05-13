package application;
	
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import application.MysqlConnect;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	String newValue1;
		Double newValue2;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ObservableList<String> langs = FXCollections.observableArrayList();
	        ListView<String> langsListView = new ListView<String>(langs);
	        
	    	ObservableList<Double> langs2 = FXCollections.observableArrayList();
	        ListView<Double> langsListView2 = new ListView<Double>(langs2);
	        
	        Connection connection;
     		
     		try {
         		connection = MysqlConnect.getMySQLConnection();
         		Statement statement = connection.createStatement();
         		
         		String sql_query2 =  "CREATE TABLE результаты (id INT NOT NULL, выражение VARCHAR(45) NULL, результат DOUBLE NULL)" ;
         		boolean rows2 = statement.execute(sql_query2);
         		} catch (ClassNotFoundException | SQLException e1) {			
    				System.out.println("ошибка создания таблицы");
    			}
	        
	       
	        
	        // для рассчета и добавления в БД
	        TextField txt = new TextField("поле ввода");
	        
			Button btn7 = new Button("создать БД"); // нет
			Button btn8 = new Button("удалить БД");// нет
			Button btn2 = new Button("удалить выражение из БД");
			Button btn3 = new Button("рассчитать и добавить в БД выражение");
			Button btn4 = new Button("редактировать выражение");// готово
			Button btn5 = new Button("поиск по значению>=");// готово
			Button btn6 = new Button("показать БД"); 
			
			// для редактирования и удаления
			MultipleSelectionModel<String> langsSelectionModel = langsListView.getSelectionModel();
	        langsSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>(){     
	            public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue){ 
	            	newValue1    = newValue;
	        
	                
	              
	            }
	        });
	        // для поиска по значению
	        MultipleSelectionModel<Double> langsSelectionModel2 = langsListView2.getSelectionModel();
	        langsSelectionModel2.selectedItemProperty().addListener(new ChangeListener<Double>(){     
	            public void changed(ObservableValue<? extends Double> changed, Double oldValue, Double newValue){
	            	newValue2    = newValue;
	     
	            }
	        });
			
			//добавления віражения и расчет
			 EventHandler<ActionEvent> eventHandler1 = new EventHandler<ActionEvent>() { 
		         	@Override 
		  		   public void handle(ActionEvent e) { 
		         		Connection connection;
						try {
							connection = MysqlConnect.getMySQLConnection();
			    			Statement statement = connection.createStatement();
			    			if(ProverkaZnakov.Main(txt.getText()))
			    			{
			    				if(ProverkaSkobok.Main(txt.getText()))
			    				{
			    			
			    			String sql_query =  "INSERT INTO результаты (`выражение`,`результат`) VALUES('"+txt.getText()+"' , "+RashetVirazenia.Main(txt.getText())+" )"; //вписать выражение и значение выражения
			    			boolean rows = statement.execute(sql_query);
			    			System.out.println(txt.getText());
			    			connection.close();
			    				}
			    			}
						} catch (ClassNotFoundException | SQLException e1) {			
							e1.printStackTrace();
						}
						
		  		   }       	
		         };   
		         btn3.setOnAction(eventHandler1);
		         
		         //удаление віражения из БД
		         EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() { 
			         	@Override 
			  		   public void handle(ActionEvent e) { 
			         		
			         		Connection connection;
							try {
								connection = MysqlConnect.getMySQLConnection();
				    			Statement statement = connection.createStatement();
				    			String sql_query =  "DELETE FROM результаты WHERE выражение = '"+newValue1+"'"; //как-то получить выражение
				    			boolean rows = statement.execute(sql_query);
				    			connection.close();       						
							} catch (ClassNotFoundException | SQLException e1) {			
								System.out.println("ошибка");
							}
			  		   }       	
			         };   
			         btn2.setOnAction(eventHandler2);
			         
			         //показать БД готово
			         EventHandler<ActionEvent> eventHandler3 = new EventHandler<ActionEvent>() { 
				         	@Override 
				  		   public void handle(ActionEvent e) { 
				         		//System.out.println(langs.size());
				         		
				         		while(langs.size()>=1)
				         		{
				         			
				         			langs.remove(0);
				         			langs2.remove(0);
				         		};
				         		
				         		
				         		
				         		Connection connection;
				         		try {
				         		connection = MysqlConnect.getMySQLConnection();
				         		Statement statement = connection.createStatement();
				         		String sql_query72 =  "Select * FROM результаты";
				    			ResultSet resultSet = statement.executeQuery(sql_query72);
	
				    			while (resultSet.next()) {
				    				langs.add(resultSet.getString("выражение"));
				    				langs2.add(resultSet.getDouble("результат"));
				    				
				    				
				    			
				            }
				         		} catch (ClassNotFoundException | SQLException e1) {			
									e1.printStackTrace();
								}
				         	 
				  		   }    
				    			
				         };   
				         btn6.setOnAction(eventHandler3);
				         
				         //редактирование выражения
				         EventHandler<ActionEvent> eventHandler4 = new EventHandler<ActionEvent>() { 
					         	@Override 
					  		   public void handle(ActionEvent e) { 
					         		Connection connection;
									try {
										connection = MysqlConnect.getMySQLConnection();
						    			Statement statement = connection.createStatement();
						    			if(ProverkaZnakov.Main(txt.getText()))
						    			{
						    				if(ProverkaSkobok.Main(txt.getText()))
						    				{
						    			
						    					String sql_query72 =  "Update результаты  Set выражение = '"+txt.getText()+"', результат = "+RashetVirazenia.Main(txt.getText())+" Where выражение = '"+newValue1+"'";
						    			boolean rows = statement.execute(sql_query72);
						    			System.out.println(txt.getText());
						    			connection.close();
						    				}
						    			}
									} catch (ClassNotFoundException | SQLException e1) {			
										e1.printStackTrace();
									}
									
					         		
					         		
					  		   }       	
					         };   
					         btn4.setOnAction(eventHandler4);
					         
					         //>= запрос
					         EventHandler<ActionEvent> eventHandler5 = new EventHandler<ActionEvent>() { 
						         	@Override 
						  		   public void handle(ActionEvent e) { 
						         		
						         		Double buf = newValue2;
						         		System.out.println(newValue2);
						         		while(langs.size()>=1)
						         		{
						         			
						         			langs.remove(0);
						         			langs2.remove(0);
						         		};
						         		
						         		Connection connection;
										try {
											connection = MysqlConnect.getMySQLConnection();
							    			Statement statement = connection.createStatement();
							    			String sql_query =  "Select выражение, результат FROM результаты WHERE результат >="+buf+""; //как-то получить выражение
							    			ResultSet resultSet = statement.executeQuery(sql_query);
							    			while (resultSet.next()) {
							    				langs.add(resultSet.getString("выражение"));
							    				langs2.add(resultSet.getDouble("результат"));
							    				
							    				
							    			
							            }
							    			connection.close();       						
										} catch (ClassNotFoundException | SQLException e1) {			
											System.out.println("ошибка");
										}
						  		   }       	
						         };   
			
						         btn5.setOnAction(eventHandler5);
			
			
			
			
			
			
			
			 
			HBox ButtonPane = new HBox(btn2,btn3,btn4,btn5,btn6);
			HBox hbox2 =new HBox(langsListView,langsListView2);
			VBox MainBox = new VBox(ButtonPane, txt, hbox2);
			
			Scene scene = new Scene(MainBox,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
