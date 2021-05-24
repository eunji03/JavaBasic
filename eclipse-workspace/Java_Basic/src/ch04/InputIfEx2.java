package ch04;

import java.util.Scanner;

public class InputIfEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      
		System.out.println("첫번째 수를 입력하시오.");
		String str = scanner.nextLine();
		int num1 = Integer.parseInt(str);
		
	    System.out.println("두번째 수를 입력하시오.");
	    String str2 = scanner.nextLine();
	    int num2 = Integer.parseInt(str2);
	    
	    System.out.println("세번째 수를 입력하시오.");
	    String str3 = scanner.nextLine();
	    int num3 = Integer.parseInt(str3);
	    
	    int sum = num1 + num2 + num3;
	    int avg = sum/3;
	      
	    if((sum>0)&&(avg>0)) { //조건식 true
	    	System.out.println("sum : " + sum +"\n" + "avg : " + avg);
				}
		 else { //조건이 false
			 System.out.println("안녕~끝");
				}
	}

}
