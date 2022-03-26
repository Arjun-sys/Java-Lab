/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
public class MyThread {
    public static void main(String args[])
    {
        //Creating an object of the Thread class using the constructor Thread(String name)
        Thread t=new Thread("My First Thread");
        //the start() methods moves the thread to the active state
        t.start();
        
        //getting the thread name by invoking the getName() method
        String str=t.getName();
        System.out.println(str);
    }
    
}
