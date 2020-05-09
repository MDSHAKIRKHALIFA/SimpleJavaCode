package easyPart;

//multiplication tabel finder
public class MultiplicationTable {

	public static void main(String[] args) {
		int a = 5;
		int b =1;
		for(int i=1;i<=10;++i) {
//			b=a*i;
			System.out.println(a+" x "+ i +" = "+(b=a*i));
		}
	}
}
