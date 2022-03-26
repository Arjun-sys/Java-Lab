package exam_lab_question;
class Shape
{
void draw()
{
System.out.println("Shape draw()");
}
void erase()

{
System.out.println ("Shape erase()");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println ("Circle draw()");
}
void erase()
{
System.out.println ("Circle erase()");
}
}
class Triangle extends Shape
{
void draw()
{
System.out.println("Triangle draw()");
}
void erase()
{
System.out.println ("Triangle erase()");
}
}
class Square extends Shape
{
void draw()
{
System.out.println ("Square draw()");
}
void erase()
{
System.out.println ("Square erase()");
}
}
public class Shapes
{
public static void main (String arg[])
{
Shape s = new Shape();
s.draw();
s.erase();
s=new Triangle();
s.draw(); 
s.erase();
s=new Circle();
s.draw(); 
s.erase();
s=new Square();
s.draw(); 
s.erase();
} }