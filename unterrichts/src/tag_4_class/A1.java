package tag_4_class;

import java.util.Scanner;

public class A1 {
	// km -> mile 근삿값 결과를 얻으려면 길이 값을 1.609(으)로 나눕니다.
	float ToMile(float x) {
		System.out.println(x + " km = " + (x / 1.609f) + " 입니다.");
		return x / 1.609f;
	}

	// 원의 넓이 : 반지름 * 반지름 * 3.14
	float circle(float x) {
		return x * x * 3.14f;
	}

	void print(Scanner sc) {
		System.out.println("도시 이름1을 입력하세요 : ");
		String city1 = sc.next();
		System.out.println("도시 이름2를 입력하세요 : ");
		String city2 = sc.next();
		System.out.println("거리를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println(city1 + " 에서 " + city2 + " 까지의 거리는 " + i + " km 입니다.");
	}
}
