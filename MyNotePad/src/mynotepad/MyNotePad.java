
package mynotepad;


import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class MyNotePad extends JFrame implements ActionListener {
   

    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help,format,view;
    JMenuItem cut,copy,paste,selectAll,color,statusBar,zoomIn,zoomOut,wordWrap;
    JTextArea ta;
    
    MyNotePad()
    {

        f=new JFrame();
        
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        
selectAll=new JMenuItem("Select All");
 color=new JMenuItem("Color");
 zoomIn=new JMenuItem("Zoom In");
  zoomOut=new JMenuItem("Zoom Out");
  statusBar=new JMenuItem("Status Bar");
  
  wordWrap=new JMenuItem("Word Wrap");
 
 
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);
color.addActionListener(this);
zoomIn.addActionListener(this);
zoomOut.addActionListener(this);
statusBar.addActionListener(this);
wordWrap.addActionListener(this);
//font.addActionListener(this);
mb=new JMenuBar();
mb.setBounds(5, 5, 460, 40);
file=new JMenu("File");
edit=new JMenu("Edit");
format=new JMenu("Format");
view=new JMenu("View");
help=new JMenu("Help");
edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(selectAll);
edit.add(color);
view.add(zoomIn);
view.add(zoomOut);
view.add(statusBar);
format.add(wordWrap);

  mb.add(file);
  mb.add(edit);
  mb.add(format);
  mb.add(view);
  mb.add(help);
  ta=new JTextArea();
 
  ta.setBounds(5,50,460,460);
  f.add(mb);
  f.add(ta);
  f.setLayout(null);
  f.setSize(500,500);
  f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==zoomIn)
       {
           Font font = ta.getFont();
float size = font.getSize() + 5.0f;
ta.setFont( font.deriveFont(size) );
         
       }
        if(e.getSource()==zoomOut)
       {
           Font font = ta.getFont();
float size = font.getSize() - 5.0f;
ta.setFont( font.deriveFont(size) );
         
       }
      
        Color initialcolor=Color.RED;
       Color color=JColorChooser.showDialog(this,"Select a Color",initialcolor);
       ta.setBackground(color);
       
        if(e.getSource()==cut)
        {
            ta.cut();
        }
        if(e.getSource()==paste)
        {
            ta.paste();
        }
        if(e.getSource()==copy)
	{
		ta.copy();
		
	}
	if(e.getSource()==selectAll)
	{
		ta.selectAll();
		
	}
    }
    public static void main(String args[])
    {
        new MyNotePad();
   
      
    }
    
}

