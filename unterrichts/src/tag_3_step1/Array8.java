package tag_3_step1;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		int i, num;

		boolean flag = false;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("1~10���� �˻��� ���� �Է� : ");

		num = sc.nextInt();

		for (i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = true;
				System.out.println("�ε���" + i + " ���� �˻�");
				break;
			}
			sc.close();
		}

		if (!flag) {
			System.out.println("ã�� ���� ����");
		}
	}
}
