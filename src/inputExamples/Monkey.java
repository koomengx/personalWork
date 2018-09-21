package inputExamples;

import java.util.Scanner;

public class Monkey {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is an adult monkey");
		height = input.nextDouble();
		System.out.println("Adult Monkey = " + height + "inches");
	}

}
