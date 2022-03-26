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
public class GreetingClient  {
   
    public static void main(String args[])
    {
        String serverName="Localhost";
        int port=60666;
       try{
                System.out.println("Connecting to server"+serverName+"on port"+port);
                Socket client=new Socket(serverName,port);
                System.out.println("JuSt connected to"+client.getRemoteSocketAddress());
                OutputStream outToServer=client.getOutputStream();
               
                DataOutputStream out=new DataOutputStream(outToServer);
                out.writeUTF("Hello From"+client.getLocalSocketAddress());
               InputStream inFromServer=client.getInputStream();
               DataInputStream in=new DataInputStream(inFromServer);
               System.out.println("Server SAYS"+in.readUTF());
               client.close();
            }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}

