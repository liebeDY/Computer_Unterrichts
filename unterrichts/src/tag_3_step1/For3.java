package tag_3_step1;

public class For3 {

	public static void main(String[] args) {
		int cnt;
		double sum = 0;
		
		for(cnt = 1; cnt <= 10; cnt++) {
			sum += (cnt / (cnt + 1.0));
		}
		System.out.println(sum);
	}

}
