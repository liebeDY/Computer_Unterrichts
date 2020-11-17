package tag_4_class;

import java.util.Scanner;

public class ProductMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product2 p = new Product2();

		p.input(sc);
		p.print();
	}
}
