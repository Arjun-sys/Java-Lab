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
public class MammalInt implements Animal {
    public void eat()
    {
        System.out.println("mammal eats");
    }
    public void travel()
    {
        System.out.println("mammal travels");
    }
    public int noOfLegs()
    {
        return 0;
    }
    
    public static void main(String [] args)
    {
        MammalInt m=new MammalInt();
        m.eat();
        m.travel();
    }
}
