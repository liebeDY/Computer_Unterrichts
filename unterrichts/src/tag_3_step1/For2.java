package tag_3_step1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

}
