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
public class FibonacciSeriesGiven {
    public static void main(String args[])
    {
        int i,f3,count=10,f1=0,f2=1;
        System.out.print(f1+"   "+f2+"  ");
        for(i=2;i<count;i++)
        {
            f3=f1+f2;
            System.out.print(f3+"   ");
            f1=f2;
            f2=f3;
        }
        
    }
}
