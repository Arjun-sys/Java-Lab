package exam_lab_question;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Mouse extends Applet implements MouseListener
{
private int x,y;
private String str = " ";
public void init()
{
this.addMouseListener (this);
}
public void paint(Graphics g)
{
g.drawString(str,x,y);
}
public void update(Graphics g)
{
paint(g);
}
public void mouseClicked(MouseEvent m)
{
  x = m.getX();
  y = m.getY();
  str = "x =" +x+",y = "+y;
repaint();
}
 public void mouseEntered(MouseEvent m)
{
}
 public void mouseExited(MouseEvent m)
{
}
 public void mousePressed(MouseEvent m)
{
}
 public void mouseReleased(MouseEvent m)
 {    
 }
}