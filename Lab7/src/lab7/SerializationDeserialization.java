/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.*;
//We must have to implement the Serializable interface for serializing the object
class WRClass implements Serializable {
    String name;
    WRClass(String name) {
        this.name = name;
        // System.out.println(name);
    }
    public String show() {
        return "Name:"+name;
    }
}
public class SerializationDeserialization {
    public static void main(String args[]) {
        WRClass p1 = new WRClass("ArjunShrestha");
        try {
            //Writing Objects -Serialization is the process of converting the objects into writable byte stream
            //For serializing the object, we call the writeObject() method of ObjectOutputStream class
            FileOutputStream fout = new FileOutputStream("E://test.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(p1);
            oout.close();
            fout.close();
           double x=Double.p
            //Reading objects-Deserialiaztion is the process of reconstructing objects from the serialized state
           // For deserialization we call the readObject() method of ObjectInputStream class
            FileInputStream fin = new FileInputStream("E://test.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            WRClass pr1 = (WRClass) oin.readObject();
            System.out.println(pr1.show());
            oin.close();
            fin.close();    
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
