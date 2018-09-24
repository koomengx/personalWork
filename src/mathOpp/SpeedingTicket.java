package mathOpp;

import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int speed = -999;
int price = -999;
int limit = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the Speed Limit?");
limit = input.nextInt();
System.out.println("How many mph were you above the speed limit?");
speed = input.nextInt();
price = 55 + (speed * 40);
System.out.println("Your ticket costs " + price + " dollars");
	}

}
