package tag_4_class;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		GradeInput[] r = new GradeInput[3]; // Ŭ������ ��ü �迭 ����, 'GradeInput' Array heisst 'r', 'new' Nutzung -> ��teil /
											// 3mal Array
		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, math, total, hap;
		int i = 0;
		float avg;

		for (i = 0; i < r.length; i++) {

			System.out.println("�̸� ���� ���� ���� ���� �Է�");

			r[i] = new GradeInput(); // Adresse zu geben, um data zu erreichen. Nutzt Heapteil
			r[i].name = sc.next();
			r[i].kor = sc.nextInt();
			r[i].eng = sc.nextInt();
			r[i].math = sc.nextInt();
			r[i].total = r[i].kor + r[i].eng + r[i].math;
			r[i].avg = (float) r[i].total / 3;
		}

		for (i = 0; i < r.length; i++) {

			System.out.println("�̸� " + r[i].name);
			System.out.println("���� " + r[i].kor);
			System.out.println("���� " + r[i].eng);
			System.out.println("���� " + r[i].math);
			System.out.println("���� " + r[i].total);
			System.out.println("��� " + r[i].avg);
			System.out.println();
		}
	}
}
