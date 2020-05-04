package easyPart;

//java program to multiply two floating numbers declaring and getting from user

import java.util.Scanner;

public class MultipleTwoFloatNumbers {

	public static void main(String[] args) {
//		float a = 5.5f;
//		float b = 5.44f;
//		float sum = a*b;
//		System.out.println(sum);
		
		//to get from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1st float number: ");
		float c = sc.nextFloat();
		System.out.println("Please enter 2nd float number: ");
		float d = sc.nextFloat();
		System.out.println("The answer is: "+(c*d));
	}

}
