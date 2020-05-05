package easyPart;

import java.util.Scanner;

public class QuotientsAndReminder {

	public static void main(String[] args) {
//		int dividend1 = 30;
//		int divisor1 = 3;
//		
//		int Quotients1 = dividend1/divisor1;
//		int remainder1 = dividend1%divisor1;
//		
//		System.out.println("The Quotients is : "+Quotients1);
//		System.out.println("The remainder is: "+remainder1);
		
		Scanner qr = new Scanner(System.in);
		
		System.out.println("Enter dividend number: ");
		int dividend2 = qr.nextInt();
		
		System.out.println("Enter divisor number: ");
		int divisor2 = qr.nextInt();
		
		int Quotients2 = dividend2/divisor2;
		int remainder2 = dividend2%divisor2;
		
		System.out.println("The Quotients is : "+Quotients2);
		System.out.println("The remainder is: "+remainder2);

		
		
	}

}
