/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class StringReverse {
    
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        reverseString(s);
    }
    public String static  reverseString(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    System.out.println(sb);
    return sb.toString();
}  
    
}
