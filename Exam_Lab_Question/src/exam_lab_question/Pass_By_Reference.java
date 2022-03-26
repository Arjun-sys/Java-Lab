/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
public class Pass_By_Reference {
     
    /*
     *  The original value of 'a' will be changed as we are trying
     *  to pass the objects. Objects are passed by reference.
     */
     
    int a = 10;
    void call(Pass_By_Reference eg) {
        eg.a = eg.a+10;
    }
     
    public static void main(String[] args) {
 
        Pass_By_Reference eg = new Pass_By_Reference();
        System.out.println("Before call-by-reference: " + eg.a);
         
        // passing the object as a value using pass-by-reference
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);
         
         
    }
}