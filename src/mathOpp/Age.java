package mathOpp;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("what is your age?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("Seven years from now you will be " + age + " years old");

	}

}
