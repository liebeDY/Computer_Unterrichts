package tag_3_step1;

public class While2 {

	public static void main(String[] args) {
		int i = 1, j = 1;

		while (i < 10) {

			while (j < 10) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			i++;
			j = 1;
		}
	}

}
