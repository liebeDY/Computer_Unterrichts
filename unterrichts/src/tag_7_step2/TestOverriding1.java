package tag_7_step2;

class Animal {

	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal {

	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재 정의
	public void eat() {
		System.out.println("사람이 수저로 먹다.");
	}
}

class Dog extends Animal {

	// 메서드 오버라이딩
	public void eat() {
		System.out.println("개가 먹다");
	}
}

public class TestOverriding1 {

	public static void main(String[] args) {
		Animal a = new Animal();

		a.eat();

		Person1 p = new Person1();

		p.eat(); // 오버라이딩 한 자신의 메서드 호출

		Dog d = new Dog();

		d.eat();
	}
}
