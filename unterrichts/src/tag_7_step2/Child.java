package tag_7_step2;

public class Child extends Parent {

	private String hobby;
	
	public Child() {
		System.out.println("Child ������");
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("hobby: " + hobby);
		// int money �� private �̱� ������ ��ӵ��� �ʴ´�.
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
