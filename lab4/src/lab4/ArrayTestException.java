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
class ListOfNumbers
{
    int[] arr=new int[8];
    public void writelist()
    {
   
        try{
            arr[7]=2;
            
            System.out.println("Tnserted Successfully");
            arr[9]=1;
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException=>"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds=>"+e.getMessage());
        }
    }
    
}
public class ArrayTestException {
    public static void main(String args[])
    {
        ListOfNumbers list=new ListOfNumbers();
        list.writelist();
    }
    
}
