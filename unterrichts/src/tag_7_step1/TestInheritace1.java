package tag_7_step1;

class Animal {
	
	private int age = 1;
	
	public void eat() {
		System.out.println("�Դ�");
	}
}

// ��� : Person�� Animal�κ��� ��ӹ޴´�

class Person extends Animal{
	
	public void study() {
		System.out.println("�����ϴ�");
	}
}

public class TestInheritace1 {

	public static void main(String[] args) {

		// ��ü ������ �ڽ� Ŭ������
		Person p = new Person();
		
		p.study();
	}
}
