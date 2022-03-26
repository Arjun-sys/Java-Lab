/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
public class Pass_By_Value {  
    /*
     *  The original value of a will remain unchanged in
     *  case of call-by-value
     */
     
    int a = 10;
    void call(int a) {
         
        // this local variable a is subject to change in its value
        a = a+10;
    }
     
    public static void main(String[] args) {
 
        Pass_By_Value obj = new Pass_By_Value();
        System.out.println("Before call-by-value: " + obj.a);
         
        /*
         * Passing an integer 50510 to the call() method. The value of 
         * 'a' will still be unchanged since the passing parameter is a 
         * primitive type. 
         */
        obj.call(100);
        System.out.println("After call-by-value: " + obj.a);
         
         
    }
}
    

