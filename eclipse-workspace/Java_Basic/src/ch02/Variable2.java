package ch02;

public class Variable2 {

	public static void main(String[] args) {
		// Byte : 1 byte
		byte bs1 = -128;
		byte bs2 = 127; //-1했음
		System.out.println(bs1);
		System.out.println(bs2);
		
		// Short : 2 Byte
		short sh1 = 128;
		short sh2 = 32767; //-1했음
		short sh3 = -32768;
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println(sh3);

		// Int = 4 Byte
		int int1 = -2147483648;
		int int2 = 2147483647; //-1했음
		System.out.println(int1);
		System.out.println(int2);
		
		// 그림문자 입력
		//int tttt = 2147483648;
		
		// Long = 8 Byte;
		//int num1 = 12345678900; //int 범위를 넘음
		long num2 = 12345678900L; //정수는 int로 인식! 그래서 범위를 넘어 오류!
								  //int 범위 이상의 수를 사용할 땐 Long의 약자 L을 숫자 뒤에 붙이면 인식가능!
		System.out.println(num2);

		long long1 = -9223372036854775808L;
		long long2 = 9223372036854775807L; //-1 했음
		
		System.out.println(long1);
		System.out.println(long2);
		
		//Char
		char ch1 = 'A';
		char ch2 = 'z';
		
		System.out.println(ch1);
		System.out.println(ch2);		
				
	}

}
