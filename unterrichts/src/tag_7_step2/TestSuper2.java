package tag_7_step2;

class Animal {
	
	int age = 1;
	private String card = "ī��";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}

class Person extends Animal {
	/*
	 * super �� �θ� ����Ű�� Ű����
	 * super.���� / super.�޼���� �θ� ��� ��� ����
	 * �޼���, �������� ��Ӷ�� ��
	 * ����Ʈ ���� �����ڴ� ���� ��Ű�������� ���� ���� 
	 */
	
	public void info() {
		System.out.println("�θ� ������ ���� �׽�Ʈ : " + super.age);
		System.out.println("�θ� �޼��忡 ���� �׽�Ʈ : " + super.getCard());
	}
}

public class TestSuper2 {

	public static void main(String[] args) {

		// �ڽ����� ��ü ����
		Personen p = new Personen();
		
		p.info();
	}

}
