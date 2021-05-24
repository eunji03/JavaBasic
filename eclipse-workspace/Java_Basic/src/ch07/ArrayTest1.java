package ch07;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 10개 짜리 문자열 배열
		//1번
		String[] str1;
		str1 = new String[10];
		
		String[] str2 = new String[10];
		String str3[] = new String[10];
		
		//2번
		String[] str4 = new String[] {
				"1", "2", "3","4", "5",
				"6","7","8","9","10"
		};
		
		//3번
		String[] str5 = {
				"1", "2", "3","4", "5",
				"6","7","8","9","10"	
		};
		
		String[] str6 = {};
		
		System.out.println("str1 = "+ str1.length);
		System.out.println("str2 = "+ str2.length);
		System.out.println("str3 = "+ str3.length);
		System.out.println("str4 = "+ str4.length);
		System.out.println("str5 = "+ str5.length);
		System.out.println("str6 = "+ str6.length);
		
		//double 5, 8, 30개 크기의 배열 3개 만들고 크기출력
		double[] dou1 = new double[5];
		double[] dou2 = new double[8];
		double[] dou3 = new double[30];
		
		System.out.println("dou1 = "+ dou1.length);
		System.out.println("dou2 = "+ dou2.length);
		System.out.println("dou3 = "+ dou3.length);
		
	}

}
