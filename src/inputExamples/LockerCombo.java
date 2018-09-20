package inputExamples;

import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = -999;
int second = -999;
int third = -999;
boolean yes = false;
Scanner input = new Scanner(System.in);
System.out.println("What is the first digit for your combination");
first = input.nextInt();
System.out.println("What is the second digit for your combination");
second = input.nextInt();
System.out.println("What is the third digit for your combination");
third = input.nextInt();
System.out.println("Your Combination is " + first + "-" + second + "-" + third + "?" );
yes = input.nextBoolean();
System.out.println(yes);
	}

}
