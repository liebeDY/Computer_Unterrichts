package tag_3_step1;

public class While1 {

	public static void main(String[] args) {
		int cnt = 1;

		while (cnt <= 10) {

			if (cnt % 2 != 0) {
				System.out.println(cnt);
			}
			cnt++;
		}
	}
}
