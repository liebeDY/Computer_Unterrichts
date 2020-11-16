package tag_3_step1;

public class Array3 {

	public static void main(String[] args) {
		int [] ages;
		ages = new int[3];
		
		System.out.println(ages);
		System.out.println(ages[0]);
		System.out.println(ages.length);
		
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 32;
		
		System.out.println(ages[2]);
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < ages.length; i++) {
			
			if (ages[i] > 20) {
				System.out.println(ages[i]);
			}
		}
	}
}
