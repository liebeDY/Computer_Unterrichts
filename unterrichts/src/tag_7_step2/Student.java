package tag_7_step2;

public class Student extends Personen {
	
	private String stuId;
	
	// Person �����ڸ� ������ -> Person�� ����߱� ����
	public Student(String name, String tel, String address, String stuId) {
		super(name, tel, address);
		this.stuId = stuId;
	}
	
	public String getStuId() {
		return stuId;
	}
	
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public String getDetails() {
		// �������̵� 
		return super.getDetilas() + " �й� : " + stuId;
	}
}
