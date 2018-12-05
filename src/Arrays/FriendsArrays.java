package Arrays;

import java.util.Random;
import java.util.Scanner;

public class FriendsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		Friend names[][] = new Friend[18][5];
		for (int i = 0; i < names.length; i++) {
			for (int a = 0; a < names[0].length; a++) {
				System.out.println("What is the name of your friend?");
				String name = input.nextLine();
				int age = 0 + generator.nextInt(100 - 0 + 1);
				names[i][a] = new Friend(name, age);
			}
		}
		for (int i = 0; i < names.length; i++) {
			for (int a = 0; a < names[0].length; a++) {
				System.out.println(names[i][a].getName() + " " + names[i][a].getAge() + " ");
			}
			System.out.println();
		}

	}

}
