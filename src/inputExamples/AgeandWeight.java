package inputExamples;

import java.util.Scanner;

public class AgeandWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		int weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("You are " + age + " Years Old");
		System.out.println("What is your weight?");
		weight = input.nextInt();
		System.out.println("You are " + weight + " lbs");
	}

}
