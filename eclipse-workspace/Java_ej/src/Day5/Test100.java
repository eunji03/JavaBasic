package Day5;

import java.util.Scanner;

public class Test100 {

	public static void main(String[] args) {
		
		int score;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		score = sc.nextInt();
		
		if(score>=90) {
			char greade = 'A';
			System.out.println(greade);
		}
		else if(score>=80) {
			char greade = 'B';
			System.out.println(greade);
			}
		else if(score>=70) {
			char greade = 'C';
			System.out.println(greade);
			}
		else if(score>=60) {
			char greade = 'D';
			System.out.println(greade);
			}
		else {
			char greade = 'F';
			System.out.println(greade);
			}
		
	}

}
