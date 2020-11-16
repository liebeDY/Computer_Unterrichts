package tag_3_step1;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		int a, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");

		a = sc.nextInt();

		for (j = 1; j <= a; j++) {
			System.out.print("*");
		}
	}

}
