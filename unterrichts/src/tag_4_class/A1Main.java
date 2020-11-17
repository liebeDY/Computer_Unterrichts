package tag_4_class;

import java.util.Scanner;

public class A1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		A1 a = new A1();

		boolean flag = true;

		while (flag) {
			System.out.println("1. 키로미터를 마일로 변환 : ");
			System.out.println("2. 원의 넓이 구하기 :");
			System.out.println("3. 거리 출력하기 :");
			int i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("숫자를 입력하세요 : ");
				float x = sc.nextInt();
				a.ToMile(x);
				break;

			case 2:
				System.out.println("반지름을 입력하세요 : ");
				float y = sc.nextInt();
				System.out.println("원의 넓이는 " + a.circle(y) + " 입니다.");
				break;
			
			case 3:
				a.print(sc);
				break;
			}
		}
	}
}
