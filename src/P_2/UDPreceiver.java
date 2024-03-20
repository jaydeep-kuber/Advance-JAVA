package P_2;

import java.io.*;
import java.net.*;

public class UDPreceiver {
	public static void main(String [] args) throws IOException {
		BufferedReader user_inp = new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket Cl_ds= new DatagramSocket();
		InetAddress ip = InetAddress.getByName("localhost");
		byte[] in_data = new byte[1024];
		byte out_data[] = new byte[1024];
 		String Str =  user_inp.readLine();
 		out_data = Str.getBytes();
 		DatagramPacket p1 = new DatagramPacket(out_data, out_data.length,ip,4444);
 		Cl_ds.send(p1);
 		Cl_ds.close();
 		
// 		DatagramPacket p4 = new DatagramPacket(in_data, in_data.length,ip ,4444);
// 		Cl_ds.receive(p4);
// 		String recive = new String(p4.getData());
// 		System.out.println(recive);
	}
}
