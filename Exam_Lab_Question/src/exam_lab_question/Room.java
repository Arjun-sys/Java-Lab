/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
import java.util.Scanner;
public class Room {

    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;
  public void setData(int rno, String rt, double area, boolean ac) 
 { 
 roomNo = rno; 
 roomType = rt; 
 roomArea = area; 
 acMachine = ac; 
 }

//    public void setdata() {
//
//        //Create scanner object and read the value from the console  
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the room details ");
//        System.out.print("Enter room number: ");
//        roomno = scan.nextInt();
//        System.out.print("Enter room area in sq.ft: ");
//        roomarea = scan.nextFloat();
//        System.out.print("Enter the type of room: ");
//        roomtype = scan.next();
//        System.out.print("Does the room have ACmachine:true or false : ");
//        ACmachine = scan.nextBoolean();
//        scan.close();
//
//    }

    public void displayData() {
        System.out.println("The details of room:");  
        System.out.println("The room No is " + roomNo);
        System.out.println("The area of room is " + roomArea + "sq.ft");
        System.out.println("The type of room is  " + roomType);
        if (acMachine ==true) {
            System.out.println(acMachine + ",the room has ACmachine ");
        } else if(acMachine==false)
        {
            System.out.println(acMachine + ",the room has no ACmachine ");
        }
    }

    public static void main(String[] args) {
        Room myObj = new Room();
        myObj.setData(1234,"Normal",234.55,true);
        myObj.displayData();

    }
}
