package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/* 자연수 n을 입력받아 "출력 예"와 같이 n*n크기의 공백으로
		 * 구분하여 출력되는 프로그램을 작성하시오.
		 * 10 미만의 홀수만 출력하시오.
		 * !숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		int n = scanner.nextInt();
		int num = 1 ;
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<arr.length; i++) { //행
			
			for(int j=0; j<arr[0].length; j++) {//열
				
				if(num%2==1) {
					arr[i][j] = num;
				}
				num += 2; 
				if(num >= 10)
					num =1;
				//arr[n][n] = n; //행*열
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		} 
		
		

	}

}
