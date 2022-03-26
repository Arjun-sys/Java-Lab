/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
public class CreatingExceptionClass {
     void validate(int age) throws InvalidAgeException
    {
        if(age<18) throw new InvalidAgeException("Invalid age");
        else
            System.out.println("Valid age");
    }
    public static void main(String agrs[])
    {
        CreatingExceptionClass c=new CreatingExceptionClass();
        CreatingExceptionClass c1=new CreatingExceptionClass();
        try
        {
            c.validate(24);
            c1.validate(4);
            
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
    }
    
}
