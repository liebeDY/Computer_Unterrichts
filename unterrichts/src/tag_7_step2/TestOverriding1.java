package tag_7_step2;

class Animal {

	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {

	// �޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� �� ����
	public void eat() {
		System.out.println("����� ������ �Դ�.");
	}
}

class Dog extends Animal {

	// �޼��� �������̵�
	public void eat() {
		System.out.println("���� �Դ�");
	}
}

public class TestOverriding1 {

	public static void main(String[] args) {
		Animal a = new Animal();

		a.eat();

		Person1 p = new Person1();

		p.eat(); // �������̵� �� �ڽ��� �޼��� ȣ��

		Dog d = new Dog();

		d.eat();
	}
}
