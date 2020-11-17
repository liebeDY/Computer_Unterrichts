package tag_4_step1;

public class Array4 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = 3 * i + j + 1;
			}
		}

		/*
		 * i가 0 이고 j가 0 이면 3*0 +0+1 =1
		 * 
		 */

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
