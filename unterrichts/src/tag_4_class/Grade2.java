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
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
	}

	void total() {
		total = kor + eng + math;
	}

	void avg() {
		avg = total / 3;
	}

	void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
