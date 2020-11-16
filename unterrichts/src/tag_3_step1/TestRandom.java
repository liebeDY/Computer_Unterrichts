package tag_3_step1;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();

		int i = r.nextInt(3);

		System.out.println(i);

		for (int j = 0; j < 10; j++) {

			i = r.nextInt(3);
			System.out.println(i + 1);
		}
	}
}
