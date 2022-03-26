/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;

import java.io.*;

class FileMethod3 {

    public static void main(String args[]) throws IOException {

        File f = new File("E:/java/example");
        if (f.mkdir()) {
            System.out.println("created a directory");
        } else {
            System.out.println("unable to create a directory");
        }
    }
}
