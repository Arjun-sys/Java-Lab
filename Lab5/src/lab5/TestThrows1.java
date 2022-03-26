/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.IOException;
/**
 *
 * @author admin
 */
public class TestThrows1 {
    void m()throws IOException{
        throw new IOException("Device Error");
    }
    void n() throws IOException{
        m();
    }
    void p()
    {
        try{
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args)
    {
        TestThrows1 obj=new TestThrows1();
        obj.p();
        System.out.println("Normal Flow");
    }
}
