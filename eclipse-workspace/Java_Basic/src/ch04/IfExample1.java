package ch04;

public class IfExample1 {

	public static void main(String[] args) {
		
		int age = 10;
		
		//조건1
		if(age>=8) { //조건식 true
			System.out.println("8살이상~");
		}
		else { //조건이 false
			System.out.println("8살이하...");
		}

		//복합조건1

		int age2 = 10;
		
		if((age>=8)&&(age2 > 10)) { //조건식 true
			System.out.println("8살이상~");
		}
		else { //조건이 false
			System.out.println("8살이하...");
		}
	}

}
