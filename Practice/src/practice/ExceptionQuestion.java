/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
/**
 *
 * @author admin
 */
public class ExceptionQuestion {
    void validate(int x,int y) throws ArithmeticException
    {
        int z=x/y;
        System.out.println("Quotient:"+z);
    }
    void validate(int age)
    {
        try{
        if(age<18)
            throw new Exception("Invalid Age-Example of throw keyword");
        else
            System.out.println("Valid Age");
            }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        ExceptionQuestion e=new ExceptionQuestion();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the age");
         int a=sc.nextInt();
         System.out.println("enter the dividing factor for age");
         int b=sc.nextInt();
        e.validate(a);
        try{
        e.validate(a, b);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage()+"-throws Exception Example ");
        }
    }
        
    
}
