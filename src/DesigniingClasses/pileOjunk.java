package DesigniingClasses;

import java.util.Scanner;
import java.util.Random;

public class pileOjunk {
	private int idNumber;
	private int number;
	Random generator = new Random();

	public pileOjunk(int newId) {
		idNumber = newId;
		number = 10 + generator.nextInt(100 - 10 + 1);
	}

	public int add(int one, int two) {
		int sum = one + two;
		return sum;
	}

	public int overwrite(int id) {
		number = idNumber;
		return number;
	}

	public int getID() {
		return number;
	}
	

}
