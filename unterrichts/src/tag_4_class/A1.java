package tag_4_class;

import java.util.Scanner;

public class A1 {
	// km -> mile �ٻ� ����� �������� ���� ���� 1.609(��)�� �����ϴ�.
	float ToMile(float x) {
		System.out.println(x + " km = " + (x / 1.609f) + " �Դϴ�.");
		return x / 1.609f;
	}

	// ���� ���� : ������ * ������ * 3.14
	float circle(float x) {
		return x * x * 3.14f;
	}

	void print(Scanner sc) {
		System.out.println("���� �̸�1�� �Է��ϼ��� : ");
		String city1 = sc.next();
		System.out.println("���� �̸�2�� �Է��ϼ��� : ");
		String city2 = sc.next();
		System.out.println("�Ÿ��� �Է��ϼ��� : ");
		int i = sc.nextInt();
		System.out.println(city1 + " ���� " + city2 + " ������ �Ÿ��� " + i + " km �Դϴ�.");
	}
}
