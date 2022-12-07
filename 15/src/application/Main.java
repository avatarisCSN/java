package application;
	
import java.util.ArrayList;

import application.KTimer;
import application.proverka;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	int empty=8;
	@Override
	public void start(Stage primaryStage) {
		try {
		     ArrayList<Label> butons = new ArrayList<Label>();
		     

		
			Label lbl00 = new Label("1");
			 lbl00.setStyle("-fx-background-color: #8DFC6C;");
			lbl00.setPrefWidth(99);
			lbl00.setPrefHeight(99);
			lbl00.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl10 = new Label("2");
			 lbl10.setStyle("-fx-background-color: #8DFC6C;");
			lbl10.setPrefWidth(99);
			lbl10.setPrefHeight(99);
			lbl10.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl20 = new Label("3");
			 lbl20.setStyle("-fx-background-color: #8DFC6C;");
			lbl20.setPrefWidth(99);
			lbl20.setPrefHeight(99);
			lbl20.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			
			Label lbl01 = new Label("4");
			 lbl01.setStyle("-fx-background-color: #8DFC6C;");
			lbl01.setPrefWidth(99);
			lbl01.setPrefHeight(99);
			lbl01.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl11 = new Label("5");
			 lbl11.setStyle("-fx-background-color: #8DFC6C;");
			lbl11.setPrefWidth(99);
			lbl11.setPrefHeight(99);
			lbl11.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl21 = new Label("6");
			 lbl21.setStyle("-fx-background-color: #8DFC6C;");
			lbl21.setPrefWidth(99);
			lbl21.setPrefHeight(99);
			lbl21.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl02 = new Label("7");
			 lbl02.setStyle("-fx-background-color: #8DFC6C;");
			lbl02.setPrefWidth(99);
			lbl02.setPrefHeight(99);
			lbl02.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl12 = new Label("8");
			 lbl12.setStyle("-fx-background-color: #8DFC6C;");
			lbl12.setPrefWidth(99);
			lbl12.setPrefHeight(99);
			lbl12.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			
			Label lbl22 = new Label("");
			 lbl22.setStyle("-fx-background-color: #5AF9F2;");
			lbl22.setPrefWidth(99);
			lbl22.setPrefHeight(99);
			lbl22.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
			butons.add(lbl00);
			butons.add(lbl10);
			butons.add(lbl20);
			butons.add(lbl01);
			butons.add(lbl11);
			butons.add(lbl21);
			butons.add(lbl02);
			butons.add(lbl12);
			butons.add(lbl22);
			Text player = new Text("player");
			Button start = new Button("start");
			TextField field = new TextField();
			
			   KTimer ktimer;
			    Label timeLabel;
			    
			    //Clock
			    ktimer = new KTimer();
			    timeLabel = new Label(ktimer.getSspTime().get());
			    
			    ktimer.getSspTime().addListener(new InvalidationListener() {

			        @Override
			        public void invalidated(Observable observable) {
			        	Platform.runLater(()-> timeLabel.setText(ktimer.getSspTime().get()));   
			        }
			    });
			       
			    
				
			
			
		      
			GridPane root = new GridPane();
			FlowPane main = new FlowPane(10, 10, root, player, start, timeLabel);
			root.getColumnConstraints().add(new ColumnConstraints(100)); // столбец с шириной от 0 до 100
			root.getColumnConstraints().add(new ColumnConstraints(100)); // столбец с шириной от 0 до 100
			root.getColumnConstraints().add(new ColumnConstraints(100)); // столбец с шириной от 0 до 100
			
			 root.getRowConstraints().add(new RowConstraints(100));
			 root.getRowConstraints().add(new RowConstraints(100));
			 root.getRowConstraints().add(new RowConstraints(100));
		
			root.setGridLinesVisible(true);
			
			root.add(butons.get(0), 0, 0);
			root.add(butons.get(1), 1, 0);
			root.add(butons.get(2), 2, 0);
			
			root.add(butons.get(3), 0, 1);
			root.add(butons.get(4), 1, 1);
			root.add(butons.get(5), 2, 1);
			
			root.add(butons.get(6), 0, 2);
			root.add(butons.get(7), 1, 2);
			root.add(butons.get(8), 2, 2);
			
			  start.setOnAction(new EventHandler<ActionEvent>() {
	              
		            @Override
		            public void handle(ActionEvent event) {
		            	ktimer.startTimer(ktimer.getTime()); 
		            
		            	int[] random=proverka.randomizer();
		            	for(int i=0;i<9;i++) {
		            		if(random[i]!=9)
		            		{
		            			butons.get(i).setText(String.valueOf(random[i]));
		            			butons.get(i).setStyle("-fx-background-color: #8DFC6C;");
		            		}
		            		else
		            		{
		            			butons.get(i).setText("");
		            			butons.get(i).setStyle("-fx-background-color: #5AF9F2;");
		            			empty=i;
		            			
		            		}
		            	}
		            	
		            }
		        });
			
			 EventHandler<MouseEvent> gridHandler = new EventHandler<MouseEvent>() { 
		         	@Override 
		  		   public void handle(MouseEvent me) { 
		         		double x=me.getX();
			         	double y=me.getY();	
			         	//приходит инфа допустим нажатие на зеленую и рядом есть голубая  тогда меняем местами елементы
			         	
			         	int click=proverka.clickPos(x, y);
			                  	System.out.println(click+"click"+empty+"empty");//+
			         	if(empty+1==click || empty-1==click || empty+3==click || empty-3==click)
			         	{
			         		String buf=butons.get(empty).getText();
			         		butons.get(empty).setText(butons.get(click).getText());
			         		butons.get(click).setText(buf);
			         		butons.get(empty).setStyle("-fx-background-color: #8DFC6C;");
			         		butons.get(click).setStyle("-fx-background-color: #5AF9F2;");
			         		
						empty=click;
					 	        System.out.println(empty+"empty");//+
			         	}
			         	for (int i=0;i<8;i++)
			         	{
			         		String c= butons.get(i).getText();
			         		String d= String.valueOf(i+1);
			         		    //System.out.println(c);
			         		    //System.out.println(d);
			         		if( c.equals(d)==false)
			         		{
			         		
			         			break;
			         		}
			         		if(i==7)
			         		{
			         			 ktimer.stopTimer(0);
			         			Label secondLabel = new Label("You are victorious"); 
				                 StackPane root2 = new StackPane(secondLabel);
				        		 Scene secondScene = new Scene(root2,150,50);
				        		 Stage newWindow = new Stage();
				        		 newWindow.setTitle("Second Stage");
				        		 newWindow.setScene(secondScene);

				        		 newWindow.show();
			         		}
			         		
			         	}
			         	
		         	}};
		
			         root.setOnMouseClicked(gridHandler);
			         
		         	
			
			Scene scene = new Scene(main,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("hello");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
