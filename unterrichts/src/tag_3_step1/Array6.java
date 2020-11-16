package tag_3_step1;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, max;

		int[] arr = new int[10];
		System.out.println("정수10개를 입력하세요 : ");

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		max = arr[0];

		for (i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
