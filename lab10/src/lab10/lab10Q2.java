package lab10;
import java.io.*;
public class lab10Q2 {
	public static void main(String[] args) throws Exception
	{
		 //������� �����-������-����-��-�����
	   	 FileInputStream inputStream = new FileInputStream("C://TEXT//notes.txt");
	   	 // ������� �����-������-����-�-����
	   	 FileOutputStream outputStream = new FileOutputStream("C://TEXT//result.txt");

	   	 while (inputStream.available() > 0) //���� ���� ��� ������������� �����
	   	 {
	   	  int data = inputStream.read(); // ��������� ��������� ���� � ���������� data
	   	  outputStream.write(data); // � �������� ��� �� ������ �����
	   	 }

	   	 inputStream.close(); //��������� ��� ������. ��� ������ �� �����.
	   	 outputStream.close();
	    }
	}

