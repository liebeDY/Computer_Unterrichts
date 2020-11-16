package tag_3_step1;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();

		int lotto[] = new int[6];

		int num;

		for (int i = 0; i < lotto.length; i++) {

			num = r.nextInt(45) + 1;

			for (int k = 0; k < i; k++) {

				if (lotto[k] == num) {

					num = r.nextInt(45) + 1;
					k = -1;
				}
			}

			lotto[i] = num;

		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
