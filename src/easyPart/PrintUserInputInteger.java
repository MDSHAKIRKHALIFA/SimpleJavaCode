package easyPart;

//java program to print user entered integer number?

import java.util.Scanner;

public class PrintUserInputInteger {

	public static void main(String[] args) {
		Scanner  x = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
	
		int number = x.nextInt();
		
		System.out.println("Your Integer number is: "+number);

	}

}
