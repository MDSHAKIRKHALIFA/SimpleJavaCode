package HarderPart;

public class CalculatePowerOfNumber {

	public static void main(String[] args) {
		int base = 2;
		int exponent =40;
		
		long result = 1;
		
		while (exponent !=0) {
			result *= base;
			--exponent;
		}
		System.out.println(result);
		
		//this way only support double value how ever we can initiate int number 
		//it will convert to double
		//but it can handle certain amount of numbers
		
		//System.out.println("The result of exponent is : "+Math.pow(base, exponent));
	}
}