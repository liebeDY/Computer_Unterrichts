package tag_4_class;

import java.util.Scanner;

public class Grade2 {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	float avg;

	void input(Scanner sc) {
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("���� ������ �Է��ϼ��� : ");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		math = sc.nextInt();
	}

	void total() {
		total = kor + eng + math;
	}

	void avg() {
		avg = total / 3;
	}

	void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
}
