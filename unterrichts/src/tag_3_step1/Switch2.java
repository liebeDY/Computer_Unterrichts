package tag_3_step1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		String ch;

		Scanner sc = new Scanner(System.in);
		System.out.println("L,O,V,E중에 하나를 입력하세요 : ");
		ch = sc.next();

		switch (ch) {

		case "L":
			System.out.println("LOVE");
			break;

		case "O":
			System.out.println("OVE");
			break;

		case "V":
			System.out.println("VE");
			break;

		case "E":
			System.out.println("E");
			break;
		}
	}

}
