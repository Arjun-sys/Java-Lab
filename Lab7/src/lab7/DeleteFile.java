/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author admin
 */
public class DeleteFile {
    public static void main(String [] args) throws IOException
    {
        File myObj=new File("E:\\TextFile1.txt");
        if(myObj.delete())
        {
            System.out.println("Deleted file:"+myObj.getName());
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }
    
}
