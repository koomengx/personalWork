package Arrays;

import java.util.Scanner;

import javafx.scene.shape.Shape;

import java.util.Random;
import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		ArrayList<Rectangle> names = new ArrayList<Rectangle>();
		int one = 0;
		for (one = 0; one < 400; one++) {
			int length = 50 + generator.nextInt(70 - 50 + 1);
			int width = 50 + generator.nextInt(70 - 50 + 1);
			names.add(one, new Rectangle(length, width));
		}
		Rectangle trash = names.remove(0 + generator.nextInt(names.size() - 1 - 0 + 1));
		System.out.println("Length of the removed rectangle is: " + trash.getLength());
		for (one = 0; one < names.size(); one++) {
			System.out.println(names.get(one).area());
		}
		System.out.println("Removing the last rectangle and setting it to the first element...");
		names.set(0, names.get(names.size() - 1));
		for(one = 0; one < names.size(); one++){
			System.out.println(names.get(one).area());
		}

	}

}
