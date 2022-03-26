/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Keyboard extends Applet implements KeyListener {

    String msg = " ";
    private int x, y;
    int X = 100, Y = 100;

    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();

        repaint();

    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}
