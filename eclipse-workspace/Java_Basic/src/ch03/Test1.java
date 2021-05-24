package ch03;

public class Test1 {

	public static void main(String[] args) {
	
		System.out.println("문제1");
		
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		int cc = Integer.parseInt(args[2]);
		
		int total = aa+bb+cc;
		
		System.out.println("sum : "+total);
		
		int avgg = total / 3;
		
		System.out.println("avg : "+avgg);
		
	}

}
