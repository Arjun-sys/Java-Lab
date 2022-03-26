/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
//class Rectangle
//{
//    private double l,b;
//    Rectangle()
//    {
//        l=2.3;
//        b=3.3;
//    }
//    Rectangle(double x,double y)
//    {
//     l=x;
//     b=y;
//    }
//    double findArea()
//    {
//        return l*b;
//    }
//}
/**
 *
 * @author admin
 */
public class MainRectangle {
     private double l,b;
    MainRectangle()
    {
        l=2.3;
        b=3.3;
    }
    MainRectangle(double l,double b)
    {
     this.l=l;
     this.b=b;
    }
    double findArea()
    {
        return l*b;
    }
    public static void main(String args[])
    {
      MainRectangle r1=new MainRectangle(12,13);  
            MainRectangle r2=new MainRectangle();  
            System.out.println("Area with parameterized Constructor"+r1.findArea());
                        System.out.println("Area with default Constructor"+r2.findArea());


    }
}
