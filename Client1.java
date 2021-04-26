package week6day1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStram;
	
	public Client1() {
		try {
		clientSocket = new Socket("localhost", 6099);
		System.out.println("접속요청");
		dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		}catch(Exception e) {
			e.printStackTrace();
		}
		dataSend();
		dataRecv();
	}
public void dataRecv(){
	try {
		String data = DataInputStream.readUTF();
		System.out.println(data);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public void dataSend() {
	Scanner in = new Scanner(System.in);
	try {
			String sendData = in.nextLine();
		dataOutputStream.writeUTF(sendData);
	}cathch(Exception e){
			e.printStackTrace();
	}
	in.close();

	public static void main(String[] args) {
		new Client1();
	}
		

}
}
