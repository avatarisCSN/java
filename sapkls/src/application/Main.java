package application;
	


import java.util.StringTokenizer;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
  
public class Main extends Application{
	static int o=1;
	int k;
	
     
    public static void main(String[] args) {
          
        Application.launch(args);
    }
      
    @Override
    public void start(Stage stage) throws Exception {
          
        TextField textField = new TextField();
         
        ObservableList<String> langs = FXCollections.observableArrayList();
        ListView<String> langsListView = new ListView<String>(langs);
        langsListView.setPrefSize(250, 150);
        
         
        Button addBtn = new Button("Add");
        Button deleteBtn = new Button("Delete");
        Button btn = new Button("gaussa");
        Button btn2 = new Button("kramera");
        
        Button enterNumVaR = new Button("enter num of Var");
        Text variablesTxt = new Text("number of var");
        Text StringTxt = new Text("Enter");
        FlowPane buttonPane = new FlowPane(10, 10, textField, addBtn, deleteBtn, btn, btn2, enterNumVaR , variablesTxt, StringTxt);
        buttonPane.setPrefSize(450, 50);
         
        addBtn.setOnAction(event -> langs.add(textField.getText()));
        deleteBtn.setOnAction(event -> langs.remove(textField.getText()));
        
     // получаем модель выбора элементов
        MultipleSelectionModel<String> langsSelectionModel = langsListView.getSelectionModel();
        langsSelectionModel.setSelectionMode(SelectionMode.MULTIPLE);
         
        // устанавливаем слушатель для отслеживания изменений
        langsSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>(){
             
            public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue){
                 
                String selectedItems = "";
                ObservableList<String> selected = langsSelectionModel.getSelectedItems();
                
                for (String item : selected){
                    selectedItems += item + " ";
                }
                StringTxt.setText(selectedItems);
            }
        });
        
    
        EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() { 
         	@Override 
  		   public void handle(ActionEvent e) { 
         		String f = textField.getText();
  			   int d = Integer.parseInt(textField.getText());
  			   
  			 
  			 
  			 variablesTxt.setText(f);
  			  
  		                   
  		   } 
         	
         };
        
        
         enterNumVaR.setOnAction(eventHandler2);
         
        
        EventHandler<ActionEvent> eventHandler = 
        		   new EventHandler<ActionEvent>() { 
        		   
        		   @Override 
        		   public void handle(ActionEvent e) { 
        			   String str = StringTxt.getText();
        			  int x = Integer.parseInt(variablesTxt.getText());
        			
        			    int[][] mass = proces.TxtToInt(str, x);
        			    double[] result = proces.methodGaussa(mass, x);
        			    for (int i =0; i<x; i++ )
        			    {
        			    langs.add(Double.toString(result[i]));
        			    }
        			    
        			    
        			    
        			   
        		                   
        		   } 
        		};    
        
            btn.setOnAction(eventHandler);
            
            EventHandler<ActionEvent> eventHandler3 = 
         		   new EventHandler<ActionEvent>() { 
         		   
         		   @Override 
         		   public void handle(ActionEvent e) { 
         			   String str = StringTxt.getText();
         			  int x = Integer.parseInt(variablesTxt.getText());
         			
         			    int[][] mass = proces.TxtToInt(str, x);
         			    double[] result = proces.methodKramera(mass, x);
         			   for (int i =0; i<x; i++ )
       			    {
       			    langs.add(Double.toString(result[i]));
       			    }
         			    
         			    
         			   
         		                   
         		   } 
         		};    
         
             btn2.setOnAction(eventHandler3);
            
           
        	
        
        
         
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, buttonPane, langsListView);
         
        Scene scene = new Scene(root, 500, 350);
          
        stage.setScene(scene);
        stage.setTitle("ListView in JavaFX");
        stage.show();
        
      
    }
}