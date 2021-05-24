package ch07;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] str = new String[] {
				"1","2","3","4","5",
				"6","7","8","9","10"
		};
		System.out.println(str.toString());
		System.out.println(str);
		
		for(int i=0; i<str.length; i++) {
			int t = i * Integer.parseInt(str[i]);
			str[i] = t+"";
			//
			System.out.println(str[i]);
		}
		
		str[5] = "Hello";
		
		//java.utill.Arrays
		
		
		System.out.println(Arrays.toString(str));
	}

}
