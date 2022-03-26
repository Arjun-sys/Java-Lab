/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author admin
 */
import java.lang.ArithmeticException;
public class TryCatchAdd {
    public static void main(String args[])
    {
       int a=9999995;
       int b=5;
       int sum;
       try{
           sum=a+b;
           System.out.println(sum);
       }
       catch(ArithmeticException e)
       {
           System.out.println("hello Arithmetic Exception"+e.getMessage());
       }
    }
    
}
