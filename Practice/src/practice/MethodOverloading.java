/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author admin
 */
public class MethodOverloading {

  
    public static void main(String args[]) {
        System.out.println(sum(2,2));
        System.out.println(sum(2,2,2));

        System.out.println(sum(2.2f,4.3f));

    }
      public static int sum(int a, int b) {
        return a * b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static  float sum(float a, float b) {
        return a + b;
    }


}
