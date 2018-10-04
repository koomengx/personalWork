package OOP;
import java.util.Scanner;
public class HomeImprovement {
public HomeImprovement()
{
}
public void sayPaint()
{
	Scanner input = new Scanner(System.in);
	double length = 999.9;
	double height = 999.9;
	double area = 999.9;
	double time = 999;
	System.out.println("What is the length and height of the wall?");
	length = input.nextDouble();
	height = input.nextDouble();
	area = length * height ;
	time = area / 200;
}
}
