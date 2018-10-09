package OOP;

public class Greeter {
	private int age;
	public Greeter() {
		age = -999;
	}
public int getAge(){
	return age;
}
public void setAge(int xAge){
	age = xAge;
}
	public void sayHello() {
		System.out.println("Hello");
	}
}