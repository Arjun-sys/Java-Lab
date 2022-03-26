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
public class GreetingServer extends Thread {
    private ServerSocket serverSocket;
    public GreetingServer(int port) throws IOException{
        serverSocket=new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("Waiting for client on port"+serverSocket.getLocalPort()+"..");
                Socket server=serverSocket.accept();
                System.out.println("JuSt connected to"+server.getRemoteSocketAddress()+"\nGoodBye!");
                DataInputStream in=new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out=new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to"+server.getLocalSocketAddress()+"\nGoodbye!");
                server.close();
            }
            catch(SocketTimeoutException s)
            {
                
               System.out.println("Socket timed out!");
            break;  
            }
            catch(IOException e)
            {
                
               e.printStackTrace();
            break;  
            }
            
           
        }
    }
    public static void main(String args[])
    {
        int port=60666;
        try{
            Thread t=new GreetingServer(port);
            t.start();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
