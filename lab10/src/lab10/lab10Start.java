
package lab10;
import java.io.*;

public class lab10Start {
	
	public static void main(String[] args) {
        
        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("C://TEXT//notes.txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
              
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
        
        
        
       
}
}
