/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class GridBagLayout1 extends JFrame {

    public static void main(String[] args) {
        GridBagLayout1 a = new GridBagLayout1();
    }

    public GridBagLayout1() {
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        setTitle("GridBag Layout Example");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JButton("Button One"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new JButton("Button two"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 40;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new JButton("Button Three"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new JButton("Button Four"), gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.ipady = 100;
        this.add(new JButton("Button Five"), gbc);

        setSize(400, 300);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
