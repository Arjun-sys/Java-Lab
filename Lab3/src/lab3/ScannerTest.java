/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
//        int sum=0;
//        //Create an object of Scanner class
        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int number=input.nextInt();
//        for(int i=0;i<number;i++)
//            System.out.println(i);
        System.out.println("Enter the string ");
        String s1=input.next();
        int compareTo = s1.compareToIgnoreCase("Nikita");
         if(compareTo==0) 
        {
           System.out.println(s1);  
           
        }
        
            input.close();     
    }
    
}
