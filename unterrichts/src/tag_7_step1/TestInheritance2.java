package tag_7_step1;

class GrandParent {
	
	GrandParent() {
		System.out.println("GrandParendt 梓端 持失");
	}
}

class Parent extends GrandParent {
	
	Parent() {
		System.out.println("Parent 梓端 持失");
	}
}

class Child extends Parent {
	
	Child() {
		System.out.println("Child 梓端 持失");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		
		new Child();
		System.out.println();
		new Parent();
	}
}
