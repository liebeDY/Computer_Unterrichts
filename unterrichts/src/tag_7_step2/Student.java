package tag_7_step2;

public class Student extends Personen {
	
	private String stuId;
	
	// Person 생성자를 가져옴 -> Person을 상속했기 때문
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
		// 오버라이딩 
		return super.getDetilas() + " 학번 : " + stuId;
	}
}
