package tag_7_step2;

public class TestOverriding2 {

	public static void main(String[] args) {
		
		Employee e = new Employee("a1", "������");
		System.out.println(e.getDetails());
		
		Manager m = new Manager("a2", "���뼼", "������");
		System.out.println(m.getDetails());
	}

}
