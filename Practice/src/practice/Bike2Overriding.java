/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
class Vehicle{
  void run(){System.out.println("Vehicle is running");}
  }
  class Bike2 extends Vehicle{
  void run(){
super.run();
System.out.println("Bike is running safely");}

  public static void main(String args[]){
  Bike2 obj = new Bike2();
  obj.run();
  }
}
