package DesigniingClasses;

import java.util.Scanner;

public class SumTheNumbers {
	public static void sum(int num) {
		int big = 0;
		if (num > 0) {
			big += num;
			System.out.println(num);
			sum(num - 1);
		}
		
		System.out.println(big);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number");
		int num = input.nextInt();
		sum(num);
	}

}
