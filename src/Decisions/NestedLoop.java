package Decisions;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

int counter = 1;
int process = 0;
 for (counter = 1; counter <= 4; counter++){
	 for (process = 1; process <= 5; process++){
		 System.out.print(process * counter + " ");
	 }
	 System.out.println();
 }  
/*
int counter = 0;
int process = 0;
 for (counter = 1; counter <= 4; counter++){
	 for (process = 1; process <= 5; process++){
		 if( process == 3){
			 
		 System.out.print(counter + " ");
		 }
		 else {
			 System.out.print(process + " ");
		 }
		 }
	 System.out.println();
 */} 
	}

