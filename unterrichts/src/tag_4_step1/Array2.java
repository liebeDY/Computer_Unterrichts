package tag_4_step1;

public class Array2 {

	public static void main(String[] args) {
		// 9, 1, 4, -10, 5, 12, 3, 99, 8, 3

		int count = 0;
		
		int[] arr2 = { 9, 1, 4, -10, 5, 12, 3, 99, 8, 3 };
		
		for (int a = 0; a < arr2.length; a++) {
			
			if (arr2[0] >= arr2[a + 1]) {
				count++;
			} else {
				count++;
				break;
			}
		}
		System.out.println("첫(9)번째 값보다 큰수는 최초로 몇번째? " + count);
	}
}
