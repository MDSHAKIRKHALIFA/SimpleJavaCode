package easyPart;

//to find the factorial numbers

public class FactorialNumber {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 1;
		
		for(int i=1;i<=a;i++) {
			 b = b*i;	
		}
		System.out.println("The factorial number is: "+b);
	}
}
