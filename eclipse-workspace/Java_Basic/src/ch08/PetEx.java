package ch08;

import java.util.Arrays;
import java.util.Scanner;

public class PetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String pet[] = {"곰돌이","복돌이","흰둥이","꺠소금","까만콩"};
		String eng[] = {"Bear","Gift","White","Sesami","Black"};
		
		System.out.print("애완견 이름을 입력하세요 : ");
		String name = sc.nextLine();
		//String[] str = sc.nextLine().split("");
		
		for(int i=0; i<pet.length; i++) {
			if(name.equals(pet[i])) {
				System.out.println(eng[i]);
			}
			
		
		}

	}

}
