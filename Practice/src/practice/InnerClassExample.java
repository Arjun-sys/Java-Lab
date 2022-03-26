/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


class InnerClassExample{
 private int data=30;
 class Inner{
  void msg(){System.out.println("data is "+data);}
 }
 
 void display(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[]){
  InnerClassExample obj=new InnerClassExample();
  obj.display();
 }
}
