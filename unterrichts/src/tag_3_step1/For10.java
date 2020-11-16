package tag_3_step1;

public class For10 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 3 == 0) {
				sum += i;
				System.out.println(i);
			}

			if (sum > 200) {
				break;
			}

			System.out.println(sum);
		}
	}

}
