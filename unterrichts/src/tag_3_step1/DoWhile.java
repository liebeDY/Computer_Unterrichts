package tag_3_step1;

public class DoWhile {

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;

		do {
			sum += cnt;
			cnt++;

		} while (cnt <= 100);
		{
			System.out.println(sum);
		}
	}
}
