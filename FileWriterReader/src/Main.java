

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("Scource/MyFile.txt");
		writer.write("Hello world \n i love you \n  Hello my love \n I love Kurisu Makise \n Steins Gate");
		System.out.println("File is writed");
		writer.close();
		
		
		FileReader reader = new FileReader("Scource/MyFile.txt");
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()) {
		System.out.println	(scan.nextLine());
		}
		System.out.println("File is readed");
		reader.close();
		scan.close();

	}

}
