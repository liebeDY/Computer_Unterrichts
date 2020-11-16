package tag_3_step1;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		int i, num;

		boolean flag = false;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("1~10까지 검색할 숫자 입력 : ");

		num = sc.nextInt();

		for (i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = true;
				System.out.println("인덱스" + i + " 에서 검색");
				break;
			}
			sc.close();
		}

		if (!flag) {
			System.out.println("찾는 값이 없다");
		}
	}
}
