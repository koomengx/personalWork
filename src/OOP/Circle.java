package OOP;

public class Circle {
	private double radius;

	public Circle() {
		radius = -999.9;

	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double xRadius){
		radius = 2 * Math.PI * xRadius;
	}
}
