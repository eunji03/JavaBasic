package Day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* 과제2. 자연수 n을 입력받아 "출력 예"와 같이 출력되는
		 * 프로그램을 작성
		 * !'*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.!
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("자연수를 입력하세요.");
		int n = scanner.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
