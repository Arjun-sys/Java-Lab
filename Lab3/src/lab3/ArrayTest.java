/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ArrayTest {
     public static void main(String[] args) {
     
           int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();
   
    // while loop continues 
    // until entered number is positive
    while (number <= 3) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }
   
    System.out.println("Sum = " + sum);
    input.close();
         input.close();
    }
    
}
