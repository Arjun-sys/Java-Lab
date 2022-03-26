/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
public class SwingExample2 {
    public static void main(String[] args )
    {
        //Creating instance of JFrame
        JFrame frame=new JFrame("Swing Eaxmple");
        //setting width and height of frame
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CREATING PANEL.Inside panels we can add test fields ,buttons and other components
        JPanel panel=new JPanel();
        //adding panel to frame
        frame.add(panel);
        //callng user deined method for adding components to teh panel
        placeComponents(panel);
        //setting the frame visibility to true 
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel)
    {
        panel.setLayout(null);
        //Creating JLabel
        JLabel userLabel=new JLabel("User");
        //this method specifies the location and size of the component
        userLabel.setBounds(10,20,80,25);z
        panel.add(userLabel);
        //Creating test field where user is supposed to enter username
        JTextField userText=new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
       // same process for password label and text field
          JLabel passwordLabel=new JLabel("Password");
          passwordLabel.setBounds(10, 50, 80, 25);
         panel.add(passwordLabel);
         JPasswordField passwordText=new JPasswordField(20);
         passwordText.setBounds(100,50,165,25);
         panel.add(passwordText);
         //Creating login Button
         JButton loginButton=new JButton("Login");
         loginButton.setBounds(10,80,80,25);
         panel.add(loginButton);
    }
}
