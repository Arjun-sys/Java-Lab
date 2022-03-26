package exam_lab_question;

import java.io.*;

public class FileMethod2 {

    public static void main(String[] args) {

        File oldFile = new File("E:\\java\\abc.txt");
        File newFile = new File("E:\\java\\xyz.txt");
        if (oldFile.exists()) {
            System.out.println(oldFile + "exists.");
            System.out.println("Its size is " + oldFile.length() + "bytes");
            oldFile.renameTo(newFile);
            System.out.println(oldFile.getName());
            //newFile.delete();
            if (newFile.delete()) {
                System.out.println("Deleted the file: " + newFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("does not exists");
        }

    }

}
