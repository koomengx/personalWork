package Arrays;

import java.util.Scanner;
import java.util.Random;

public class ArraysPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int[] Test = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Test Score");
			Test[i] = input.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Test[i]);
		}
		*/
		/*
		int[] Test = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Test Score");
			Test[i] = input.nextInt();
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Test[i]);
			int sum += Test[i];
		}
		*/
		/*0
		int[] Test = new int[5];
		final int maxStudents = 5;
		for (int i = 0; i < maxStudents; i++) {
			System.out.println("Test Score");
			Test[i] = input.nextInt();
		}
		for (int i = maxStudents - 1; i >= 5; i--) {
			System.out.println(Test[i]);
		}
		*/
		Random generator = new Random();
		int[] scores = new int[250];
		int min = 0;
		int max = 1000;
		int randomNum = 0;
		for(int i=0; i<250; i++){
			scores[i] = min + generator.nextInt(max - min + 1);
		}
	}

}
