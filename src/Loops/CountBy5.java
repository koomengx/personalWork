package Loops;

import java.util.Scanner;

public class CountBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 5;
		int multiple = 0;
	
		System.out.println("The multiples of 5 less than 49 is");
		while ( num <= 49){
		System.out.println( num);
		num = num + 5;
		}
	}

}
