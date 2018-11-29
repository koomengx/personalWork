package SplitMethod;

import java.util.Scanner;
import java.util.Random;

public class SplitMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/*
		System.out.println("Write a sentence");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		for( int i = 0; i < words.length; i++){
			System.out.println(words[i].charAt(0));
		}
		*/
		/*
		System.out.println("Write a sentence");
		String sentence = input.nextLine();
		System.out.println("What is the keyword?");
		String keyword = input.nextLine();
		String[] words = sentence.split(" ");
		int appear = 0;
		for(int i = 0; i < words.length; i++){
			if(words[i].contains(keyword) ==  true){
				appear++;
			}
		}
		System.out.println("The keyword "+ keyword + " appears " + appear + " Times ");
	*/
		System.out.println("Write a sentence");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("A random words is: " + words[0 + generator.nextInt(words.length - 1 - 0 + 1)]);

		
	}

}
