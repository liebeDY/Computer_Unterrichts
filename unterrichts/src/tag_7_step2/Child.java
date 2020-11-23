package tag_7_step2;

public class Child extends Parent {

	private String hobby;
	
	public Child() {
		System.out.println("Child 생성자");
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("hobby: " + hobby);
		// int money 는 private 이기 때문에 상속되지 않는다.
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
