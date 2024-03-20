/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_1;

import java.io.*;
import java.net.*;

/**
 * This class implements java socket client
 * @author pankaj
 *
 */
public class client_sr {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        
        Socket socket = null;
        
        ObjectOutputStream oos = null;
        
        ObjectInputStream ois = null;
        
        for(int i=0; i<5;i++){
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 9876);
            
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());            
            System.out.println("Client is Sending request to Socket Server");
            
            if(i==4)oos.writeObject("exit");            
            else oos.writeObject(""+i);
            
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("From Server Message: " + message);
            
            //close resources
            ois.close();
            oos.close();
            Thread.sleep(5000);
        }
    }
}
