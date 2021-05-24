package ch05;

public class StudentMain3 {

	public static void main(String[] args) {
		// Student은 점수에 대해서 Score클래스로 표현
		// 어떤 학생의 수학/과학 과목의 점수를 처리하도록 해주세요!!
		
		// 학생 : 홍길동/구로구/3, "수학100"
		Student2 student = new Student2();
		student.studentName = "홍길동";
		student.grade = 3;
	//	student.subj = new Score2();
		//student.subj.subject = "수학";
		//student.subj.score = 100;
		
		System.out.println(student.toString());
		
		System.out.println(student.subj.toString());
		//스코어

	}

}
