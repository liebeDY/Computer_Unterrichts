package tag_4_class;

import java.util.Scanner;

public class GradeMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Grade2 g = new Grade2();

		g.input(sc);
		g.total();
		g.avg();
		g.print();
	}
}
