package Inheritance;

import java.util.ArrayList;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Geo> bob = new ArrayList<Geo>();
		bob.add(new Rectangle(5,10));
		bob.add(new Trapezoid(12, 8, 3, 5));
	}

}
