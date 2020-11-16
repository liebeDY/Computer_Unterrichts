package tag_3_step1;

import java.util.Scanner;

public class IF4 {

	public static void main(String[] args) {

		String a;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		
		if (a.equals("A") || a.equals("a")) {
			System.out.println("America, Australia");
		} else if (a.equals("K") || a.equals("k")) {
			System.out.println("Korea, Kuwait");
		} else if (a.equals("M") || a.equals("m")) {
			System.out.println("Mexico, Monaco");
		}
	}

}
