package Inheritance;

public class Rectangle extends Quadrilateral implements Geo{
	public Rectangle(){
		super(10, 10, 10, 10);
	}
	public Rectangle(double Length, double Width){
		super(Length, Width, Length, Width);
	}
	public double area(){
		return super.getS2() * super.getS1();
	}
}

