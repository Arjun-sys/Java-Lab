/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author admin
 */
//overloading Examples
public class Overloading {
    String Names;
    int Ages;
    Overloading(String name,int age)
    {
        Names=name;
        Ages=age;
        System.out.println(Names+","+Ages);
    }
   Overloading(String name)
    {
        Names=name;
      
        System.out.println(Names);
    }
    Overloading()
    {
        
      
        System.out.println("Hello,Chocolate");
    }
     public int myMethod(int age)
    {
        Ages=age;
     System.out.println("this is mh age"+Ages);  
     return 0;
    }
     public void myMethod()
    {
     System.out.println("This is me");   
    }
     public static void main(String[] args)
    {
        Overloading obj=new Overloading("Arjun",22);
       Overloading obj1=new Overloading("Nikita");
         Overloading obj2=new Overloading();
         obj2.myMethod(12);
         obj2.myMethod();
    }
    
    
}
