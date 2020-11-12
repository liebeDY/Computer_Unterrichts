package tag_1_step2;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// Â¦¼ö È¦¼ö ±¸ÇÏ±â
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println(num + "Àº È¦¼ö ÀÔ´Ï´Ù.");
		} else {
			System.out.println(num + "Àº Â¦¼ö ÀÔ´Ï´Ù.");
		}
	}

}
