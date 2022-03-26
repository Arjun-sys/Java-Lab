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
public class ServerFact {
    public static void main(String args[]) throws IOException
    {
       ServerSocket s=new ServerSocket(1234);
       System.out.println("Waiting For Client");
       Socket c=s.accept();
       Scanner in=new Scanner(c.getInputStream());
       PrintWriter outs=new PrintWriter(c.getOutputStream(),true);
       System.out.println("Waiting For Number Input");
     //  outs.println("Enter the  number to find factorial");
       int a=in.nextInt();
       int fact=1,i;
       for(i=1;i<=a;i++)
       {
           fact=fact*i;
       }
      
       outs.println("The Factorial of "+a+" is "+fact);
       System.out.println("The Factorial of "+a+" is "+fact);
       outs.close();
       in.close();
       c.close();
       s.close();
    }
    
}
