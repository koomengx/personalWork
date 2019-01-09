package InterfacesandPolymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class CircleandRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces bob = new Rectangle(5, 10);
		Interfaces tim = new Circle(10);
		ArrayList<Interfaces> shapes = new ArrayList<Interfaces>();
		shapes.add(bob);
		shapes.add(tim);
		shapes.add(new Rectangle(4, 6));
		double sum = 0;
		for (int i = 0; i < shapes.size(); i++) {
			sum += shapes.get(i).area();
		}
		System.out.println(sum);
		double smallest = 0;
		for (int a = 0; a < shapes.size(); a++) {
			if (shapes.get(a).perimeter() < smallest) {

			}
		}
	}

}
