package tag_7_step3;

import java.util.Scanner;

public class ExcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Overr o = null;
		
		System.out.println("������ �����ϼ���");
		System.out.println("1.��ī��");
		System.out.println("2.�̻��ؾ�");
		System.out.println("3.���α�");
		int x = sc.nextInt();
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		
		if (x == 1) {
			o = new Picachu(name);
		} else if ( x == 2) {
			o = new Lee(name);
		} else if (x == 3) {
			o = new GoBook(name);
		}
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("�޴�");
			System.out.println("1. ��Ա�\n2. ���ڱ�\n3.��ϱ�\n5. ����");
			
			x = sc.nextInt();
			
			switch(x) {
			case 1:
				o.eat();
				o.print();
				break;
				
			case 2:
				o.sleep();
				o.print();
				break;
				
			case 3:
				o.exercise();
				o.print();
				if(o.energy <= 0) {
					System.out.println("��������");
					flag = false;
				}
				break;
				
			case 5:
				flag = false;
				break;
			}
		}
	}
}


