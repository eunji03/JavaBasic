package Day7;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/* 100미만의 양의 정수들이 주어진다.
		 * 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
		 * 그 때까지 입력된 정수의 십의 숫자가 각각 몇 개인지
		 * 작은 수부터 출력하는 프로그램을 작성(0개인 숫자는 출력하지 않는다.)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("100미만의 양의 정수를 입력 : ");
		int n = sc.nextInt();      // 입력
		int[] count = new int[10];  // 양수의 사용 횟수 카운트
		
		while(true) {
			if(n == 0)
				break;
			if(n < 0 || n >= 100)
				continue;
			count[n/10]++;
		}
		for(int i = 0; i <10; i++) {
			if(count[i] == 0)
				continue;
			System.out.println(i+" : "+count[i]);
		}
		
	}

}
