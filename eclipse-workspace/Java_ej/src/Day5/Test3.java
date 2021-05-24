package Day5;

public class Test3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			System.out.println("구구단"+i+"단");
			
			for(int j = 1; j<=i; j++) {
				
				System.out.println(i+" * "+j+" = "+ i* j);
				
			}
		}
		
	}

}
