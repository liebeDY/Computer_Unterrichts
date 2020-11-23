package tag_7_step1;

public class TestMyDate {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(1, 2, 2000);
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		System.out.println();
		
		MyDate date1 = new MyDate();
		System.out.println(date1.getDay());
		System.out.println(date1.getMonth());
		System.out.println(date1.getYear());
	}
}
