package Day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[10];	//정수100개를 저장할 수 있는 배열선언
		
		System.out.print("정수를 입력하세요 : ");
		
		for(int i = 0; i < arr.length; i++) {	//입력
			arr[i] = scanner.nextInt();
			
		}
		for(int j = arr.length-1; j >= 0; j-- ) {	//출력
			
			if(arr[j] != 0 ) {
				Arrays.sort(arr);	//내림차순
				System.out.print(arr[j]+" ");
			}
			
		}

	}

}
