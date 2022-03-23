package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 int c= 5;
			Button button1 = new Button("create table");
			Button button2 = new Button("show table");
			Button button3 = new Button("delete table");
			//Button button4 = new Button("show table");
			Button button4 = new Button("create column");
			Button button5 = new Button("delete column");
			Button button6 = new Button("create field");
			Button button7 = new Button("delete field");
			
			TextField text1 = new TextField("table name");
			TextField text2 = new TextField("table name");
			TextField text3 = new TextField("table name");
			//TextField text4 = new TextField("table name");
			TextField text4 = new TextField("column name");
			TextField text5 = new TextField("column name");
			TextField text6 = new TextField("field name");
			TextField text7 = new TextField("field name");
			
			
			GridPane root = new GridPane();
			//root.add(new Label(""+c+""), 2, 2);
			root.add(button1, 0, 0);
			root.add(button2, 1, 0);
			root.add(button3, 2, 0);
			//root.add(button4, 3, 0);
			root.add(button4, 4, 0);
			root.add(button5, 5, 0);
			root.add(button6, 6, 0);
			root.add(button7, 7, 0);
			
			root.add(text1, 0, 1);
			root.add(text2, 1, 1);
			root.add(text3, 2, 1);
			//root.add(text4, 3, 1);
			root.add(text4, 4, 1);
			root.add(text5, 5, 1);
			root.add(text6, 6, 1);
			root.add(text7, 7, 1);
			
			  root.setGridLinesVisible(true); // делаем видимой сетку строк и столбцов
			  
			  //евент хендлеры
			  EventHandler<ActionEvent> CreateTable = new EventHandler<ActionEvent>() { 
		         	@Override 
		  		   public void handle(ActionEvent e) { 
		         		String name1 = text1.getText();
		         		//sqlquery.CreateTable(name1);
		  		   } 	
		         };
		         button1.setOnAction(CreateTable);
		         
		         EventHandler<ActionEvent> DeleteTable = new EventHandler<ActionEvent>() { 
			         	@Override 
			  		   public void handle(ActionEvent e) { 
			         		String name3 = text3.getText();	 
			         		//sqlquery.DeleteTable(name3);
			  		   } 	
			         };
			         button2.setOnAction(DeleteTable);
			         
			         EventHandler<ActionEvent> AddColumn = new EventHandler<ActionEvent>() { 
				         	@Override 
				  		   public void handle(ActionEvent e) { 
				         		String name4 = text4.getText();	 
				         		//sqlquery.AddColumn(name4);
				  		   } 	
				         };
				         button3.setOnAction(AddColumn);
				         
				         EventHandler<ActionEvent> DeleteColumn = new EventHandler<ActionEvent>() { 
					         	@Override 
					  		   public void handle(ActionEvent e) { 
					         		String name5 = text5.getText();	 
					         		//sqlquery.DeleteColumn(name5);
					  		   } 	
					         };
					         button4.setOnAction(DeleteColumn);
					         
					         EventHandler<ActionEvent> AddField = new EventHandler<ActionEvent>() { 
						         	@Override 
						  		   public void handle(ActionEvent e) { 
						         		String name6 = text6.getText();	 
						         		//sqlquery.AddField(name6);
						  		   } 	
						         };
						         button5.setOnAction(AddField);
						         
						         EventHandler<ActionEvent> DeleteField = new EventHandler<ActionEvent>() { 
							         	@Override 
							  		   public void handle(ActionEvent e) { 
							         		String name7 = text7.getText();	 
							         		//sqlquery.DeleteField(name7);	 
							  		   } 	
							         };
							         button6.setOnAction(DeleteField);
							         
							         EventHandler<ActionEvent> ShowTable = new EventHandler<ActionEvent>() { 
								         	@Override 
								  		   public void handle(ActionEvent e) { 
								         		String name2 = text2.getText();	 
								         		//sqlquery.ShowTable(name2);
								  		   } 	
								         };
								         button7.setOnAction(ShowTable);
								         
			  
			  
			
			
			

			Scene scene = new Scene(root,800,800);
		
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
