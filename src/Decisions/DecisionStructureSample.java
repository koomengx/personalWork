package Decisions;

import java.util.Scanner;

public class DecisionStructureSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 999;
		System.out.println("How many people are going on the trip?");
		people = input.nextInt();
		int cost = 200 * people;
		System.out.println("Would you like to go to the museum?(1 = yes, 0 = no)");
		int choice = input.nextInt();
		if ( choice == 1) {
			cost = cost + people * 40;
		}
		System.out.println("Would you like to go to the zoo?(1 = yes, 0 = no)");
		choice = input.nextInt();
		if ( choice == 1) {
			cost = cost + people * 35;
		}
		System.out.println("The Trip will cost $" + cost);
	}

}
