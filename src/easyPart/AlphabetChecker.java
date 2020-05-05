package easyPart;

//find out alphabet
public class AlphabetChecker {

	public static void main(String[] args) {
		char alpha = 'j';
		
		if( (alpha>= 'a' && alpha<='z') || (alpha>='A'&&alpha<='Z') ) {
			System.out.println("The char is althabet ");
		}else
			System.out.println("It is not althabet");

	}

}
