package mathOpp;
import java.util.Scanner;
public class VolumeofaSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius = -999.9;
double volume = -999.9;
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the sphere?");
radius = input.nextDouble();
volume = (4/3) * Math.PI * (radius * radius * radius);
System.out.println("The volume of the cube is " + volume);
	}

}
