package Arrays;

import java.util.Scanner;
import java.util.Random;

public class MultiDimensionalArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		/*
		 * final int maxRow = 24; final int maxColumn = 10; double num[][] = new
		 * double[maxRow][maxColumn]; for (int i = 0; i < maxRow; i++){ for(int
2		 * a = 0; a < maxColumn; a++ ){ num[i][a] =
		 * (generator.nextInt(100-1+1)); } } for (int i = 0; i < maxRow; i++){
		 * for(int a = 0; a < maxColumn; a++ ){ System.out.print(num[i][a] +
		 * "\t"); } } System.out.println();
		 */
		/*
		final int MAXROW = 3;
		final int MAXCOL = 7;
		int sum = 0;
		int num[][] = new int[MAXROW][MAXCOL];
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num.length; a++) {
				num[i][a] = 0 + generator.nextInt(100 - 1 + 1);
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num.length; a++) {
				sum += num[i][a];
			}
		}
		System.out.println("Sum: " + sum);
	*/
		/*
		int[][][] numbers = new int[3][7][9];
		int one = 0;
		int two = 0;
		int three = 0;
		int sum = 0;
		for (one = 0; one < numbers.length; one++) {
			for (two = 0; two < numbers[0].length; two++) {
				for (three = 0; three < numbers[0][0].length; three++) {
					numbers[one][two][three] = 0 + generator.nextInt(50 - 0 + 1);
				}
			}
		}
		for(one = 0; one < numbers.length; one++){
			for(two = 0; two < numbers[0].length; two++){
				for(three = 0; three < numbers[0][0].length; three++){
					sum += numbers[one][two][three];
	
				}
			}
	}
		System.out.println(sum);
*/
		
		String[][] names = new String[4][3];
		int one = 0;
		int two = 0;
		for(one = 0; one < names.length; one++){
			for(two = 0; two < names[0].length; two++){
				System.out.println("What is the person's name?");
				names[one][two] = input.nextLine();
			}
		}
		for( one = 0; one < names.length; one++){
			for(two = 0; two < names[0].length; two++){
				System.out.println(names[one][two].length() + " ");
			}
		System.out.println();
		}

		
	}
	
}