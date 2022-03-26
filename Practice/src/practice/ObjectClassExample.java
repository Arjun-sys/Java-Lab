/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author admin
 */
public class ObjectClassExample {
    private int l,b;
    public void setData(int x,int y)
    {
        l=x;
        b=y;
    }
    public int findArea()
    {
        return l*b;
    }
    public void showData()
    {
        System.out.println("This is example of object and class");
    }
    
    public static void main(String args[])
    {
        ObjectClassExample oce=new ObjectClassExample();
        oce.showData();
        oce.setData(10,10);
        System.out.println("The area of rectangle:"+oce.findArea());
        
        
    }
    
}
