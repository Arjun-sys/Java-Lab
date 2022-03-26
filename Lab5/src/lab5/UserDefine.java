/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
class MyException extends Exception
{
    String str1;
    MyException(String str2)
    {
        str1=str2;
    }
    public String toString()
    {
        return("MyExceprtion occured:"+str1);
    }
}
public class UserDefine {
    public static void main(String[] args)
            
    {
        try{
            System.out.println("Starting of try block");
        //I am throwing custom exception using throw
        throw new MyException("This is my error message");
        }
        catch(MyException e)
        {
            System.out.println("catchblock");
            System.out.println(e);
        }
    }
    
}
