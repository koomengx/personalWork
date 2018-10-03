package OOP;
import java.util.Scanner;
public class Room {
public Room()
{
}
public void sayArea()
{
	double length = 999.9;
	double width = 999.9;
	double area = 999.9;
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length and width?");
	length = input.nextDouble();
	width = input.nextDouble();
	area = length * width;
	System.out.println("The area is " + area);
}
public void sayAreaWithDoor()
{
	double length = 999.9;
	double width = 999.9;
	double length2 = 999.9;
	double width2 = 999.9;
	double area = 999.9;
	double area2 = 999.9;
	double fullarea = 999.9;
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length and width of the wall?");
	length = input.nextDouble();
	width = input.nextDouble();
	System.out.println("What is the length and width of the door");
	length2 = input.nextDouble();
	width2 = input.nextDouble();
	area = length * width;
	area2 = length2 * width2;
	fullarea = area - area2;
	System.out.println("The area of the wall without the door is " + fullarea);
}
}
