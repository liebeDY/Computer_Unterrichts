package tag_7_step2;

public class Teacher extends Personen {

	private String subject;
	
	public Teacher(String name, String tel, String address, String subject) {
		super(name, tel, address);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDetails() {
		return super.getDetilas() + " °ú¸ñ : " + subject;
	}
}
