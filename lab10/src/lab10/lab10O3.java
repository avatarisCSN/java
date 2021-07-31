package lab10;
import java.io.*;
public class lab10O3 {
	 public static void main(String[] args)
	    {
	        ByteArrayOutputStream bos;
	        bos = new ByteArrayOutputStream();
	        String text = "Hello World!";
	        byte[] buffer = text.getBytes();
	        try{
	            bos.write(buffer);
	        } catch(Exception e) {
	            System.out.println(e.getMessage());
	        }
	        // �������������� ������� ������ � ������
	        System.out.println(bos.toString());
	         
	        // ����� � ������� �� ���������
	        byte[] array = bos.toByteArray();
	        for (byte b: array) {
	            System.out.print((char)b);
	        }
	        System.out.println();
	    }
}
