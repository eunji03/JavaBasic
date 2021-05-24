package ch05;

public class StudentMain2 {

	public static void main(String[] args) {
		// 다수의 학생정보를 관리 - 5명
		Student[] student = new Student[5];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		student[3] = new Student();
		student[4] = new Student();
		
		student[0].studentName = "홍길동";
		student[0].grade = 3;
		
		student[1].studentName = "이순신";
		student[1].grade = 2;
		
		for(int i=0; i<5; i++) {
			System.out.println(student[i]);
			System.out.println(student[i].studentName);
		}
		
		//클래스는 객체화해서 사용 : instantiation
		//Student student;
		//student = new Student();
		//student.address = "구로구";
		//student.studentName = "홍길동";
		//student.grade = 2;

	}

}
