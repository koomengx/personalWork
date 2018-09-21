package mathOpp;

import java.util.Scanner;

public class VolumeofaBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = -999.0;
		double length = -999.0;
		double width = -999.0;
		double volume = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the box");
		height = input.nextDouble();
		System.out.println("What is the length of the box");
		length = input.nextDouble();
		System.out.println("What is the width of the box");
		width = input.nextDouble();
		volume = height * length * width;
		System.out.println(" The volume of the box is " + volume);
	}

}
