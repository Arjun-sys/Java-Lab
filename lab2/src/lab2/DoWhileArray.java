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
public class DoWhileArray {
     public static void main(String[] args)
    {
        int i=0;
        int a[]= new int[5];
        a[0]=5;
        a[1]=4;
        a[2]=2;
        a[3]=7;
        a[4]=9;
        do 
        {
            System.out.println(a[i]);
            i++;
        }
        while(i<a.length);
}
    
}
