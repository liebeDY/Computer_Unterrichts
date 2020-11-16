package tag_3_step1;

public class Array1 {

	public static void main(String[] args) {
//		int[] a = new int[100];
//		int[] month;
//		= {31, 28, 31, 30, 31, 31, 31, 30, 31, 30, 31};
		
		int[] month;
		month = new int[12];
		
		month[0] = 31; // 배열은 0부터 시작
		month[1] = 28; 
		month[2] = 31;
		month[3] = 30;
		month[4] = 31;
		month[5] = 31;
		month[6] = 31;
		month[7] = 31;
		month[8] = 31;
		month[9] = 31;
		month[10] = 31;
		month[11] = 31;
		
		System.out.println(month[0]);
		
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);
			
		}
	}

}
