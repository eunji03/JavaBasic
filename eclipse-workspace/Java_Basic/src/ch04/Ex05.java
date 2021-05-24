package ch04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//숫자 n값을 입력받아 1부터 n까지 소수를 구하는 프로그램을 작성
		//1에서 n까지 소수 출력
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i = 2; i<=num; i++) {
			if ((i!=2)&&(i%2==0)) {
			}
			else if((i!=3)&&(i%3==0)) {
				
			}
			else if((i!=5)&&(i%5==0)) {
				
			}
			else if((i!=7)&&(i%7==0)) {
				
			}
			else {
				System.out.println(i+"");
			}
		}*/
		
			/*Scanner scan = new Scanner(System.in);
			
			while(true) {
			int count=0;
			System.out.println(" 수 입력 하세요 ");
			int num = scan.nextInt();
			
			if(num < 1) {
				System.out.println("다시 입력하세요:");
				continue;
			}
			
			for(int i = 1;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}	
				
			}
		
			if(count == 2) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수아닙니다.");
			}
			
			}*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		int i = 2; //나눌 대상
		boolean isPrime = true;
		
		while(i<=num) {
			isPrime = true;
			
			for(int n = 2; n < i; n++) {
				
				if(i % n == 0) {
					isPrime = false;
				}
				continue;
			}
			if(isPrime == true) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("");
	}
}
