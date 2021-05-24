package ch08;

import java.util.Scanner;

public class MorseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A-Z중 입력하세요 : ");
		String eng = sc.next();
		String[] str = sc.nextLine().split("");
		
		char word[] = new char[eng.charAt(0)];
		
		String[] morse = {".-","-...","-.-.","-..",".","..-.",
				"--.","....","..",".---","-.-",".-..","--",
				"-.","---",".--.","--.-",".-.","...","-","..-",
				"...-",".--","-..-","-.--","--.."};
		
		String result = "";
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<eng.length(); j++) {
				word[j] = eng.charAt(j);
				
				System.out.print(morse[word[j]-'A']+" ");
			
			}
		
		}
	}

}
