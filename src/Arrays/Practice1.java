package Arrays;

import java.util.Scanner;
import java.util.ArrayList;


public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int one = 0 ;
		for(one = 0; one < 6; one++){
			System.out.println("Add student Name");
			names.add(input.nextLine());
		}
		names.remove(0);
		names.remove(names.size() - 1);
		for(one = 0; one < names.size(); one++){
			System.out.println(names.get(one));
		}
		
	}

}
