package ch04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1;
		
		//메세지출력,dan값 입력
		
		System.out.println("단 입력");
		dan = sc.nextInt();
		System.out.println("구구단"+dan+"단");
		
		while(i<10) {
			//구구단 출력코드
			System.out.println(dan+" * "+i+" = "+ i* dan);
			
			i++;
			
			System.out.println("끝");
			
		}
		//sc.close();
		
		/*for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+i*dan);
		}*/

	}

}
