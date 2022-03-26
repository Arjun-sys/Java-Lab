/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.lang.ArithmeticException;
/**
 *
 * @author admin
 */
public class FinallyTest {
    public static void main(String args [])
    {
        try{
            int divideByZero=5/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception=>"+e.getMessage());
            
        }
        finally
        {
            System.out.println("This is finally block");
        }
    }
    
    
}
