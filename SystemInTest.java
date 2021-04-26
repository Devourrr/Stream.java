package week6day1;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		char c = 'วั';
		System.out.println(c);
		System.err.println("error");
		//enter key 13, '\n'
		
		try {
			int ch = System.in.read();
			System.out.println(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
