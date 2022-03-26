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
public class ArrayCopy {
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5,6};
        int [] b=a;//copying number
        int [] c=b;
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        for(int j=5;j>=0;j--)
        {
            System.out.println(c[j]);
        }
    }
    
}
