package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Rectangle[] rectangle = new Rectangle[100];
		Random generator = new Random();
		int min = 10;
		int max = 56;
		int randomNum = 0;
		int width = 999;
		int length = 999;
		for (int i = 0; i < rectangle.length; i++) {
			width = min + generator.nextInt(max - min + 1);
			length = min + generator.nextInt(max - min + 1);
			rectangle[i] = new Rectangle(length, width);
		}
		for (int a = 0; a < rectangle.length; a++) {
			System.out.println("Rectangle: " + a);
			System.out.println("Length: " + rectangle[a].getLength());
			System.out.println("Width: " + rectangle[a].getWidth());
			System.out.println("Area: " + rectangle[a].area());
		}
		
	}

}
