package javaassignment;

abstract Shapes_java {
	{
		abstract void draw(); 
	}
class Rectangle extends Shapes 
{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
	
}
class Line extends Shapes
{
	void draw()
	{
		System.out.println("Draw Line");
	}
}
class Cube extends Shapes 
{
	void draw()
	{
		System.out.println("Draw Cube");
	}
}
public class Shapes
{
	public static void main(String[]args)
	{
		Shapes s;
		s=new Rectangle();
		s.draw();
		s=new Line();
		s.draw();
		s=new Cube();
		s.draw();
		
	}
}
 
