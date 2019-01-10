package Inheritance;

public class Rectangle extends Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	public Rectangle(){
		
	}
	public Rectangle(double xS1, double xS2, double xS3, double xS4){
		s1 = xS1;
		s2 = xS2;
		s3 = xS3;
		s4 = xS4;
	}
	public double area(){
		return s1 * s2;
	}
}
