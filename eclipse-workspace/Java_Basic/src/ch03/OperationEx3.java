package ch03;

public class OperationEx3 {

	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(0==b);
		System.out.println(-1==a);
		
		boolean b1 = (a>b);
		System.out.println(b1);
		
		System.out.println("-----------------------------------------");
		
		System.out.println((5>3)&&(5>2));
		System.out.println((5>3)||(5>2));
		
		System.out.println("-----------------------------------------");

		int num15 = 10;
		int num26 = 20;
		
		boolean flag = (num15 > 0)&&(num26 > 0);
		System.out.println(flag);
		
		flag = (num15 < 0)&(num26 > 0);
		System.out.println(flag);
		
		flag = (num15 < 0)||(num26 > 0);
		System.out.println(flag);
		
		System.out.println("-----------------------------------------");

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
