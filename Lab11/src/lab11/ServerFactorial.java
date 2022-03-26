/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class ServerFactorial {

    public static void main(String args[]) throws IOException {

        ServerSocket server = new ServerSocket(1065);
        System.out.println("Waiting for Client Request");
        Socket client = server.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = br.readLine();
        System.out.println("Received number");
        int n = Integer.parseInt(str);
        int fact=1;
       
         for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        PrintStream ps = new PrintStream(client.getOutputStream());
         System.out.println("FACTORIAL IS "+fact);
        ps.println(fact);
         br.close();
                                    ps.close();
                                    client.close();
                                    server.close();

    }

}
