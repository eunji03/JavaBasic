package Day5;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게와 키를 입력하세요.");
		
		String op = sc.nextLine();
		
		String[] num = op.split("");
				
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[2]);
		
		int num3 = 100;
		int total = num1 + num3 + num2;
		
		if(total>0) {
			System.out.println("비만");
			
		}
		else {
			System.out.println("비만이 아닙니다.");
			System.out.println("종료하시겠습니까?(q or -1)");
			String exit = sc.nextLine();
			
			if((exit == "q")&&(exit == "-1"))
			{
				System.out.println("종료되었습니다.");
			
			}
		
		}
		
		
		/*int num1; // 몸무게
		int num2 = 100;
		int num3; //키
		
		while(true) {
			System.out.print("몸무게 : ");
			num1 = sc.nextInt();
			
			System.out.print("키 : ");
			num3 = sc.nextInt();
			
			int total = num1+num2-num3;
			
			String m = (total > 0)? "비만" : "no비만";
			
			System.out.println(m);
			/*if(total>0) {
				System.out.println("비만");
			}
			else
				System.out.println("비만이 아닙니다.");
			System.out.println("종료하시겠습니까?(q)");
			char exit = sc.next().charAt(0);
			if(exit == 'q')
			{
				System.out.println("종료되었습니다.");
				break;
			}
		}*/

		
	}
}
