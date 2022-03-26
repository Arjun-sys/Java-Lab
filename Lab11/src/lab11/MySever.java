/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.io.*;

import java.net.*;


/**
 *
 * @author admin
 */
public class MySever {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(5590);
            System.out.println("Inside Server");
            Socket s=ss.accept();//establishes connection
            System.out.println("Connection Established");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("Message From Server="+str);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        // TODO code application logic here
    }
    
}
