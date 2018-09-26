package mathOpp;
import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int ssn = -999;
int finalfour = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
System.out.println("What is you Social Security Number with out the dashes?");
ssn = input.nextInt();
System.out.println("What are the last 4 digits of your Social Security Number?");
finalfour = input.nextInt();
System.out.println("You are " + age + " years old");
age = 18 - age;
System.out.println("You are " + age + " year(s) from 18" + " your SSN is " + ssn);
System.out.println("Your final 4 digits of your SSN is " + finalfour);
input.close();

	}

}
