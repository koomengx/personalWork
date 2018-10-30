package Loops;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Cube While Loops
		int num = 0;
		int cube = 0;
		
		System.out.println("Pick a number to cube");
		num = input.nextInt();
		
		while (num != -1){
			cube = num * num * num;
			System.out.println(num + " cubed is ");
			break;
		}
		System.out.println(cube);
	}

}
