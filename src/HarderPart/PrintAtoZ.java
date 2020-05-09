package HarderPart;

public class PrintAtoZ {

	public static void main(String[] args) {
		
		for(char a= 'a'; a<='z'; a++ ) {
			System.out.print(a+" ");
		}
		System.out.print("\n\n");
		for (char b='A'; b<='Z';b++) {
			System.out.print(b + " ");
		}
	}
}