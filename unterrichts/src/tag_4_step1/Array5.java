package tag_4_step1;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println("6���� ���ڸ� �Է��϶� :");

		Scanner sc = new Scanner(System.in);
		int i, j;
		
		for (i = 0; i < arr.length; i++) {
			
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < arr.length; i++) {
			
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
