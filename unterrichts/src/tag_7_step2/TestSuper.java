package tag_7_step2;

class Employee{
	
	private String no;
	
	Employee(String no) {
		this.no = no;
	}
}

class Manager extends Employee {
	
	private String dept;
	
	Manager(String no, String dept) {
		super(no);
		this.dept = dept;
	}
}

public class TestSuper {

	public static void main(String[] args) {

		Manager m = new Manager("EZEN", "±³À°ºÎ");
	}
}
