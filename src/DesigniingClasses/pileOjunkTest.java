package DesigniingClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class pileOjunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<pileOjunk> junk = new ArrayList<pileOjunk>();
		System.out.println("How many objects?");
		int choice = input.nextInt();
		input.nextLine();
		for(int i = 0; i < choice; i++){
			System.out.println("What is the ID?");
			junk.add(new pileOjunk(input.nextInt()));
		}
		System.out.println("What are the two number to add?");
		int one = input.nextInt();
		int two = input.nextInt();
		System.out.println(junk.get(0).add(one, two));
		System.out.println(junk.get(0).overwrite(12));
	}

}
