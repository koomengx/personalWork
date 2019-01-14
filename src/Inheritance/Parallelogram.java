package Inheritance;

public class Parallelogram extends Quadrilateral implements Geo {
	private double height;

	public Parallelogram() {
		super(10,10,10,10);
		height = 10;
	}

	public Parallelogram(double side1, double side2, double ht) {
		super(side1, side2, side1, side2);
		height = ht;
	}

	public double area() {
		return super.getS1() * height;
	}
	public String toString(){
	return "Parallelogram with sides" + super.getS1() + " " + super.getS2() + " " + super.getS3() + " " + super.getS4();
}
}