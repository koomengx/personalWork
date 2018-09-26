package mathOpp;

import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int area = -999;
int middledigits = -999;
int lastdigits = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the area code of your phone number?");
area = input.nextInt();
System.out.println("What are the middle 3 digits of your phone number?");
middledigits = input.nextInt();
System.out.println("What are the last 4 digits of your phone number?");
lastdigits = input.nextInt();
System.out.println("Your phone number is " + area + middledigits + lastdigits);
System.out.println("Your area code is " + area);
System.out.println("Your middle digits are " + middledigits);
System.out.println("Your last digits are " + lastdigits);
	}

}
