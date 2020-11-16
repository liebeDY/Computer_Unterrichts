package tag_3_step1;

public class Array5 {

	public static void main(String[] args) {
		int[] es = new int[30];

		for (int i = 0; i < 30; i++) {

			es[i] = i;
		}
		System.out.println(es[0]);
		System.out.println(es[1]);
		System.out.println(es[2]);

		for (int i = 4; i < 30; i++) {
			System.out.println(es[i]);
		}
	}
}
