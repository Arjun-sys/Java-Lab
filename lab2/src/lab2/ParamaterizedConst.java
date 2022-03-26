/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author admin
 */
public class ParamaterizedConst {
    String Names;
    int Ages;
    ParamaterizedConst(String name,int age)
    {
        Names=name;
        Ages=age;
        System.out.println(Names+","+Ages);
    }
     public static void main(String[] args)
    {
        ParamaterizedConst obj=new ParamaterizedConst("Arjun",22);
        ParamaterizedConst obj1=new ParamaterizedConst("Nikita",22);
        
    }
    
}
