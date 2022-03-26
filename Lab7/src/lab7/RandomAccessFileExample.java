/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
import java.io.IOException;  
import java.io.RandomAccessFile;
public class RandomAccessFileExample {
   public static void main(String args[])
   {
    try{
    RandomAccessFile raf=new RandomAccessFile("E:\\test.txt","rw");
    raf.writeUTF("ARJUN");
     raf.writeUTF("Hi");
    
       raf.seek(0);
 System.out.println(raf.readUTF());
   long pos =raf.getFilePointer();
   System.out.println(pos);
     System.out.println(raf.readUTF());
      raf.seek(0);
    
     System.out.println(raf.readUTF());
  raf.seek(7);
      System.out.println(raf.readUTF());
          
}
    catch(IOException e)
    {
        e.printStackTrace();
    }
   }
    
}
