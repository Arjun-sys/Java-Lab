/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;

import java.lang.reflect.*;
import java.util.*;

class Modifiers {

    public static void main(String a[]) throws ClassNotFoundException {
        Class c = Class.forName("mypack.Circle");
        Method m[] = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            int mo = m[i].getModifiers();
            if (Modifier.isPublic(mo)) {
                System.out.println(m[i].getName());
            }
        }
    }
}
