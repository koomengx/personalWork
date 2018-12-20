package DesigniingClasses;

import java.util.Scanner;
import java.util.Random;

public class SequentialsearchPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int[] number = new int[100];
		for(int i = 0;i < 100; i++){
			number[i] = 0 + generator.nextInt(499 - 1 + 1);
		}
		System.out.println("What is your number?");
		int choice = input.nextInt();
		int instance = 0;
		for(int i = 0; i < 100; i++){
			if(number[i] == choice){
				instance++;
			}
		}
		System.out.println("Your number is in the array " + instance + " Time(s)");
	}

}
