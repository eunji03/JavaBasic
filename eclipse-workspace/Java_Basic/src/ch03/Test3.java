package ch03;

public class Test3 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int ab = a/b;
		int ba = a%b;
		
		System.out.println(a + "/" + b + "=" +ab+"..."+ba);

	}

}
