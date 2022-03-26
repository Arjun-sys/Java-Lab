/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
public class ConsonantVowelExample {
public static void main(String[] args)throws IOException
{

try
{
    FileInputStream fstream = new FileInputStream("E://TF1.txt");
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    FileWriter ostream = new FileWriter("E://Consonant.txt");
      BufferedWriter out = new BufferedWriter(ostream);
      FileWriter opstream = new FileWriter("E://Vowel.txt");
      BufferedWriter outt = new BufferedWriter(opstream); 

     String str=br.readLine();
     char ch;        
     for (int i=0;i<str.length();i++)
     {
         ch = str.charAt(i); 


      if(( ch == 'a') ||( ch == 'e') ||( ch == 'i') ||( ch == 'o') ||( ch == 'u')) 

    {
        outt.write(ch);
    }
          else
          {
              out.write(ch); 
          }

      }

     out.close();
      outt.close();
      br.close(); 
}
catch (Exception e) {
    System.err.println(e);
  }

    }

}
