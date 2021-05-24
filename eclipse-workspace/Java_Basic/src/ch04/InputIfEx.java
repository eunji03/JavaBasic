package ch04;

import java.util.Scanner;

public class InputIfEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("숫자를 입력하세요.");
	      
	      String str = scanner.nextLine();
	      
	      int num1 = Integer.parseInt(str);
	      
	      if(num1>0) { //조건식 true
				System.out.println("Good!!" + num1);
			}
			else { //조건이 false
				System.out.println("양수를 출력하세요!!!!");
			}

	}

}
