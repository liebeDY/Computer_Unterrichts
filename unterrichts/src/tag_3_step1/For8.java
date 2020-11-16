package tag_3_step1;

public class For8 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			
			sum += i;
			if (i % 10 == 0) {
				System.out.println("1 + 2 + ... +" + i + " : " + sum);
			}
		}
	}

}
