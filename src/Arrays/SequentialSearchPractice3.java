package Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class SequentialSearchPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> number = new ArrayList<Rectangle>();
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		for (int i = 0; i < 100; i++){
			int length = 0 + generator.nextInt(400 - 0 + 1);
			int width = 0 + generator.nextInt(400 - 0 + 1);
			number.add(new Rectangle(length, width));
		}
		int sum = 0;
		for (Rectangle x : number){
			if(x.getWidth() == 10){
				sum++;
			}
		}
		System.out.println(sum + " Rectang le objects have a width of 10");
	}

}
