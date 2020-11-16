package tag_3_step1;

public class Array4 {

	public static void main(String[] args) {
		int salary[] = new int[3];

		salary[0] = 100;
		salary[1] = 200;
		salary[2] = 300;

		System.out.println("¹è¿­ÀÇ ÃÑÇÕ");

		int sum = 0;

		for (int i = 0; i < salary.length; i++) {
			sum = sum + salary[i]; // sum += salary[i];
		}
		System.out.println(sum);

		// #6 27)

		System.out.println("Æò±Õ °¡°Ý");

		int sum2 = 0;
		int price[] = { 100, 200, 300, 400, 500, };

		for (int i = 0; i < price.length; i++) {
			sum2 += price[i];
		}
		System.out.println(sum2 / price.length);
	}
}
