package Decisions;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int counter = 0;
		int num = 0;
		System.out.println("What is your favorite number?");
		num = input.nextInt();
		for (counter = 1; counter <= 10; counter++) {
			System.out.println(num + " Hello");
		}
		
	}

}
