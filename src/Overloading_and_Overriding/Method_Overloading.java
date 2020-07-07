package Overloading_and_Overriding;

public class Method_Overloading {

	
	// Two method with same name and different parameters in same class
	// Is called mthod overloading
	
	public static void main(String[] args) {
		method("Shakir");
		method("Hasan", "12345");
	}
	
	public static void method(String name, String Id) {
		System.out.println(name +" "+Id);
	}
	
	public static void method(String name) {
		System.out.println(name);
	}

}
