package tag_3_step1;

import java.util.Scanner;

public class IF3 {

	public static void main(String[] args) {
		System.out.println("L, O, V, E �߿� �� ���� ���ڸ� �Է��ϼ��� : ");

		Scanner sc = new Scanner(System.in);

		String ch = sc.next();

		if (ch.equals("L")) {
			System.out.println("LOVE");
		} else if (ch.equals("O")) {
			System.out.println("OVE");
		} else if (ch.equals("V")) {
			System.out.println("VE");
		} else if (ch.equals("E")) {
			System.out.println("E");
		}
	}

}
