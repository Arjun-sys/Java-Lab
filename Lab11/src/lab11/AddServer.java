/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class AddServer {
    public static void main(String args[]) throws IOException
    {
       ServerSocket s=new ServerSocket(1234);
       System.out.println("Waiting For Client");
       Socket c=s.accept();
       Scanner in=new Scanner(c.getInputStream());
       PrintWriter outs=new PrintWriter(c.getOutputStream(),true);
       System.out.println("Waiting For Number Inputs");
       outs.println("Enter the First Number");
       int a=in.nextInt();
       outs.println("Enter the second Number");
       int b=in.nextInt();
       int r=a+b;
       outs.println("Sum:"+r);
       System.out.println("The Sum is "+r);
       outs.close();
       in.close();
       c.close();
       s.close();
    }
    
}
