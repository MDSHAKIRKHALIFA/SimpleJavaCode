package string_Class;

public class Trim {

	public static void main(String[] args) {
		
		String s = "	Shakir";
		System.out.println("Before trim the Space: "+s);
		s = s.trim();
		System.out.println("After trim: "+s);
		
		String k = "	Khalifa";
		System.out.println("Before trim: "+k);
		System.out.println("After trim: "+k.trim());
	}

}
