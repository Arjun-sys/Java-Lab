/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;
/**
 *
 * @author admin
 */
public class MultipleCatchException {
    public static void main(String args[])
    {
        try{
            int a[]=new int[5];
            a[6]=30/4;
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds exception");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointer Exception");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("rest of the code");
    }
    
}
