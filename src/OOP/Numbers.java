package OOP;

public class Numbers {
	public Numbers() {
	}

	public void sayNumber(double num) {
		System.out.println("Your number is: " + num);
	}

	public void sayNumberPlus2(double num) {
		num = num + 2;
		System.out.println("Your number plus 2 is: " + num);
	}
	public void saySum(double first, double second)
	{ 
		System.out.println("answer = " + (first + second));
	}
	public double returnSquare(double first)
	{
		double answer = first * first;
		System.out.println("answer = " + answer);
		return answer;
	}
	public double returnArea(double length , double width)
	{
		double area = length * width;
		System.out.println("Area = " + area);
		return area;
	}
	public int returnRoundUp(double num)
	{
		int temp = (int)Math.ceil(num);
		System.out.println("Answer = " + temp);
		return temp;
	}
}
