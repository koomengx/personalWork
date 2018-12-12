package Arrays;

import java.util.Scanner;
import java.util.ArrayList;


public class ForEachLoopPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Circle> circle = new ArrayList<Circle>();
		for(int i = 0; i < 10; i++){
			System.out.println("What is the radius of the circle?");
			circle.add(new Circle(input.nextDouble()));
		}
	for(Circle ball : circle){
		System.out.println("Area: " + ball.area());
		
	}
	}
}
