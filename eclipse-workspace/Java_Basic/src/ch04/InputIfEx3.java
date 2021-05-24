package ch04;

import java.util.Scanner;

public class InputIfEx3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		String str = scanner.nextLine();
		int num1 = Integer.parseInt(str);
		
		if(num1>0){
			System.out.println("양수");
		}
		else if(num1<0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다.");
		}

	}

}
