package tag_4_step1;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		int[][] score = new int[3][5];
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		
		for (i = 0; i < score.length; i++) {
			System.out.print("��ȣ:");
			score[i][0] = sc.nextInt();
			score[i][4] = 0;
			System.out.print("��,��, �� ����:");
		
			for (j = 1; j < 4; j++) {
				score[i][j] = sc.nextInt();
				score[i][4] += score[i][j];
			}
		}
		System.out.println("��ȣ\t����\t����\t����\t����");
		
		for (i = 0; i < score.length; i++) {
		
			for (j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
