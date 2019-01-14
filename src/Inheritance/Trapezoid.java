package Inheritance;

public class Trapezoid extends Quadrilateral implements Geo {
	private double height;

	public Trapezoid() {
		super(10, 10, 10, 10);
		height = 4;
	}

	public Trapezoid(double top, double right, double bottom, double left, double ht){
		super(top, right, bottom, left,);
		height = ht;
	}

}
