package easyPart;

public class CheckLeapYear {

	public static void main(String[] args) {
		int leapyear= 2004;
		
		if(leapyear%4==0|| leapyear%100==0|| leapyear%400==0) {
			System.out.println("The year is leap year and it has 366 days");
		}else
			System.out.println("The year is not leap year and it has 365 days");
	}

}
