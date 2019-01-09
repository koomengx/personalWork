package InterfacesandPolymorphism;

import java.util.ArrayList;

public class StudentandTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<School> bob = new ArrayList<School>();
		bob.add(new Student());
		bob.add(new Teacher());
		bob.add(new Student());
		bob.add(new Teacher());
		bob.add(new Student());
		bob.add(new Teacher());
		Student tim = new Student();
		tim.setName("Joe Bob");
		bob.add(tim);
		for (School temp : bob) {
			System.out.println(temp.getName());
		}
		for (School temp : bob) {
			System.out.println(temp.getAge());
		}
		for(int i = 0; i < bob.size(); i++){
			if (bob.get(i) instanceof Student){
			Student tom = (Student)bob.get(i);
			tom.outSick();
			}
		}
	}

}
