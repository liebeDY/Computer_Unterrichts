package tag_7_step1;

class GrandParent {
	
	GrandParent() {
		System.out.println("GrandParendt ��ü ����");
	}
}

class Parent extends GrandParent {
	
	Parent() {
		System.out.println("Parent ��ü ����");
	}
}

class Child extends Parent {
	
	Child() {
		System.out.println("Child ��ü ����");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		
		new Child();
		System.out.println();
		new Parent();
	}
}
