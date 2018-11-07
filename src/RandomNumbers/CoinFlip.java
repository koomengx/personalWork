package RandomNumbers;

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 1;
		int max = 2;
		int randomNum = 0;
		int count = 0;
		int heads = 0;
		
		for (int i = 1; i <=100000; i++)
		{
			randomNum = min + generator.nextInt(max - min + 1);
		}
		
		
	}

}
