package tag_4_class;

import java.util.Scanner;

public class GradeInputMain {

	public static void main(String[] args) {
		GradeInput[] r = new GradeInput[3]; // 클래스로 객체 배열 생성, 'GradeInput' Array heisst 'r', 'new' Nutzung -> 힙teil /
											// 3mal Array
		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, math, total, hap;
		int i = 0;
		float avg;

		for (i = 0; i < r.length; i++) {

			System.out.println("이름 국어 영어 수학 점수 입력");

			r[i] = new GradeInput(); // Adresse zu geben, um data zu erreichen. Nutzt Heapteil
			r[i].name = sc.next();
			r[i].kor = sc.nextInt();
			r[i].eng = sc.nextInt();
			r[i].math = sc.nextInt();
			r[i].total = r[i].kor + r[i].eng + r[i].math;
			r[i].avg = (float) r[i].total / 3;
		}

		for (i = 0; i < r.length; i++) {

			System.out.println("이름 " + r[i].name);
			System.out.println("국어 " + r[i].kor);
			System.out.println("영어 " + r[i].eng);
			System.out.println("수학 " + r[i].math);
			System.out.println("총점 " + r[i].total);
			System.out.println("평균 " + r[i].avg);
			System.out.println();
		}
	}
}
