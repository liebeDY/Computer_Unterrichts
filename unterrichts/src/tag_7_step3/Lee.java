package tag_7_step3;

public class Lee extends Overr {
public int cnt;
	
	//������
	public Lee(String name) {
		this.name = name; // �̸����� �ʱ�ȭ
		race = "Leesanghae";
		age = 0;
		power = 150;
		energy =200;
		cnt = 0;
		System.out.println("�̻��ذ� ����������ϴ�.");
	}
	
	public void eat() {
		energy += 15;
		cnt++; // cnt�� 1����
		aging();
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
