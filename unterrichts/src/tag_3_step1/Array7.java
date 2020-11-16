package tag_3_step1;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		int i, sum = 0;

		float avg;

		int[] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("5명의 점수를 입력하세요 : ");

		for (i = 0; i < jumsu.length; i++) {

			jumsu[i] = sc.nextInt();
		}

		for (i = 0; i < jumsu.length; i++) {

			sum += jumsu[i];
		}
		System.out.println(sum);
		avg = (float) sum / jumsu.length;

		System.out.println(avg);
	}
}
