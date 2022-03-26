/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;

import java.awt.*;

public class ComboBox extends Frame {

    Label label = new Label("Default Text");
    Choice choice = new Choice();
    List list = new List(3, true);

    public static void main(String args[]) {
        ComboBox win = new ComboBox();
    }

    public ComboBox() {
        super("ListExample");
        addMenus();
        addComponents();
        pack();
        resize(400, 400);
        show();
    }

    void addMenus() {
        MenuBar menubar = new MenuBar();
        Menu file = new Menu("file");
        file.add("Quit");
        menubar.add(file);
        setMenuBar(menubar);
    }

    void addComponents() {
        add("North", label);
        label.setAlignment(Label.CENTER);
        Panel panel = new Panel();
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        try {
            choice.addItem("one");
            choice.addItem("two");
            choice.addItem("three");
        } catch (NullPointerException ex) {
        }
        panel1.add(choice);
        list.addItem("four");
        list.addItem("five");
        list.addItem("six");
        list.addItem("seven");
        list.addItem("eight");
        panel2.add(list);
        panel.add(panel1);
        panel.add(panel2);
        add("Center", panel);
    }

    public boolean handleEvent(Event event) {
        if (event.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (event.id == Event.ACTION_EVENT && event.target instanceof MenuItem) {
            if ("Quit".equals(event.arg)) {
                System.exit(0);
                return true;
            } else {
                return false;
            }
        } else if (event.target instanceof Choice || event.target instanceof List) {
            String text = choice.getSelectedItem() + " ";
            for (int i = 0; i < 5; ++i) {
                if (list.isSelected(i)) {
                    text += list.getItem(i) + " ";
                }
            }
            label.setText(text);
            return true;
        } else {
            return false;
        }
    }
}
