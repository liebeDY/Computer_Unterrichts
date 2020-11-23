package tag_7_step2;

public class Employee {
	
	private String empNo;
	private String eName;

	public Employee(String empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDetails() {
		return "empNo : " + empNo + " eName : " + eName;
	}
}
