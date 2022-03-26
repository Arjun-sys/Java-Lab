/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try{
//            File myObj=new File("E:\\TextFile.txt");
//            Scanner myReader =new Scanner(myObj);
//            while(myReader.hasNextLine())
//            {
//                String data=myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();//it is very very necessary to close
//       
//        }
try
{
    FileReader fr=new FileReader("E://TextFile.txt");
    int c;
    while((c=fr.read())!=-1)
    {
        System.out.print((char)c);
        
    }
    fr.close();
}
        catch(IOException e)
        {
            System.out.println("An Error occured");
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
