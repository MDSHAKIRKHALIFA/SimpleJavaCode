package easyPart;

//Java program to print two integer by declaring and getting from user

import java.util.Scanner;

public class AddingTwoInteger {

	public static void main(String[] args) {
		
//		int a = 66;
//		int b = 99;	
//		int sum=a+b;
//		
//		System.out.println("The sum number of two integer is : "+sum);
		
		//to get user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st int number: ");
		int c = sc.nextInt();
		System.out.println("Please enter 2nd int number: ");
		int d = sc.nextInt();
		
		int sumNum = c+d;
		System.out.println("The sum number of two integer is : "+sumNum);
		

	}

}
