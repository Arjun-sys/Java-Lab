/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
import java.io.*;
class FileMethod {
    public static void main(String args[]) {
        try {
            File myObj = new File("E:\\java\\abc.txt");
            if (myObj.createNewFile()) {
                 System.out.println(myObj.exists() ? "File exists" : "File does not exists");
                System.out.println(myObj.isDirectory() ? "File is a directory" : "File is not " + "a directory");
                System.out.println(myObj.isFile() ? "File is an ordinary file" : "File may be a named pipe");
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
               
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
