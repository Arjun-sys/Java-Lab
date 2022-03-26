/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ClientFactorial {
    public static void main(String args[]) throws IOException
    {
           Socket s=new Socket("Localhost",1065);
                        BufferedReader br;
                        PrintStream ps;
                        String str;
                        System.out.println("Enter number  :");
                        br=new BufferedReader(new InputStreamReader(System.in));
                        ps=new PrintStream(s.getOutputStream());
                        ps.println(br.readLine());
                        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        str=br.readLine();
                        System.out.println("Factorial is : "+str);
                        br.close();
                        ps.close();
           
       
        
    }
    
}
