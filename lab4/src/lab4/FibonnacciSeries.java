/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class FibonnacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,b=1,c,i;
        System.out.println("The Fibonacci Series:");
        for(i=0;i<15;i++)
        {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
            
            
        }
        // TODO code application logic here
    }
    
}
