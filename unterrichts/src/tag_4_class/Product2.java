package tag_4_class;

import java.util.Scanner;

public class Product2 {

	String name;
	int Co;
	int price;

	void input(Scanner sc) {
		System.out.println("��ǰ �̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("��ǰ ��ȣ�� �Է��ϼ��� : ");
		Co = sc.nextInt();
		System.out.println("��ǰ ������ �Է��ϼ��� : ");
		price = sc.nextInt();
	}

	void print() {
		System.out.println("��ǰ �̸��� : " + name);
		System.out.println("��ǰ ��ȣ�� : " + Co);
		System.out.println("��ǰ ������ : " + price);
	}
}
