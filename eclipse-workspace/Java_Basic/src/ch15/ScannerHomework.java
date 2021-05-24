package ch15;

import java.util.Scanner;

public class ScannerHomework {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("첫번째 수를 입력하시오.");
	      int num1 = scanner.nextInt();
	      System.out.println("두번째 수를 입력하시오.");
	      int num2 = scanner.nextInt();
	      System.out.println("세번째 수를 입력하시오.");
	      int num3 = scanner.nextInt();
	      
	      int sum = num1 + num2 + num3;
	      int avg = sum/3;
	      
	      
	      System.out.println("sum : " + sum +"\n" + "avg : " + avg);
	      
	}

}
