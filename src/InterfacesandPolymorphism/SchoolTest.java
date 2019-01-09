package InterfacesandPolymorphism;

import java.util.Scanner;


public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input  = new Scanner(System.in);
School dude = new Teacher();
System.out.println("Teacher info: ");
System.out.println(dude.getName());
System.out.println(dude.getAge());
dude = new Student();
System.out.println("Student info: ");
System.out.println(dude.getName());
System.out.println(dude.getAge());
	}

}
