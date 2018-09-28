package mathOpp;

import java.util.Scanner;

public class Wall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = -999.9;
		double width = -999.9;
		double area = -999.9;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is the wall?");
		height = input.nextInt();
		System.out.println("How long is the width of the wall?");
		width = input.nextInt();
		area = height * width;
		System.out.println("The walls area = " + area + "feet^2");
	}

}
