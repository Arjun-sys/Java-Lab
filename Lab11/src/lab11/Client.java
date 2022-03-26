/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
//Client Program
import java.io.*;
import java.net.*;
class Client
{
            public static void main(String args[])throws IOException
            {
                       
                        Socket s=new Socket(InetAddress.getLocalHost(),1064);
                        BufferedReader br;
                        PrintStream ps;
                        String str;
                        System.out.println("Enter Radius  :");
                        br=new BufferedReader(new InputStreamReader(System.in));
                        ps=new PrintStream(s.getOutputStream());
                        ps.println(br.readLine());
                        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        str=br.readLine();
                        System.out.println("Area of the circle is : "+str);
                        br.close();
                        ps.close();
            }
}