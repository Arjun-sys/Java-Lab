package lab7;
import java.io.*;
public class ByteStreamCopy {
   public static void main(String args[])
   {
 try
    {
    FileInputStream in=new FileInputStream("E://TF1.txt");
    FileOutputStream out=new FileOutputStream("E://TF2.txt");
    int c;
    while((c=in.read())!=-1)
    {
        
       out.write(c);
       System.out.print((char)c);      
    }
    in.close();
        out.close();
}
      catch(FileNotFoundException ex)
    {
        System.out.println("this is an error file not found");
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  
    finally
    {
        System.out.println("This is an example of Byte Stream Classes");
    }
   }
}
