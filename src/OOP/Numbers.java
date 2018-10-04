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
}
