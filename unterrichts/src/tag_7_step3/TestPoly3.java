package tag_7_step3;

class Animal {
	
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("����� �Ĵ翡�� �� �Դ�");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("���� ��Ḧ �Դ�");
	}
}

class Tiger extends Animal {
	
	public void eat() {
		System.out.println("ȣ���̰� ���� �Դ�");
	}
}

class ZooService {
	// Animal �� ���� ���� �������� ������ �����Ǿ�
	// Animal Ÿ���� ������ �پ��� �ڽ� ��ü�� ó�� �� �� �ִ�.
	public void pass(Animal a) {
		a.eat(); // ������ eat() ��� �޼����� �پ��� ������ ������ �����ϴ�.
	}
}

public class TestPoly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal a = new Person();
//		a.eat();
		
		ZooService z = new ZooService();
		z.pass(new Dog());
		z.pass(new Person());
		z.pass(new Animal());
	}

}