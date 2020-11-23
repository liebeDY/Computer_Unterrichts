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

	//�޼��� �������̵�
	public String getDetails() {
		// return "empNo:" + getEmpNo() + " eName : " + getEname() + "dept : " + dept 
		// super�� �̿��� �θ� �޼��带 ����
		return super.getDetails() + " dept : " + dept;
	}
}