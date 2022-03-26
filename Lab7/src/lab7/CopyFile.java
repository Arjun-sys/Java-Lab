/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
//import java.io.FileNotFoundException;
/**
 *
 * @author admin
 */
public class CopyFile {
    public static void main(String [] args ) throws IOException
    {
        FileInputStream in=new FileInputStream("E://TextFile.txt");
    FileOutputStream out=new FileOutputStream("E://TextFile1.txt");
    try
    {
        int c;
        while((c=in.read())!=-1)
        {
            out.write(c);
            System.out.print((char)c);
        }
        in.close();
        out.close();
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
//    finally{
//    if(in!=null)
//    {
//    in.close();
//    }
//    if(out!=null)
//    {
//    out.close();
//    }
}
}
