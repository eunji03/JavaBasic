package ch07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = new String[] 
				{"A","E","C","X","Y","Z","c",
				"b","z","e"};
		String str2;
		//String str2 = sc.nextLine();
		for(int i = 0; i<str.length; i--) {
			System.out.println(Arrays.toString(str));
		}
		
	}

}
