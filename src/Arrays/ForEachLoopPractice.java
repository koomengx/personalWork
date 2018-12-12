package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEachLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> students = new ArrayList<Integer>();
		System.out.println("How many students in your class?");
		int choice = input.nextInt();
		for(int i =0; i < choice; i++){
			System.out.println("How old is the student?");
			students.add(input.nextInt());
		}
		int sum = 0;
		for(Integer age : students){
			sum += age;
		}
		double average = (double) sum / (double) choice;
		System.out.println("The average is: " + average);
	}

}
