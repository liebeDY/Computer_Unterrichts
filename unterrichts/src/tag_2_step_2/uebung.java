package tag_2_step_2;

public class uebung {

	public static void main(String[] args) {
		
		// ������
		int i, j;
		
		for (i = 1; i <= 9; i++) {
			System.out.println(i + "��");
			for (j = 1; j <= 9; j++) {
				if (i * j < 10) {
					System.out.println(i + " x " + j + " =  " +i * j);
				} else {
				System.out.println(i + " x " + j + " = " + i * j);
				}
			}
			System.out.println();
			
		}
		
		
		
		
	}

}