/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.lang.*;
/**
 *
 * @author admin
 */
public class ErrorHandling {
    public static void main(String[] args)
    {
        try{
            int divideByZero=5/0;
           System.out.println("Rest of code in try block");

        }
            catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
            }
    }
    
}
