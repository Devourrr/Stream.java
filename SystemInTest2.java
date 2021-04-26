package week6day1;


import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
	
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			int ch;
			while( (ch = ir.read()) !='\n') { //\n' = ฟฃลอ
				System.out.println((char)ch);
			}
			
			System.out.println((char)ch);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}