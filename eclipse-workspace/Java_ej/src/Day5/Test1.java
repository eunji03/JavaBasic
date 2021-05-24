package Day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = 10;
		int num2 = 2;
		char operator;
		
		System.out.println("사칙연산 기호를 입력하세요.");
		
		operator = sc.nextLine().charAt(0);
		
		switch(operator) {
		case '+' :
			break;
			
		case '-' :
			break;
			
		case '*' :
			break;
			
		case '/' :
			break;	
		}
		
		if(operator == '+') {
			
			 System.out.println(num1+num2);
			
		}
		else if(operator == '-') {
			
			 System.out.println(num1-num2);
			
		}	
		else if(operator == '*') {
			
			 System.out.println(num1*num2);
			
		}	
		else if(operator == '/') {
			
			 System.out.println(num1/num2);
			
		}
		else {
			System.out.println("다시 입력하세요.");
		}
		
	}

}
