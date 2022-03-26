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
public class FloatScanner {
    public static void main(String[] args)
    {
        float sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1o decimal numbers");
         for(int i=0;i<10;i++)
         {
        float number=input.nextFloat();
         sum+=number;
         }
          System.out.println(sum);
       
            
        
    }
    
    
}
