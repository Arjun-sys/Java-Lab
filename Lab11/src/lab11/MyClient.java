package lab11;
import java.io.*;
import java.net.*;
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           
            
            Socket s=new Socket("Localhost",5590);
           
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Client");
           
           
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
