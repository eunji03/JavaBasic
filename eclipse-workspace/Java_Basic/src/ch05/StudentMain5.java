package ch05;

import java.util.Scanner;

public class StudentMain5 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		//--subj -> 배열로
		
		Scanner scanner = new Scanner(System.in);	//스캐너
		String[] name = new String[10];		//name이라는 배열선언
		
		int mathSum = 0;	//수학 합계 선언 후 초기화
		int sciSum = 0;		//과학 합계 선언 후 초기화
		int engSum = 0;		//영어 합계 선언 후 초기화
		
		int avg = 0;		//평균 값 선언 후 초기화
		int cnt = 0;		//학생 수 
		
		Student2[] student = new Student2[10];
		
		// 홍길동/구로구/3, 수학 100 과학 90 영어 80
		student[0].studentName = "홍길동";
		student[0].address = "구로구";
		student[0].grade = 3;
		
		student[0].subj = new Score2[2];
		student[0].subj[0] = new Score2();
		student[0].subj[0].subject = "수학";
		student[0].subj[0].score = 100;
		
		student[0].subj[1] = new Score2();
		student[0].subj[1].subject = "과학";
		student[0].subj[1].score = 90;
		
		student[0].subj[2] = new Score2();
		student[0].subj[2].subject = "영어";
		student[0].subj[2].score = 80;
				
		// 고길동/영등포구/3, 수학 70 과학 80 영어 60
		student[1].studentName = "고길동";
		student[1].address = "영등포구";
		student[1].grade = 3;
		
		student[1].subj = new Score2[2];
		student[1].subj[0] = new Score2();
		student[1].subj[0].subject = "수학";
		student[1].subj[0].score = 70;
		
		student[1].subj[1] = new Score2();
		student[1].subj[1].subject = "과학";
		student[1].subj[1].score = 80;
		
		student[1].subj[2] = new Score2();
		student[1].subj[2].subject = "영어";
		student[1].subj[2].score = 60;
		
		int sum1 = student[0].subj[0].score 
				+ student[1].subj[0].score; //수학
		int sum2 = student[0].subj[1].score 
				+ student[1].subj[1].score; //과학
		int sum3 = student[0].subj[2].score 
				+ student[1].subj[2].score; //영어
		
		int avg1 = sum1 / 3;
		int avg2 = sum2 / 3;
		int avg3 = sum3 / 3;
				
		System.out.println("수학/sum: "+sum1+"/"+avg1);
		System.out.println("과학/sum: "+sum2+"/"+avg2);
		System.out.println("영어/sum: "+sum3+"/"+avg3);
		
		System.out.println("학생 성적을 입력하세요:(이름/학년/주소/수학/과학/영어)");
		
		for(Student2 students : student) {

			System.out.print(students.studentName+"/");
			System.out.print(students.address+"/");
			System.out.print(students.grade+"/");
			
			System.out.print(students.subj[0].score+"/");
			System.out.print(students.subj[1].score+"/");
			System.out.println(students.subj[2].score);
			
		}
		System.out.println("------------------------------");
		
	}

}
