package ch03;

public class OperationEx4 {

	public static void main(String[] args) {

		int num1 = 100;
		
		System.out.println(num1 + "," + (num1 += 2));
		
		System.out.println("------------------------------------");
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);

	}

}
