package mathOpp;
import java.util.Scanner;
public class NinjaMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int seconds = 999;
int number = 999;
int length = 999;
double average = 999.9;
int total = 999;
double minutes = 999.9;
Scanner input = new Scanner(System.in);
System.out.println("How many songs are there?");
number = input.nextInt();
System.out.println("What is the total length of the songs in seconds?");
length = input.nextInt();
average = length / number;
total = length / 60;
seconds = length % 60;
minutes = average / 60;
System.out.println("the average song length is " + minutes + " minutes");
System.out.println("The song length in minutes and seconds is " + total + " Minutes " + seconds + " Seconds");
		
	}

}
