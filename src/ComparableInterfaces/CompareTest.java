package ComparableInterfaces;


import java.util.Random;
import java.util.ArrayList;
public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random gen = new Random();
WorkerStart[] people = new WorkerStart[100];
for(int i =0; i < 100; i++){
	people[i] = new WorkerStart(gen.nextInt(60),gen.nextDouble()*150);
	WorkerStart smallest = people[0];
	WorkerStart largest = people[0];
	for(WorkerStart temp : people){
		if(temp.compareTo(smallest)<0)
			smallest = temp;
			if(temp.compareTo(smallest)<0)
				largest = temp;
	}
	System.out.println("Smallest Worker: ");
	System.out.println("Hours: " + smallest.getHours());
	System.out.println("Rate: "+ smallest.getRate());
	System.out.println("Largest Worker: ");
	System.out.println("Hours: " + largest.getHours());
	System.out.println("Rate: "+ largest.getRate());
	
}
	}

}
