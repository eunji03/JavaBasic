package Day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/* 과제1. 자연수 n을 입력받고 1부터 홀수를 차례대로 더하면 합이
		 * n이상이면 그 때 더해진 홀수의 개수와 그 합을 출력하는
		 * 프로그램을 작성하시오.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		
		int n = scanner.nextInt();
		int total =0;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0)
				continue;
			total += i;
		}
		System.out.println("1~n의 홀수의 합은 "+total);
	}

}
