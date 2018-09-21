package inputExamples;

import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int year = -999;
int month = -999;
int day = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the month? ");
month = input.nextInt();
System.out.println("What is the day? ");
day = input.nextInt();
System.out.println("What is the year?");
year = input.nextInt();
System.out.println("The date is " + month + "/" + day + "/" + year);
	}

}
