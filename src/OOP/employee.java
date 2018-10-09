package OOP;

public class employee {
	private double wage;
	public employee() {
		wage = -999.9;
	}
public double getWage(){
	return wage;
}
public void setWage(double xWage){
	wage = xWage;
}
	public void sayHello() {
		System.out.println("Hello");
	}
}
