package tag_7_step3;

public class Overr {
	// 3���� ���ϸ󿡰� ��� ���� ����
	public String race; //����
	public String name; //�̸�
	public int age; //����
	public int power; //�Ŀ�
	public int energy; //������

	public Overr() {
		System.out.println("Overr Ŭ����");
	}

	public void eat() {
		energy += 15; //������ 15�� ����
		// cnt++; cnt�� 1��
		// aging()�޼��� ȣ��
	}
	
	public void sleep() {
		energy += 5;
	}

	public void exercise() {
		energy -= 10;
		power += 10;
	}

	public void print() { //���� ĳ���� ���°� ���
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}
