package Day5;

public class Test2 {

	public static void main(String[] args) {

		
		for(int i = 1; i <= 9; i++) {
					
			if (i%2==1)
				continue;
			
			System.out.println("구구단"+i+"단");
			
			for(int j = 1; j<=9; j++) {
				
				System.out.println(i+" * "+j+" = "+ i* j);
				
			}
		}
		

	}

}
