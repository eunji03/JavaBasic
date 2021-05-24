package ch02;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 문자형 char = 2 Byte == 크기의 범위는 int와 같음
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);	// Casting
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//범위
		int ch4 = 318;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
	}

}
