package application;
import java.io.*;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

 class AppUsController {

     private static final String isnull = null;
	public int nArr = 0;

     public AppUsController()

	 {
    	 nArr = 0;
	 }

	 public void PutBuff()
	    {

        if (nArr < 10 ) {
        	
        
         Main.AppUsObj1[nArr].Param1=  Main.textField1.getText();
           if (Main.AppUsObj1[nArr].Param1.equals(" ")  ) 
           {
       	        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Поле пустое. Заполните его ");
                   alert.setHeaderText(null);
                  // alert.setContentText(res.toString());
                  alert.showAndWait();
        	   
           } else 
		 Main.AppUsObj1[nArr].Param2=  Main.textField2.getText();
		 Main.AppUsObj1[nArr].Param3=  Main.textField3.getText();
		 Main.AppUsObj1[nArr].Param4=  Main.textField4.getText();
		 Main.AppUsObj1[nArr].Param5=  Main.textField5.getText();
		 
		 
		 
		 nArr++;
        }


		 Main.textField1.setText(" ");
		 Main.textField2.setText(" ");
		 Main.textField3.setText(" ");
		 Main.textField4.setText(" ");
		 Main.textField5.setText(" ");

	    }

	  public void PutUsFile() throws IOException

			    {

		  System.out.println("OK " );
	        try
	        {

		  
		  PrintWriter out = new PrintWriter(new FileWriter("UsObjApp.dat"));
              writeData(Main.AppUsObj1, out);
              out.close();
         
             
	        }
            catch(IOException exception)
            {
                exception.printStackTrace();
            }

              
			    }


	  public void ReadFile() 
			 throws IOException

	    {

 
	        try
	        {
		 
		 BufferedReader in = new BufferedReader(new FileReader("UsObjApp.dat"));
		  AppUsObj AppUsObj2[]=readData(in);
          in.close();
          ObservableList<String> ObjUsList = FXCollections.observableArrayList("   ");

          for(int i=0;i<AppUsObj2.length;i++)
          {

        	  AppUsObj2[i].printList();
        	  System.out.println(AppUsObj2[i].StrParams );
        	  ObjUsList.add(AppUsObj2[i].StrParams);
        	 System.out.println(AppUsObj2[i].StrParams );
        	 //Main.ObjUsListView.setItems(ObjUsList);
          }
            	 Main.ObjUsListView.setItems(ObjUsList);
    
        }
      catch(IOException exception)
      {
          exception.printStackTrace();

      }

	    
	    }

	  public void FindFile(String sKey) throws IOException

	    {
             int ind = 0;
             boolean bl=false;

		  //System.out.println("OK " );
		  BufferedReader in = new BufferedReader(new FileReader("UsObjApp.dat"));
		  AppUsObj AppUsObj2[]=readData(in);
        in.close();
        ObservableList<String> ObjUsList = FXCollections.observableArrayList("   ");


        for(int i=0;i<AppUsObj2.length;i++)
        {

      	 // AppUsObj2[i].printList();

       // 	b=s1.equals(s2);

        //	if ( AppUsObj2[i].Param1 == sKey ) ind = 1;
   	   // 	  else
   	   // 	 if (AppUsObj2[i].Param2 == sKey ) ind = 1;
   	   // 	 else
   	   // 		if (AppUsObj2[i].Param3 == sKey ) ind = 1;
      //	    	 else
      //	    		if (AppUsObj2[i].Param4 == sKey ) ind = 1;
      //	   	    	 else
     // 	   	    	if (AppUsObj2[i].Param5 == sKey ) ind = 1;

        	if ( AppUsObj2[i].Param1.equals(sKey ) ) {ind = 1;  } 
        	
 	    	  else
 	    	 if (AppUsObj2[i].Param2.equals(sKey)  ) ind = 1;
 	    	 else
 	    		if (AppUsObj2[i].Param3.equals(sKey)  ) ind = 1;
    	    	 else
    	    		if (AppUsObj2[i].Param4.equals(sKey)  ) ind = 1;
    	   	    	 else
    	   	    	if (AppUsObj2[i].Param5.equals(sKey)  ) ind = 1;



   	       if (  ind == 1 )

   	       
   	       {
   	    	   AppUsObj2[i].printList();
   	    	   ObjUsList.add(AppUsObj2[i].StrParams);
      	 Main.ObjUsListView.setItems(ObjUsList);
      	 break;

   	       };


        }
    }

	  
	  
	  public void FindFile2(String sKey) throws IOException

	    {
           int ind = 0;
           boolean bl=false;

		  //System.out.println("OK " );
		  BufferedReader in = new BufferedReader(new FileReader("UsObjApp.dat"));
		  AppUsObj AppUsObj2[]=readData(in);
      in.close();
      ObservableList<String> ObjUsList = FXCollections.observableArrayList("   ");


      for(int i=0;i<AppUsObj2.length;i++)
      {

  

      	if ( AppUsObj2[i].Param1.equals(sKey ) ) ind = 1;
  	

 	       if (  ind == 1 )

 	       {
 	    	   AppUsObj2[i].printList();
 	    	   ObjUsList.add(AppUsObj2[i].Param1 + AppUsObj2[i].StrParams);
    	 Main.ObjUsListView.setItems(ObjUsList);
    	 break;

 	       };


      }
  }

	  public void writeData(AppUsObj UOb[], PrintWriter out)
		        throws IOException
		        {

		      out.println(UOb.length);
		            for(int i=0;i<UOb.length;i++)
		            	UOb[i].writeData(out);
		        }

	  public AppUsObj [] readData(BufferedReader in)
		        throws IOException
		        {
		            int n=Integer.parseInt(in.readLine());
		            AppUsObj UOb[]=new AppUsObj [n];
		            for(int i=0;i<n;i++)
		            {
		            	UOb[i]=new AppUsObj();
		            	UOb[i].readData(in);
		            }
		            System.out.println("OK6 " );
		            return UOb;
		        }

}
