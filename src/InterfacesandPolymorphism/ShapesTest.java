package InterfacesandPolymorphism;

import java.util.Scanner;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Interfaces bob = new Rectangle();
		System.out.println("What is the length?");
		int length = input.nextInt();
		System.out.println("What is the Width?");
		int width = input.nextInt();
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		System.out.println("What is the radius?");
		Interfaces tim = new Circle();
		System.out.println("Perimeter: " + tim.perimeter());
		System.out.println("Area: " + tim.area());
	}

}
