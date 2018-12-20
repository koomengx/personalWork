package DesigniingClasses;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class SequentialSearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Random generator = new Random();
		for(int i = 0; i < 1000; i++){
			scores.add(400 + generator.nextInt(1000 - 400 + 1));
		}
		System.out.println("What is the score?");
		int search = input.nextInt();
		boolean match = false;
		for(int i = 0; i < 1000; i++){
			if(scores.get(i) == search){
				match = true;
				break;
			}
		}
		System.out.println("Score in the ArrayList: " + match);
	}

}
