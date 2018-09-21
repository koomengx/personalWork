package mathOpp;

import java.util.Scanner;

public class ageofFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = -999;
		int friend1 = -999;
		int friend2 = -999;
		int friend3 = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What are the ages of your 3 friends?");
		friend1 = input.nextInt();
		friend2 = input.nextInt();
		friend3 = input.nextInt();
		sum = friend1 + friend2 + friend3;
		System.out.println("The sum of your 3 friends ages is " + sum);
	}

}
