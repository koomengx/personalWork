package Strings;

import java.util.Scanner;

public class PracticeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("What is your age?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What is your name?");
			String name = input.nextLine();
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
	AGE AND NAME
	*/
		/*
		 System.out.println("Write a Sentence");
		 String sentence = input.nextLine();
		 sentence.charAt(0);
		 System.out.println(" The first letter of this sentence is: " + sentence.charAt(0));
		 System.out.println(" The third letter of this sentence is: " + sentence.charAt(2));
		 System.out.println("The full sentence is: " + sentence);
	WRITE A SENCTENCE
	*/
		/*
		System.out.println("Write a Sentence");
		String sentence = input.nextLine();
		if(sentence.contains("Bob")){
		boolean	 contains = true; 
		}
		System.out.println("The full sentence is: " + sentence);
		System.out.println("Does the sentence contain X?");
		System.out.println(contains);
	*/
		/*
		System.out.println("Enter 2 names: ");
		String name1 = input.next();
		String name2 = input.next();
		
		System.out.println("The first name is: " + name1);
		System.out.println("The second name is: " + name2);
		System.out.println("Comparison: " + name1.compareTo(name2)); 
	*/
		/*
		System.out.println("Write a sentence:");
		String sentence = input.nextLine();
		int character = sentence.length();
		int counter= 0;
		for(counter = 0; counter < character; counter++){
			System.out.println(sentence.charAt(counter));
		*/
		/*
		String sentence = "My name is Buzz Lightyear";
		for( int i = 0; i < sentence.length();i++){
			System.out.println(sentence.substring(i));
		*/
		/*
		System.out.println("First Name");
		String name1 = input.nextLine();
		System.out.println("Second Name");
		String name2 = input.nextLine();
		if(name1.compareToIgnoreCase(name2)< 0){
			System.out.println(name1.toUpperCase());
		
	}
		else {
			System.out.println(name2.toUpperCase());
		}
		*/
		/*
		int success = 0;
		int truee = 0;
		boolean match = false;
		
		System.out.println("Enter a password");
		String password = input.nextLine();
		System.out.println("Please verify it");
		String password2 = input.nextLine();
		while (password.equals(password2)){
			System.out.println("Password: ");
			password = input.nextLine();
			System.out.println("Verify:");
			password2 = input.nextLine();
		
		
		}
		*/
		/*
		System.out.println("Write A Sentence");
		String sentence = input.nextLine();
		for ( int i = 0; i < sentence.length(); i+= 4){
			System.out.println(sentence.charAt(i));
			
		}
	*/
		System.out.println("Write A Sentence");
		String sentence = input.nextLine();
		for ( int i = 0; i < sentence.length(); i++){
			if(sentence.charAt(i) == 'a' || sentence.charAt(i) == ' '){
			}
			else
			{
				System.out.println(sentence.charAt(i));
				
			}
			System.out.println();
			System.out.println("Original sentence: " + sentence);
		}}}
	
		


