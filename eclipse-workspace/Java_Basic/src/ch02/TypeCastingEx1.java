package ch02;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		//암묵적 타입캐스팅
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		//실수
		float f = i;
		double d = f;
		//암묵적
		//파충류 파1 = 고릴라1;
		
		//명시적 타입캐스팅
		byte b1 = (byte)256;
		//명시적
		//파충류 파1 = (파충류)고릴라1;
		
		System.out.println("b = "+b);
		System.out.println("s = "+s);
		System.out.println("i = "+i);
		System.out.println("l = "+l);
		//실수
		System.out.println("f = "+f);
		System.out.println("d = "+d);
		
		System.out.println("b1 =  "+b1);
		

		//위를 뒤집어서 long 형에서 byte 까지 대입시???
		
	}

}
