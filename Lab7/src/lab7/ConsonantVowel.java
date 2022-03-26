/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
import java.util.*;
/**
 *
 * @author admin
 */
public class ConsonantVowel {
     public static void main(String args[])
   {
 try
    {
    FileOutputStream out1=new FileOutputStream("E://Consonant.txt");
    FileOutputStream out2=new FileOutputStream("E://Vowel.txt");
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the string");
   String s=sc.nextLine();
   for(int i=0;i<s.length();i++)
   {
       char c=s.charAt(i);
       if((c == 'E')||(c == 'I')||( c == 'A')||( c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
       {
           out2.write(c);
       } else {
           out1.write(c);

       }
   }
   
    out1.close();
        out2.close();
}
      catch(FileNotFoundException ex)
    {
        System.out.println("this is an error file not found");
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  
    finally
    {
        System.out.println("This is an example of Byte Stream Classes");
    }
   }
    
}
