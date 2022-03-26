/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author admin
 */


import java.io.*;

import java.net.*;


/**
 *
 * @author admin
 */
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           
            Scanner s=new Scanner(System.in);
            Socket s=new Socket("Localhost",5599);
           
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Client");
            int a=
            dout.writeInt(a);
            do
            dout.flush();
            dout.close();
        
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        // TODO code application logic here
    }
    
}
