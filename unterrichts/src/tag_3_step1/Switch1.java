package tag_3_step1;

public class Switch1 {

	public static void main(String[] args) {
		int jumsu = 85, mok;
		char grade;

		mok = jumsu / 10;

		switch (mok) {

		case 10:

		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;

		case 7:
			grade = 'C';
			break;

		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
			break;

		}
		System.out.println(grade);

	}
}
