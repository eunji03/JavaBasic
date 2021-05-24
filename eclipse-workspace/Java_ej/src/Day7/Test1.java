package Day7;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 자연수 n(3<=n<=10)을 입력받아 영문자를 출력하는 프로그램을 작성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요 : ");
		int n = scanner.nextInt();	//자연수를 입력
		
		//int num = 3<=n && n<=10;
		
		char[] eng = new char[52];	//알파벳 배열-크기52(대문자 26개, 소문자 26개)
	
		
		for(int i=0; i<eng.length; i++) { //알파벳 배열 초기화
			if(i<26) {
				eng[i] = (char)(i+65);	//대문자 저장 - 대문자는 아스키코드 65부터 26개(65)
			}
			else {	
				eng[i] = (char)(i+71);	//소문자는 아스키코드 97부터 26개(71)
			}
		}
		int alphabet = 0;
		
		if(n < 3 || n > 10) {
			System.out.println("숫자 오류");
			return;
		}
		
		for(int i=n; i>=0; i--) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(eng[alphabet]);
				alphabet++;
			}
			System.out.println();
		}
		
	}

}
