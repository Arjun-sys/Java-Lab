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
public class ThreadExample implements Runnable
{
    
    public void run()
        {
            System.out.println("Thread Running");
        }
   
    public static void main(String[] args) {
        // TODO code application logic here
       ThreadExample m1=new ThreadExample();
        Thread t1=new Thread(m1);
        //uisng the constructor thread Runnable
        t1.start();
    }
    
}
