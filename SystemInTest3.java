package week6day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {

	public static void main(String[] args) {
		try {
			BufferedReader ir = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			while(true) {
				str = ir.readLine();
				if(str.equals("Stop")) {
					break;
				}
				System.out.println(str);


			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
