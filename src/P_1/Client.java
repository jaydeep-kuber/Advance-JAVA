package P_1;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String [] args) throws IOException {
		
		Socket sc = new Socket("localhost", 7777);
		
		InputStream is = sc.getInputStream();
		
		FileOutputStream fo = new FileOutputStream("C:/Users/91989/eclipse-workspace/P_1/received.txt");
		
		byte []receive = new byte[2002];
		
		is.read(receive , 0 , receive.length);
		fo.write(receive , 0 , receive.length);
		
		
		
	}
	
}
