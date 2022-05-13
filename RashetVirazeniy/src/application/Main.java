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
         		
         		String sql_query2 =  "CREATE TABLE ���������� (id INT NOT NULL, ��������� VARCHAR(45) NULL, ��������� DOUBLE NULL)" ;
         		boolean rows2 = statement.execute(sql_query2);
         		} catch (ClassNotFoundException | SQLException e1) {			
    				System.out.println("������ �������� �������");
    			}
	        
	       
	        
	        // ��� �������� � ���������� � ��
	        TextField txt = new TextField("���� �����");
	        
			Button btn7 = new Button("������� ��"); // ���
			Button btn8 = new Button("������� ��");// ���
			Button btn2 = new Button("������� ��������� �� ��");
			Button btn3 = new Button("���������� � �������� � �� ���������");
			Button btn4 = new Button("������������� ���������");// ������
			Button btn5 = new Button("����� �� ��������>=");// ������
			Button btn6 = new Button("�������� ��"); 
			
			// ��� �������������� � ��������
			MultipleSelectionModel<String> langsSelectionModel = langsListView.getSelectionModel();
	        langsSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>(){     
	            public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue){ 
	            	newValue1    = newValue;
	        
	                
	              
	            }
	        });
	        // ��� ������ �� ��������
	        MultipleSelectionModel<Double> langsSelectionModel2 = langsListView2.getSelectionModel();
	        langsSelectionModel2.selectedItemProperty().addListener(new ChangeListener<Double>(){     
	            public void changed(ObservableValue<? extends Double> changed, Double oldValue, Double newValue){
	            	newValue2    = newValue;
	     
	            }
	        });
			
			//���������� �������� � ������
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
			    			
			    			String sql_query =  "INSERT INTO ���������� (`���������`,`���������`) VALUES('"+txt.getText()+"' , "+RashetVirazenia.Main(txt.getText())+" )"; //������� ��������� � �������� ���������
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
		         
		         //�������� �������� �� ��
		         EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() { 
			         	@Override 
			  		   public void handle(ActionEvent e) { 
			         		
			         		Connection connection;
							try {
								connection = MysqlConnect.getMySQLConnection();
				    			Statement statement = connection.createStatement();
				    			String sql_query =  "DELETE FROM ���������� WHERE ��������� = '"+newValue1+"'"; //���-�� �������� ���������
				    			boolean rows = statement.execute(sql_query);
				    			connection.close();       						
							} catch (ClassNotFoundException | SQLException e1) {			
								System.out.println("������");
							}
			  		   }       	
			         };   
			         btn2.setOnAction(eventHandler2);
			         
			         //�������� �� ������
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
				         		String sql_query72 =  "Select * FROM ����������";
				    			ResultSet resultSet = statement.executeQuery(sql_query72);
	
				    			while (resultSet.next()) {
				    				langs.add(resultSet.getString("���������"));
				    				langs2.add(resultSet.getDouble("���������"));
				    				
				    				
				    			
				            }
				         		} catch (ClassNotFoundException | SQLException e1) {			
									e1.printStackTrace();
								}
				         	 
				  		   }    
				    			
				         };   
				         btn6.setOnAction(eventHandler3);
				         
				         //�������������� ���������
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
						    			
						    					String sql_query72 =  "Update ����������  Set ��������� = '"+txt.getText()+"', ��������� = "+RashetVirazenia.Main(txt.getText())+" Where ��������� = '"+newValue1+"'";
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
					         
					         //>= ������
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
							    			String sql_query =  "Select ���������, ��������� FROM ���������� WHERE ��������� >="+buf+""; //���-�� �������� ���������
							    			ResultSet resultSet = statement.executeQuery(sql_query);
							    			while (resultSet.next()) {
							    				langs.add(resultSet.getString("���������"));
							    				langs2.add(resultSet.getDouble("���������"));
							    				
							    				
							    			
							            }
							    			connection.close();       						
										} catch (ClassNotFoundException | SQLException e1) {			
											System.out.println("������");
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
