package mathOpp;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = -999;
		int divisor = -999;
		int result = -999;
		int remainder = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the dividend and divisor?");
		dividend = input.nextInt();
		divisor = input.nextInt();
		result = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("The answer is " + result + "r" + remainder);

	}

}
