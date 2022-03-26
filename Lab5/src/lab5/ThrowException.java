/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.*;
class ThrowExample
{
    void myMethod(int num) throws IOException,ClassNotFoundException
    {
        if(num==1)
            throw new IOException("IOException Occured");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}
/**
 *
 * @author admin
 */
public class ThrowException {
    public static void main(String args[])
    {
        try
        {
            ThrowExample obj=new ThrowExample();
            obj.myMethod(0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
