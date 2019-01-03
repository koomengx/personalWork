package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] kids = new int[10][12];
		Random generator = new Random();
		for(int i = 0; i < 10; i++){
			for(int a = 0; a < 12; a++){
				if( 1 + generator.nextInt(3 - 1 + 1) != 3 ){
					kids[i][a] = 4 + generator.nextInt(6 - 4 + 1);
				}
			}
		}
	
	
	for(int i = 0; i < 10; i++){
		for(int a = 0; a < 12; a++){
			System.out.println(kids[i][a] + "\t");
		}
	}
	System.out.println();
	}}
