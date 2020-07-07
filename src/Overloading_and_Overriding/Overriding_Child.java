package Overloading_and_Overriding;

public class Overriding_Child extends Overriding_Parent{

	public static void main(String[] args) {
		method("Hasan");
		method(1234);
		
		
	}
	
	public static void method(int Id) {
		System.out.println(Id);
	}

}
