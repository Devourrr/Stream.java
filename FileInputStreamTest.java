package week6day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args)  {
		
		try {
			FileInputStream f = new FileInputStream("Book.java");
			
			int ch;
			while((ch= f.read()) != -1) {
				System.out.println((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
