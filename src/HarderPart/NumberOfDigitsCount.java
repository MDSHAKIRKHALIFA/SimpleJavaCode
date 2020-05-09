package HarderPart;

public class NumberOfDigitsCount {

	public static void main(String[] args) {
		long num = 12388888888884l;
		int count = 0;
		
		while(num !=0) {
			num=num/10;
			++count;
		}
		System.out.println("Number of digits are : "+ count);

	}

}
