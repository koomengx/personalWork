package Decisions;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("What is your Age"); int age = 999; age =
		 * input.nextInt(); // Compare age
		 * System.out.println(" what is your height (in inches) and shoe size?"
		 * ); double height = 999.9; double shoe = 999.9; height =
		 * input.nextDouble(); shoe = input.nextDouble();
		 * System.out.println(shoe > 9); System.out.println(height < 62); //
		 * Height and shoe size int pets = 999; int cars = 999;
		 * System.out.println("How many pets do you have?"); pets =
		 * input.nextInt();
		 * System.out.println("How many cars will fit in your garage?"); cars =
		 * input.nextInt(); System.out.println(pets <= 5|| cars >3); // Pets and
		 * Cars int number = 15;
		 * 
		 * if(number <= 14){ System.out.println("Nice Job"); }
		 * System.out.println("What a Program!");
		 */
		/*
		 * double total = 25; char favLetter = 'Q'; if(favLetter == 'X'){
		 * System.out.println("Great job"); }
		 * System.out.println("What a program");
		 */
		/*
		  int score1 = 999; int score2 = 999;
		 System.out.println("What score did you get on the 1st test?"); 
		 score1 = input.nextInt();
		  System.out.println("What score did you get on the 2nd test?"); 
		  score2 = input.nextInt(); 
		  if(score1 > score2){ System.out.println("Great job for entering the score in the right order"); 
		  System.out.println("Have a nice da");
		  }
		 */
		/*
		int one = 1;
		int two = 2;
		int three = 3;
		System.out.println("List three numbers");
		one = input.nextInt();
		two = input.nextInt();
		three = input.nextInt();
		if(one > two && one  > three){
			System.out.println("The first number is the largest");
		}
		if(two > one && two  > three){
			System.out.println("The second number is the largest");
		}
		if(three > one && three  > two){
			System.out.println("The third number is the largest");
		}
		if(one == two || two ==three || one == three){
		System.out.println("All numbers are equal");
		} 
		THREE NUMBERS
		*/
		/*
		double gpa = 999.99;
		boolean senior = true;
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		System.out.println("Are you a Senior?");
		senior = input.nextBoolean();
		if(gpa <= 3.5 && senior == true){
			System.out.println("You have graduated with honors");
		}
		else
		{
			System.out.println("You have not graduated with honors");
		*/
		/*
		boolean adult = false;
		int lucky = 999;
		int weight = 999;
		int height = 999;
		System.out.println("Are you a kid or adult (true if you are an adult)?");
		adult = input.nextBoolean();
		if(adult == true){
			System.out.println("What is your height in inches?");
			height = input.nextInt();
			lucky = height * 5;
			System.out.println("your lucky number is " + lucky);
		}
		else
		{
			System.out.println("What is your weight in lbs?");
			weight = input.nextInt();
			lucky = weight * 2;
			System.out.println("your lucky number is " + lucky);
		}
		*/
		/*
		double money = -99.99;
		System.out.println("How much money did you earn for your fifth birthday?");
		money  = input.nextDouble();
		if(Math.abs(money - Math.sqrt(84.3))< 0.000001)
		{
			System.out.println("You won a good prize");
			System.out.println("Have fun having breakfast with Cinderela");
			
		}
		else
		{
			System.out.println("You won a bad prize");
			System.out.println("Smokey the Bear says you started the forest fire");
		}
		GOOD PRIZE VS BAD PRIZE
		*/
		/*
		int salary = 999;
		System.out.println("What is your salary?");
		salary = input.nextInt();
		if(salary<=20000 ){
			System.out.println("Worker");
		}
		else
		{
			if(salary<=40000){
				System.out.println("Managment");
			}
			else
			{
				if(salary<=100000){
					System.out.println("CEO");
				}
				else
				{
					System.out.println("Owner");
				}
			}
				
		}
		SALARY
		*/
		int test = 999;
		int homework = 999;
		boolean teacher = false;
		System.out.println("What is your average test score?");
		test = input.nextInt();
		System.out.println("What is your homework average?");
		homework = input.nextInt();
		System.out.println("Is your teacher nice?(true if they are)");
		teacher = input.nextBoolean();
		if(teacher == true && test > homework){
			System.out.println(test);
				}
		else
			if (teacher == true && test < homework){
				System.out.println(homework);
			}
			else
		if(teacher == false && test > homework){
			System.out.println(homework);
		}
		if(teacher == false && test < homework)
			System.out.println(test);
				
			}
		
	}
	


