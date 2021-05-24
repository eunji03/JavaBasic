package ch05;

public class StudentMain4 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		//--subj -> 배열로
		Student2[] student = new Student2[2];
		student[0] = new Student2();
		student[1] = new Student2();
		
		// 홍길동/구로구/3, 수학 100 국어 90
		student[0].studentName = "홍길동";
		student[0].address = "구로구";
		student[0].grade = 3;
		student[0].subj = new Score2[2];
		student[0].subj[0] = new Score2();
		student[0].subj[0].subject = "수학";
		student[0].subj[0].score = 100;
		student[0].subj[1] = new Score2();
		student[0].subj[1].subject = "국어";
		student[0].subj[1].score = 90;
		
		System.out.println(student[0].studentName);
		System.out.println(student[0].address);
		System.out.println(student[0].grade);
		System.out.println(student[0].subj[0].subject.toString());
		System.out.println(student[0].subj[0].score);
		System.out.println(student[0].subj[1].subject.toString());
		System.out.println(student[0].subj[1].score);
		
		System.out.println("------------------------------");
		// 고길동/영등포구/3, 수학 70 국어 80
		student[1].studentName = "고길동";
		student[1].address = "영등포구";
		student[1].grade = 3;
		student[1].subj = new Score2[2];
		student[1].subj[0] = new Score2();
		student[1].subj[0].subject = "수학";
		student[1].subj[0].score = 70;
		student[1].subj[1] = new Score2();
		student[1].subj[1].subject = "국어";
		student[1].subj[1].score = 80;
		
		System.out.println(student[1].studentName);
		System.out.println(student[1].address);
		System.out.println(student[1].grade);
		System.out.println(student[1].subj[0].subject.toString());
		System.out.println(student[1].subj[0].score);
		System.out.println(student[1].subj[1].subject.toString());
		System.out.println(student[1].subj[1].score);
		
		System.out.println("------------------------------");

		/*for(int i=0; i<student.length; i++) {
			Student2 students = student[i];
			System.out.println(students.studentName);
		}*/
		System.out.println("이름/수학/국어");
		
		for(Student2 students : student) {
			System.out.print(students.studentName+"/");
			System.out.print(students.subj[0].score+"/");
			System.out.println(students.subj[1].score);

		}

	}
}

