package tag_7_step3;

public class Picachu extends Overr {
public int cnt;
	
	public Picachu(String name) {
		this.name = name;
		race = "Picachu";
		age = 0;
		power = 100;
		energy = 300;
		cnt = 0;
		System.out.println("��ī�� ����������ϴ�.");
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
