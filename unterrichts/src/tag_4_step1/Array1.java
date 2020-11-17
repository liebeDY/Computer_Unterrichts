package tag_4_step1;

public class Array1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		int[] arr1 = { 9, 1, 4, -10, 5, 12, 3, 99, 8, 3 };
		
		for (int a = 0; a < arr1.length; a++) {
		
			if (arr1[a] >= 5) {
				count++;
			}
		}
		System.out.println("배열 레퍼런스 변수중 5이상의 갯수는 = " + count);
	}
}
