package Day5;

import java.util.Scanner;

public class Test106 {

	public static void main(String[] args) {
		
		int floor;

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층에 가시겠습니까?");
		floor = sc.nextInt();
		
		switch(floor) {
		
		case 1 :
			System.out.println(floor+"층 약국입니다.");
			break;
			
		case 2 :
			System.out.println(floor+"층 정형외과입니다.");
			break;
			
		case 3 :
			System.out.println(floor+"층 피부과입니다.");
			break;
			
		case 4 :
			System.out.println(floor+"층 치과입니다.");
			break;
			
		case 5 :
			System.out.println(floor+"층 헬스클럽입니다.");
			break;
			
		}

	}

}
