/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.*;  
class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu date=new Menu("Date");
         Menu exit=new Menu("Exit");
         Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("Item 1");  
         MenuItem i2=new MenuItem("Item 2");  
         MenuItem i3=new MenuItem("Item 3");  
         MenuItem i4=new MenuItem("Item 4");  
         MenuItem i5=new MenuItem("Item 5"); 
         CheckboxMenuItem tb=new CheckboxMenuItem("Toolbar",true);
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.addSeparator();
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         menu.add(tb);
         mb.add(date);
         mb.add(menu);  
         f.setMenuBar(mb); 
         Dialog d=new Dialog(this,"Dialog Box",true);
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
} 