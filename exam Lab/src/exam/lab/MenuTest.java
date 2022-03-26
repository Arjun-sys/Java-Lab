/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.lab;

import javax.swing.*;
import java.awt.event.*;

public class MenuTest {

    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help, insert, home;
    JMenuItem cut, copy, paste;

    MenuTest() {
        f = new JFrame();
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        mb = new JMenuBar();

        mb.setBounds(5, 5, 460, 40);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        home = new JMenu("Home");
        insert = new JMenu("Insert");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        mb.add(file);
        mb.add(home);
        mb.add(edit);
        mb.add(insert);
        mb.add(help);

        f.add(mb);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String args[]) 
    {
            new MenuTest();
    }

}
