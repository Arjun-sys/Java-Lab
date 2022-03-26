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
public class ArrayIndexOutOfBoundException1 {
    public static void main(String [] args)
    {
        
         try{
            int array[]={1,2,3,4,5,6};
            array[6]=10/0;
           System.out.println(array[9]);

        }
         catch(ArithmeticException e)
         {
             System.out.println(e);
         }
                catch (ArrayIndexOutOfBoundsException e) 
                {
      System.out.println("IndexOutOfBoundsException => " + e.getMessage());
    }

        
    }
    
}
