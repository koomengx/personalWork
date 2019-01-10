package Inheritance;

public class Quadrilateral {
	private int s1;
	private int s2;
	private int s3;
	private int s4;

	public Quadrilateral() {
		s1 = 5;
		s2 = 6;
		s3 = 7;
		s4 = 8;
	}

	public Quadrilateral(int xS1, int xS2, int xS3, int xS4) {
		s1 = xS1;
		s2 = xS2;
		s3 = xS3;
		s4 = xS4;

	}
	public void setS1(int xS1){
		s1 = xS1;
	}
	public void setS2(int xS2){
		s2 = xS2;
	}
	public void setS3(int xS3){
		s3 = xS3;
	}
	public void setS4(int xS4){
		s4 = xS4;
	}
	public int getS1(){
		return s1;
	}
	public int getS2(){
		return s2;
	}
	public int getS3(){
		return s3;
	}
	public int getS4(){
		return s4;
	}
	public double perimeter(){
		return s1 + s2 + s3 + s4;
	}
}
