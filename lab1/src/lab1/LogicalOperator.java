/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin
 */ 
public class LogicalOperator {
    public static void main(String[] args)
    {
        //&& operator
        System.out.println((5>3)&&(8>5));
        System.out.println((5>3)&&(8<5));
         //||operator
          System.out.println((5<3)||(8>5));
           System.out.println((5>3)||(8<5));
            System.out.println((5<3)||(8<5));
            //! operator
            System.out.println(!(5==3));
             System.out.println(!(5>3));
    }
}
