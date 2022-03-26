/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class First extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){  
        g.setColor(Color.red);
g.drawString("welcome",100,150);  
g.drawLine(20,30,500,500);
g.draw3DRect(20,30,500, 400, true);
}  

    // TODO overwrite start(), stop() and destroy() methods
}
/* 
<applet code="First.class" width="300" height="300"> 
</applet> 
*/  