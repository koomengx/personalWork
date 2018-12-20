package DesigniingClasses;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class SequentialSearchPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int[] number = new int[100];
		int min = 1;
		int max = 10000;
		for(int i = 0; i < number.length; i++){
			number[i] = 1 + generator.nextInt(max - min + 1);
		}
		System.out.println("Pick a number 1-10000");
		int choice = input.nextInt();
		int instance = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] == choice){
				instance++;
			}
		}
		System.out.println("Your number appears " + instance + " Times");
	}

}
