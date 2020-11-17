package tag_4_class;

import java.util.Scanner;

public class AddrMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Addr[] a = new Addr[10]; // 배열만 선언, es gibt keine Daten. es gitb nur Platz in 힙

		String name, tel, addres;

		boolean flag = true;

		int c, i, cnt = 0;

		while (flag) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");

			c = sc.nextInt();

			switch (c) {

			case 1:
				a[cnt] = new Addr(); //
				System.out.println("이름 : ");
				a[cnt].name = sc.next();
				System.out.println("번호 : ");
				a[cnt].tel = sc.next();
				System.out.println("주소 : ");
				a[cnt].addres = sc.next();

				cnt++;
				break;

			case 2:
				for (i = 0; i < cnt; i++) {
					System.out.println(a[i].name);
					System.out.println(a[i].tel);
					System.out.println(a[i].addres);
				}
				break;

			case 3:
				flag = false;
				break;
			}
		}
	}
}
