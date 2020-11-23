package tag_7_step2;

public class Manager extends Employee {

	private String dept;
	
	Manager(String empNo, String eName, String dept) {
		super(empNo, eName);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//메서드 오버라이딩
	public String getDetails() {
		// return "empNo:" + getEmpNo() + " eName : " + getEname() + "dept : " + dept 
		// super를 이용해 부모 메서드를 재사용
		return super.getDetails() + " dept : " + dept;
	}
}