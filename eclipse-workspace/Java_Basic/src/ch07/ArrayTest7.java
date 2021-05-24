package ch07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		/* 어떤 학교의 학생 과학/수학 시험 성적을
		 * "학생/점수/점수" 순서로 입력해 10의 입력을 한다.
		 * 각 과목별 합계와 평균을 내시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String[] student = new String[5];
		
		int math = 0;
		int sci = 0;
		
		int find_id = -1;
		
		for(int i = 0; i < student.length; i++) {
			System.out.println("이름/과학/수학 점수를 입력하세요.");
			student[i] = scanner.next();
			String person = student[i];
			
			String[] data = person.split("/");
			//학생 찾기
			if(data[0].contains("ㅎ")) {
				find_id = i;
				break;
			}
			math += Integer.parseInt(data[1]);
			sci += Integer.parseInt(data[2]);
		}
		System.out.println("---------------------------");
		System.out.println("과학 : "+sci+"/"+sci/student.length);
		System.out.println("수학 : "+math+"/"+math/student.length);

	}

}
