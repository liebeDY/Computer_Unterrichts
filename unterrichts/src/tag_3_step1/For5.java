package tag_3_step1;

public class For5 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			
			if (i % 5 != 0) { // 5�� ����� �ƴ� ��
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
