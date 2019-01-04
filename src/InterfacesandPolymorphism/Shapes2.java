package InterfacesandPolymorphism;

import java.util.Scanner;

public class Shapes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		int length = input.nextInt();
		System.out.println("What is the Width?");
		int width = input.nextInt();
		Rectangle bob = new Rectangle(length, width);
		Interfaces tim = bob;
		System.out.println(bob.getLength());
		System.out.println(tim.area());
	}

}
