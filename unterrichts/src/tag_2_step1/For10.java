package tag_2_step1;

public class For10 {

	public static void main(String[] args) {
		
		int i, j;
		
		for (i = 1; i <= 4; i++) {
			
			for (j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
