package Inheritance;

public class Parallelogram extends Quadrilateral implements Geo {
	private double height;

	public Parallelogram() {
		super(10,10,10,10);
		height = 10;
	}

	public Parallelogram(double side1, double side2, double ht) {
		super(side1, side2, side2);
		height = ht;
	}

	public double area() {
		return super.getS1() * height;
	}
}
