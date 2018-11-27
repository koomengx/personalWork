package Arrays;

import java.util.Scanner;
import java.util.Random;

public class ArraysPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int[] Test = new int[5];
		for (int i = 0; i < Test.length; i++) {
			System.out.println("Test Score");
			Test[i] = input.nextInt();
		}
		for (int i = 0; i < Test.length; i++) {
			System.out.println(Test[i]);
		}
		*/
		/*
		int[] Test = new int[5];
		for (int i = 0; i < Test.length; i++) {
			System.out.println("Test Score");
			Test[i] = input.nextInt();
			
		}
		for (int i = 0; i < Test.length; i++) {
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
		/*
		Random generator = new Random();
		int[] scores = new int[250];
		int min = 0;
		int max = 1000;
		int randomNum = 0;
		for(int i=0; i<250; i++){
			scores[i] = min + generator.nextInt(max - min + 1);
		}
		*/
		/*
		int numNames = 20;
		String[] names = new String[numNames];
		for(int i = 0; i < names.length; i++){
			System.out.println("Name:");
			names[i] = input.nextLine();
		}
		for(int a = names.length - 1; a >= 0; a--){
			System.out.println(names[a]);
		}
		*/
		/*
		int numNames = 20;
		String[] names = new String[numNames];
		for(int i = 0; i < names.length; i++){
			System.out.println("Name:");
			names[i] = input.nextLine();
		}
		System.out.println("What letter to you want to look up?");
		String letter = input.nextLine();
		for(int a = 0; a < names.length; a++){
			if(names[a].endsWith(letter.substring(0, 1))){
			System.out.println("The names: " + names[a] +" ends with " + letter);
			}
			*/
		int numNames = 5;
		String[] names = new String[numNames];
		for(int i = 0; i < names.length; i++){
			System.out.println("Name:");
			names[i] = input.nextLine();
		}
		System.out.println("Select a desired character length for the names");
		int length = input.nextInt();
		int match = 0;
		for (int a = 0;a < names.length; a++){
			if(names[a].length() == length){
				match++;
			}
		}
	System.out.println( match + " of your friend names matched the length!");

}}
