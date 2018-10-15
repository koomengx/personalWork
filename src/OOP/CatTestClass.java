package OOP;

public class CatTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat bob = new Cat(); 
bob.getsleepMore();
bob.setsleepMore(7);
System.out.println("the cat needs " + bob.getsleepMore() + " more hours of sleep");
bob.getsleepLess();
bob.setsleepLess(3);
System.out.println("the cat needs " + bob.getsleepLess() + " less hours of sleep");
	}

}
