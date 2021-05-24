package Day5;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String op = sc.nextLine();
	     
		String[] sik = op.split("");
		
		for(int i=0; i<sik.length;i++) {
			System.out.println(sik[i]+"");
		}
		
		System.out.println("계산식을 입력하세요.EX) 1+1");
		
		int num1 = Integer.parseInt(sik[0]);
		int num2=Integer.parseInt(sik[2]);
		
		switch(sik[1]) {
		case "+" :
			System.out.println(num1+num2);
			break;
			
		case "-" :
			System.out.println(num1+num2);
			break;
			
		case "*" :
			System.out.println(num1+num2);
			break;
			
		case "/" :
			System.out.println(num1+num2);
			break;
		}
	
		//int num1;
		//int num2;
		//char operator;
		
		/*System.out.print("피연산자 : ");
		num1 = sc.nextInt();
		
	    System.out.print("연산자 : ");
	    operator = sc.next().charAt(0);
	    
	    System.out.print("피연산자 : ");
	    num2 = sc.nextInt();*/
	    
		//num1 = sc.nextInt();
		//operator = sc.next().charAt(0);
		//num2 = sc.nextInt();
		
		/*if(operator == '+') {
			System.out.print("결과값 : ");
			 System.out.println(num1+num2);
			
		}
		else if(operator == '-') {
			System.out.print("결과값 : ");
			 System.out.println(num1-num2);
			
		}	
		else if(operator == '*') {
			System.out.print("결과값 : ");
			 System.out.println(num1*num2);
			
		}	
		else if(operator == '/') {
			System.out.print("결과값 : ");
			 System.out.println(num1/num2);
			
		}
		else {
			System.out.println("다시 입력하세요.");
		}*/
		

	}

}
