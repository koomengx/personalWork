package RandomNumbers;

import java.util.Random;

public class thirteensideddie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 1;
		int max = 13;
		int randomNum = 0;
		int count = 0;
		int multiple = 0;

		for (count = 1; count <= 87; count++) {
			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0) {
				multiple++;
			}
		}
		System.out.println("The dice was rolled 87 times. It landed on a multiple of 3 " + multiple + " times");
	}

}
