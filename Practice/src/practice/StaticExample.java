/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
public class StaticExample 
        {
    static int count;
    String name;
    StaticExample(String name)
    {
        this.name=name;
        System.out.println("Object Created");
        count++;
    }
    static void displayCount()
    {
       System.out.println(count); 
    }
    void display()
    {
        System.out.println("Name:"+name);
    }
    public static void main(String args[])
    {
        StaticExample.displayCount();
        StaticExample s1=new StaticExample("Arjun");
        StaticExample s2=new StaticExample("Asmita");
        StaticExample.displayCount();
        s1.display();
        s2.display();
    }
    
}
