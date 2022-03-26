package exam_lab_question; 
class Circle 
{ 
 double r; 
 void area() 
 { 
 System.out.println("Area of the circle = " + (3.14 * r * r)); 
 } 
} 
class Square 
{ 
 double s; 
 void area() 
 { 
 System.out.println("Area of the Square = " + (s * s)); 
 } 
} 
class Rectangle 
{ 
 double l,b; 
 void area() 
 { 
 System.out.println("Area of the circle = " + (l * b)); 
 } 
} 
import exam_lab_question.Circle; 
class Eg 
{ 
 public static void main(String a[]) 
 { 
 Circle c = new Circle(); 
 c.area(); 
 } 
} 