package Day7;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
		 * 0이 입력되면 0을 제외하고 그 때까지 입력된 정수를 가장 나중에
		 * 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];	//정수100개를 저장할 수 있는 배열선언
		
		//배열의 갯수만큼 입력받기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			//0입력
			if(arr[i]==0) {
				//배열 바꾸기
				int Temp = 0;
				//0을 제외한 배열의 갯수 저장
				int count = i - 1;
				
			}
		}
	}
}