package P_2;

import java.net.*;
import java.io.*;

public class UDPsender {
	public static void main(String [] args) throws IOException {
		 DatagramSocket server_ds = new DatagramSocket(4444);
		 BufferedReader server_inp = new BufferedReader(new InputStreamReader(System.in));
		 InetAddress ip = InetAddress.getByName("localhost");
		 byte[] out_data = new byte[1024];
		 byte[] in_data = new byte[1024];
		 while(true) {
			 DatagramPacket p2 = new DatagramPacket(in_data,in_data.length );
			 server_ds.receive(p2);
			 String str = new String(p2.getData());
			 System.out.println(str);
//			 
//			 InetAddress ipp2 = p2.getAddress();
//			 int port = p2.getLength();
//			 String send_str= server_inp.readLine();
//			 out_data = send_str.getBytes();
//			 DatagramPacket p3 = new DatagramPacket(out_data, out_data.length);
//			 server_ds.send(p3);
		 }
	}
}
