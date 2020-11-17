package tag_4_class;

import java.util.Scanner;

public class Product2 {

	String name;
	int Co;
	int price;

	void input(Scanner sc) {
		System.out.println("제품 이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("제품 번호를 입력하세요 : ");
		Co = sc.nextInt();
		System.out.println("제품 가격을 입력하세요 : ");
		price = sc.nextInt();
	}

	void print() {
		System.out.println("제품 이름은 : " + name);
		System.out.println("제품 번호는 : " + Co);
		System.out.println("제품 가격은 : " + price);
	}
}
