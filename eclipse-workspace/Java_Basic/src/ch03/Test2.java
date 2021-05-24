package ch03;

public class Test2 {

	public static void main(String[] args) {
				
		System.out.println("문제2");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		a = 100 + a;
		b = b % 10;
		System.out.println(a);
		System.out.println(b);

	}

}
