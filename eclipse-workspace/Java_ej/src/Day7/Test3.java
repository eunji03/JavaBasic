package Day7;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* 자연수 n을 입력받아 "출력 예" 와 같이 공백으로 구분하여
		 * 출력하는 프로그램을 작성하시오.
		 * ! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수를 입력하세요 : ");
		int n = scanner.nextInt();
	
	
		//줄바꿈
		for(int i=0; i<n; i++) {
			int num = 1;
			//공백
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			//숫자
			for(int j=0; j<i+1; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
	}

}
