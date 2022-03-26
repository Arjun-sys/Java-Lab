/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
import java.io.IOException;
public class CharaterCopyFiles {
    public static void main(String args[])
    {
        try{
        FileReader fr=new FileReader("E://TextFileA.txt");
        FileWriter fw=new FileWriter("E://TextFileB.txt");
        int c;
        while((c=fr.read())!=-1)
        {
            fw.write(c);
            System.out.print((char)c);
            
        }
        fr.close();
        fw.close();
                }
        catch(IOException e)
        {
            e.printStackTrace();
            
        }
    }
    
}
