package tag_7_step2;

public class Parent {

	public String name; // �׻� ���� ����
	protected int age; // ��� ������ ���� ����
	private int money; // ��� ������ ���� �Ұ���
	
	public Parent() {
		super();
		System.out.println("Parent ������");
	}
	
	public void printParentInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
