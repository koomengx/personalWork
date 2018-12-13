package DesigniingClasses;

public class Greeter {
	private int age;
	private String name;
	public Greeter() {
		age = -999;
		name = "0";
	}
public int getAge(){
	return age;
}
public void setAge(int xAge){
	age = xAge;
}
public String getName(){
	return name;
}
public void setName(String xName){
	name = xName;
}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void displayInfo(){
		
	}
}