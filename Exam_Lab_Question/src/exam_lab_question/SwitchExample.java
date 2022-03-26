/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;

public class SwitchExample {

    public static void main(String args[]) {
        char ch = 'X';
        switch (ch) {
            case 'X':
                System.out.println("X is choosen");
                break;
            case 'Y':
                System.out.println("Y is choosen");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
