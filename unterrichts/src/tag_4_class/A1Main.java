package tag_4_class;

import java.util.Scanner;

public class A1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		A1 a = new A1();

		boolean flag = true;

		while (flag) {
			System.out.println("1. Ű�ι��͸� ���Ϸ� ��ȯ : ");
			System.out.println("2. ���� ���� ���ϱ� :");
			System.out.println("3. �Ÿ� ����ϱ� :");
			int i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("���ڸ� �Է��ϼ��� : ");
				float x = sc.nextInt();
				a.ToMile(x);
				break;

			case 2:
				System.out.println("�������� �Է��ϼ��� : ");
				float y = sc.nextInt();
				System.out.println("���� ���̴� " + a.circle(y) + " �Դϴ�.");
				break;
			
			case 3:
				a.print(sc);
				break;
			}
		}
	}
}
