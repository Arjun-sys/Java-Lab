/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ServerFibonacci {
    public static void main(String args[]) throws IOException
    {
       ServerSocket s=new ServerSocket(1234);
       System.out.println("Waiting For Client");
       Socket c=s.accept();
       Scanner in=new Scanner(c.getInputStream());
       PrintWriter outs=new PrintWriter(c.getOutputStream(),true);
       System.out.println("Waiting For Number Input");
       outs.println("Enter the  number to find fibonacci series");
       int n=in.nextInt();
       int a=0,b=1,d,i;
       System.out.println("The Fibonacci series:");
       outs.println("The Fibonacci series:");
       for(i=0;i<n;i++)
       {
           d=a+b;
           System.out.println(a);
           outs.println(a);
           a=b;
           b=d;
       }
      
      
       outs.close();
       in.close();
       c.close();
       s.close();
    }
    
}
