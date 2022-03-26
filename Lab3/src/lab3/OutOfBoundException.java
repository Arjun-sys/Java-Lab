/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author admin
 */
public class OutOfBoundException {
    public static void main(String[] args)
    {
        String array[]={"Arjun","Nikita","Anusha"};
        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.print(ar[i]+" ");
        }
        catch (Exception e) {
            System.out.println("\nException caught:"+e);
        }
        try {
            for (int i = 0; i <= array.length; i++)
                System.out.println(array[i]+" ");
        }
        catch (Exception e1) {
            System.out.println("\nException caught:"+e1);
        }
    }
}

