package tag_7_step3;

public class GoBook extends Overr {
	public int cnt;

	public GoBook(String name) {
		this.name = name;
		race = "Gobook";
		age = 0;
		power = 50;
		energy = 150;
		cnt = 0;
		System.out.println("���αⰡ ����������ϴ�.");
	}
	
	public void eat() {
		energy += 15; //������ 15�� ����
		cnt++; // cnt�� 1����
		aging();// cnt++; cnt�� 1��
		// aging()�޼��� ȣ��
	}
	
	public void sleep() {
		energy += 5;
		cnt++; // cnt�� 1����
		aging();
	}

	public void exercise() {
		energy -= 10;
		power += 10;
		cnt++; // cnt�� 1����
		aging();
	}
	
	public void aging() {
		// cnt�� 3������ ������ 1������
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}
}
