/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
import java.io.*;
class Application {
    public static void main(String a[]) throws IOException {
         try
        {   
            String command = "C:\\Users\\admin\\Downloads\\AnyDesk.exe";
            Runtime run  = Runtime.getRuntime();
            Process proc = run.exec(command);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
       
    }
}
