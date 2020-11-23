package tag_7_step2;

public class Parent {

	public String name; // 항상 접근 가능
	protected int age; // 상속 때에는 접근 가능
	private int money; // 상속 때에도 접근 불가능
	
	public Parent() {
		super();
		System.out.println("Parent 생성자");
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
