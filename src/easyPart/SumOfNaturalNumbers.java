package easyPart;

import java.util.Scanner;

//sum of the natural numbers
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		//int sum = 100;
		
		System.out.println("Enter number to calculate: ");
		Scanner nNum = new Scanner(System.in);
		int sum = nNum.nextInt();
		
		int num = 0;
		
		for(int i=1;i<=sum;++i) {
			num=num+i;
		}
		System.out.println("The natural numbers of the entered number is: "+num);
		
	}
}
