package inputExamples;

import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int weight = -999;
int age = -999;
int lucky = -999;
Scanner input = new Scanner(System.in);
System.out.println("Enter your weight");
weight = input.nextInt();
System.out.println("You are " + weight +" lbs");
System.out.println("Enter your age");
age = input.nextInt();
System.out.println("Your are " + age + " Years old");
System.out.println("Enter your lucky number");
lucky = input.nextInt();
System.out.println("Your lucky number is " + lucky);
System.out.println("in the future...");
System.out.println("I see ...");
System.out.println(lucky + " years from now...");
System.out.println("You will reside number "+ age + weight);
System.out.println("at the old folks home.");
	}

}
