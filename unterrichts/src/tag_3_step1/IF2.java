package tag_3_step1;

import java.util.Scanner;

public class IF2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch;

		System.out.println("0 �Ǵ� 1�� �Է��ϼ��� : ");

		ch = sc.nextInt();

		if (ch == 0) {
			System.out.println(10 / 3);
		} else {
			System.out.println(10 % 3);
		}
	}

}
