/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.lang.*;
import javax.swing.JOptionPane;
public class Addition {

   
    public static void main(String[] args) {
        try{
        // TODO code application logic here
        String firstNumber=JOptionPane.showInputDialog("enter first  number");
        String secondNumber=JOptionPane.showInputDialog("enter second number");
    int number1=Integer.parseInt(firstNumber);
    int number2=Integer.parseInt(secondNumber);
    int sum=number1+number2;
    JOptionPane.showMessageDialog(null,"Ths sum is "+sum,"Sum of two integers",JOptionPane.PLAIN_MESSAGE);
    }
        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    
    
}
