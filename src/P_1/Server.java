package P_1; 

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String [] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(7777);
		System.out.println("Accepted......");
		Socket sc = ss.accept();
		
		FileInputStream fr = new FileInputStream("C:/Users/91989/eclipse-workspace/P_1/temp.txt");
		byte [] B = new byte[2002];
		
		fr.read(B, 0 , B.length);
		
		OutputStream os = sc.getOutputStream();
		os.write(B , 0 , B.length);
		System.out.println("File has written");
		
		// print written file is remaining.... 
		
	}
}
