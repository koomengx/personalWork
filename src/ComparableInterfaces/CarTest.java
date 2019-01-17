package ComparableInterfaces;

import java.util.ArrayList;
import java.util.Random;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen = new Random();
ArrayList<Cat> bob = new ArrayList<Cat>();
for(int i = 0; i < 100; i++){
	bob.add(new Cat(gen.nextInt(20), gen.nextInt(24)));
}
Cat smallest = bob.get(0);
Cat largest = bob.get(0);
for(Cat temp : bob){
	if(temp.compareTo(smallest)<0)
smallest = temp;
	if(temp.compareTo(largest)>0)
		largest = temp;
}
System.out.println("Smallest Cat:" );
System.out.println("Age: " + smallest.getAge());
System.out.println("Sleep: " + smallest.getSleep());
System.out.println("Largest Cat: ");
System.out.println("Age: " + largest.getAge());
System.out.println("Sleep: " + largest.getSleep());

	}

}
