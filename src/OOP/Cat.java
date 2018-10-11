package OOP;

/**
 * @author 20xiongk
 *
 */
public class Cat {
	private int age;
	private double sleep;
	private int month;
	private int day;
	private int year;
	public Cat(){
	age = 999;
	sleep = 999.9;
	month = 999;
	day = 999;
	year = 999;
	}
	public void sayBirthday(){
		System.out.println("The cat has a birthday");
	}
	public double getsleepMore(){
		return sleep;
	}
	public void setsleepMore(double xMore){
		sleep = xMore;
	}
	public double getsleepLess(){
		return sleep;
	}
	public void setsleepLess(double xLess){
		sleep = xLess;
}}
