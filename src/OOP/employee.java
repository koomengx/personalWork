package OOP;

public class employee {
	private double wage;
	private double experience;
	private double raise;
	public employee() {
		wage = -999.9;
		experience = -999.9;
		raise = 999.9;
	}
public double getWage(){
	return wage;
	
}
public void setWage(double xWage){
	wage = xWage;
}
public double getExperience(){
	return experience;
}
	public void sayHello() {
		System.out.println("Hello");
	}
}
