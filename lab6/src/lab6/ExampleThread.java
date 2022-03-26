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
public class ExampleThread extends Thread{

    /**
     * @param args the command line arguments
     */
    
        public void run()
        {
            System.out.println("Thread Running");
        }

    public static void main(String[] args) {
        // TODO code application logic here
        ExampleThread t1=new ExampleThread();
        t1.start();
    }
   
    
}
