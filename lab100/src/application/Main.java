package application;
	
import javafx.application.Application;

import javafx.scene.*; 
 import javafx.stage.*;
 import javafx.scene.layout.*;
 import javafx.scene.control.*;
 import javafx.event.*; 
import javafx.geometry.*; 
public class Main extends Application { 
Label response;

 
 
 


public void start(Stage myStage) {

 myStage.setTitle("Use JavaFX Buttons and Events."); 

FlowPane rootNode =  new FlowPane(10, 10); 
rootNode.setAlignment(Pos.CENTER); 
Scene myScene =  new Scene(rootNode, 300, 100); 
myStage.setScene(myScene); 

response =  new Label("Push а  Button"); 

Button btnUp =  new Button("Up"); 
 Button btnDown =  new Button("Down"); 

btnUp.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent е) { 
response.setText("You pressed Up.");
 }
 }) ;
 //  Обработать события действий для кнопки Down
 btnDown.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent ае) {
response.setText("You pressed Down.");
 }
 } ) ; 
//  Добавить метку и  кнопки в  граф сцены 
rootNode.getChildren() .addAll(btnUp, btnDown, response); 
//  Отобразить платформу и  ее  сцену
 myStage.show();
}

 
 public static void main(String[] args) { 

	 launch(args); 
	  }
}
 
	  
