package tag_3_step1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a;

		System.out.println("1~9������ ���ڸ� �Է��ϼ��� :");

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		switch (a) {

//		case 1,3,5,7,9:
//			System.out.println("Ȧ�� �Դϴ�.");
//			break;
//		case 2,4,6,8:
//			System.out.println("¦�� �Դϴ�.");
//			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Ȧ�� �Դϴ�.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("¦�� �Դϴ�.");

		}
	}

}
