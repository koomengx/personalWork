package RandomNumbers;
import java.util.Random;
public class RussianFishing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 26;
		int max = 43;
		int randomNum = 0;
		int count = 0;
		int greaterThan3 = 0;

		for (count = 1; count <= 248; count++) {
			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum / 12 < 3) {
				greaterThan3++;
			}
		}
		System.out.println(greaterThan3 + " chidren are taller than 3 feet");
	}

}
