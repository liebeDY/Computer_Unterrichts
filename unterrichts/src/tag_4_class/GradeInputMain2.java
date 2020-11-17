package tag_4_class;

import java.util.Scanner;

public class GradeInputMain2 {

	public static void main(String[] args) {
		GradeInput2[] r = new GradeInput2[3];
		Scanner sc = new Scanner(System.in);

		int i;

		for (i = 0; i < r.length; i++) {
			r[i] = new GradeInput2();
			r[i].input(sc);
			r[i].total();
			r[i].avg();
		}

		for (i = 0; i < r.length; i++) {
			r[i].print();
		}
	}
}
