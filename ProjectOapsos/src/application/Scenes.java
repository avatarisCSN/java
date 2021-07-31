package application;

import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Scenes  {
	
	static Button btn21= new Button("������ �������");
	static	Button btn22= new Button("������ ����������");
	static	Button btn23= new Button("������� �� ���������");
	
	
	
	
		    
	static Button btn31= new Button("������ �������");
	static Button btn32= new Button("������ ����������");
	static Button btn33= new Button("������� �� ���������");
	static HBox menu3 = new HBox(btn31, btn32, btn33);
	
	 static GridPane gridpane = new GridPane( );
	static ColumnConstraints column = new ColumnConstraints(100);
	static  Text txt = new Text("������ 0 � ������� ���� � ����� ���������. ������� �������� ����� � �������, � �������� ������ �������� ��������. ������� ���������� ������������ ������� ���������� � ��������� ����������. ��� ������ ���� 0, ��� ������ ��������� �������� �����, �� ������ ��������� ���������� ������������� ��������, �.�. �� ���������� ��������� �� ���� ����������� ���������� �� ������� ���������� �����, ��� �� �������� ��������, ��� ������ � ��������.\r\n" + 
	  		"������ 1 � ������� ���������������\r\n" + 
	  		"������� 1. ��������� ����������, �������� � ���������� �������������� ���������, ������������, ��� ���� ���������� ������������ ������� ���������, �������, � ����� ���������.  ��� ���������� ���� ������ ����� (���� ������): ������������ �����������, �����������. ��� ���������� ���� ������ �����: ���������, �������������.\r\n" + 
	  		"������� 2.������ �����������������, ��������� �������������� ��������� � ��������������� �����, ������ �������������� ���� ������ ��� ��������� ��������������.\r\n" + 
	  		"������� 3. ������� ������������ � �������� ���������� � ����������������� ������������ ������ �� ���������� ����, ������������� � �������������� � ����, ������� � ���������� ���������� � ����������. ��� ���������� ���� (������ ���� �����): ������������� �������� ������� �� �����, ����. ��� ���������� ����� � ������� ���� �����, ���������� ������������, �������� �����������, ���������, ���������, �������� �� ���������� �����.\r\n" + 
	  		"������� �1.  ������������ ����� ������������� ���������, ����������� ���������� � ���������� ��������������� � ���������� ��� �� ������� �������� � ��� ��������� ������������.\r\n" + 
	  		"������ 2 � ������� ��������������, ����������\r\n" + 
	  		"������� 4. ������������� ��������������, ����������� � �������������� ������ ����, � ������ �������������� ��������. ���� �����, ������� ������������ ������� �������. ���� 4 ������ ����� � ���������� �������� �� ����������� ������������� ��������, ������ ����������, ����������� ��������, ��������� ����������� ����������� ��������. ��� ���������� ���� ������ ����� � ����������� ��������������, �������������.\r\n" + 
	  		"������� 5. ������������ ������� ��������� ��������� ����� ������������ � ������, �������� �������� ��������� �������������. ������������ ���������� ����������� ���� ����������� ����������������� ���������������� � ��������� ����������, ����������� � ����������. ���� ������ ����� 5: ���������� ����� ����������, ������������� ���, �������� ��������� ��������������, ������������ � ����������� ������. ��� ���������� ���� ������ �����: �������������, �������, ���������� ����� ���������� ��� ����������� ����������, ���������� ����� ����.\r\n" + 
	  		"������� 6. ���������� ����������� � �������������� ������������, ��������������� ���������� ��������� ��������� ���������, ���������� ��������� � ���������� ����������� ������ �������������, ������� ������������ �������� ��������� � ������. \r\n" + 
	  		"��� ���������� ���� ������ ����� 6 � ������� ����� ������ ���� �������� � ����������, ������������� � ������������� � ������������ ��������. ��� ���������� ���� ������ ����� -  ������� ���������� �����������, �� � �������� �����������, ��������.\r\n" + 
	  		"������� �2. ������������ �������������� ������� �������������� � ���������� ���������������� �������� � ���������, ���������������� ����������� ����  �� ������ ������������� ���������� ��� ��������, ���������� �� ������ ������ ����� �����.\r\n" + 
	  		"������ 3. ���������� . ���������������� ����������.\r\n" + 
	  		"�������7. ���������� ���������� �������������� �������� ��� ����������� � ������� ����������� ��������, ���������� ������� �������� ��������� ���� ���������� ��������, ������������ ������������� ��� ��������������.\r\n" + 
	  		"	���� ����� ����� 7: ���������� ��������, ������������ ���������, �������������� � �������������. ��� ���������� ���� ����� ����� � ��������� ������������� ����������� ������������ ���� � ��������� ���������� ������� � ����� ��������� ��������, �� ����� ������������ ����� ����������� ������ ��������.\r\n" + 
	  		"������� 8. ����������� �������� ��������� ���� ��������, ��� ������������� ������� �������������� ���������� �������. ������� �������� ������ ��������, ���������� ������������, ���������������, �������� ����������� ���������� ����������� ��������, ������� ���������� ��������, �����������.\r\n" + 
	  		"���� ������ ����� 8,�� ���������� ������� ������, ��������������� � ������� ���������� ��������. ��� ���������� ���� ������ �����: �������������, ������������, ��������, ���������.\r\n" + 
	  		"������� 9. ����������� ������������ ����������� ���� � ������������ �����, ������� ��������� ������������� ����������� ������, ��������� ���� ����������, ���������� ����������� �����, ��������, ������� �����.\r\n" + 
	  		"��� ���������� ���� ������ ����� (1-� �������): ������ ���������� ������ � ���������� ����, �����������, � �������� � ��������� ����������� �������������, ��������� ���������, ����������, �������.\r\n" + 
	  		"������� �3 � ������������ �������������� ���������� ��������� ���������� �������� �������� � ��������� �� ������� �����.\r\n" + 
	  		"������ 4. ���������� ������� � ������ ������.\r\n" + 
	  		"������� 10. ����������� ������ ���� ����� ���������, ��������� � ������ ������������ ������ ������� ��������� �������. ��������� ������������� ��� ����� ����� ������������ ���� ��������  � ����������� ���������� ������ ����� ������������� ����� � ���������� ��������� ����� ���������� ������������ ��������. ���� ������ ����� 10, �� ������������� � ������������ ������������, � �������� � �������� ��������� ������, ������������ ������� ������������.\r\n" + 
	  		"������� 11. �����������  � ���������� ���������� ���� � ��������� ���������� � ������, � ��������� �������� ����� ��� ������������������. ����������� � ����������� ���������� ��������, ����������� � ����������� ������� �������.  ���� ������ ����� 11, �� ������������� � �������� ����������� ������������ � ��������������� �������. � �������� � ���������� ��������������.\r\n" + 
	  		"������� 12. ������� ������������� ��������� � ��������� �������� �� ����������� �����  ��� ����������� ������� ����� ����������������� ���������, ��� �������������� �� ����� ������ ������������� �������. \r\n" + 
	  		"���� ������ ����� 12, �� ������������� � ������������������ ������������ ������������ � ������� �������� ���� ������������� ��� ��� ���� �������, � �������� � ������������������� � ������ �������������,  �������� �������, �� �������� � ����� ���������.\r\n" + 
	  		"������� �4. ������������ �������������� ����������� �������� �� ���������� ��������� ���������� �������� ��������� ������� � ����� ����������� � ���������������� � ��������� �����, � ������� ���������� ���������� ���� ������ � ��������������, ����������, ����������, �� � ������ ���������� ����������� ������� � �� ���� � ����������.\r\n" + 
	  		"");
   
}



  
	 
	  
	  
	  

