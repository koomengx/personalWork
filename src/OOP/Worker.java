package OOP;

public class Worker {
	private int hours;
	private double rate;

	public Worker() {
		hours = -999;
		rate = -999.9;
	}
	public int getHours(){
		return hours;
	}
	public double getRate(){
		return rate;
	}
	public void setHours(int xHours){
		hours = xHours;
	}
	public void setRate(double xRate){
		rate = hours * xRate;
	}
	
}
