package mathOpp;

import java.util.Scanner;

public class YearstoVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		age = 18 - age;
		System.out.println("You have " + age + " years until you can vote");
	}

}
