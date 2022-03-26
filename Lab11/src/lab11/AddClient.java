/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class AddClient {
    public static void main(String args[]) throws IOException
    {
       Socket c=new Socket("localhost",1234);
       
       Scanner in=new Scanner(c.getInputStream());
       PrintWriter outs=new PrintWriter(c.getOutputStream(),true);
       Scanner sc=new Scanner(System.in);
       String msg=in.nextLine();
       System.out.println(msg);
       int a=sc.nextInt();
       outs.println(a);
       msg=in.nextLine();
         System.out.println(msg);
       int b=sc.nextInt();
       outs.println(b);
       msg=in.nextLine();
        System.out.println(msg);
     
       outs.close();
       in.close();
       c.close();
       
    }
    
    
}
