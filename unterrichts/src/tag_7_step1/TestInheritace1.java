package tag_7_step1;

class Animal {
	
	private int age = 1;
	
	public void eat() {
		System.out.println("먹다");
	}
}

// 상속 : Person은 Animal로부터 상속받는다

class Person extends Animal{
	
	public void study() {
		System.out.println("공부하다");
	}
}

public class TestInheritace1 {

	public static void main(String[] args) {

		// 객체 생성은 자식 클래스로
		Person p = new Person();
		
		p.study();
	}
}
