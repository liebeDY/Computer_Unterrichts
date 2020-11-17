package tag_4_class;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y, i;

		boolean flag = true;

		Calc c = new Calc();

		while (flag) {
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");
			i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("두개의 숫자 입력 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println(c.add(x, y));
				break;
			case 2:
				System.out.println("두개의 숫자 입력 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println(c.sub(x, y));
				break;
			case 3:
				System.out.println("두개의 숫자 입력 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println(c.mul(x, y));
				break;
			case 4:
				System.out.println("두개의 숫자 입력 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println(c.div(x, y));
				break;
			case 5:
				flag = false;
			}
		}
	}
}
