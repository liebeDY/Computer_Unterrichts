package tag_7_step3;

class Animal {
	
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("사람이 식당에서 밥 먹다");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("개가 사료를 먹다");
	}
}

class Tiger extends Animal {
	
	public void eat() {
		System.out.println("호랑이가 닭을 먹다");
	}
}

class ZooService {
	// Animal 의 계층 구조 형성으로 다형성 지원되어
	// Animal 타입의 변수에 다양한 자식 객체를 처리 할 수 있다.
	public void pass(Animal a) {
		a.eat(); // 동일한 eat() 라는 메세지로 다양한 형태의 수행이 가능하다.
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