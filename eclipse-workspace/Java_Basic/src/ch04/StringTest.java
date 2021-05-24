package ch04;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		String result = Double.toString(Math.pow(num*2,num*2-1));
		
		System.out.println(result);
		
	
	}

}
