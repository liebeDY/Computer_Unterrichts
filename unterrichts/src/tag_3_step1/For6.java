package tag_3_step1;

public class For6 {

	public static void main(String[] args) {
		int cnt;
		int sum = 0;
		
		for (cnt = 1; cnt <= 100; cnt++) {
			
			if (cnt % 3 == 0 && cnt % 7 == 0) {
				
				sum += cnt;
			}
		}
		System.out.println(sum);
	}

}
