package tag_7_step2;

public class Personen {
	
	private String name;
	private String tel;
	private String address;

	public Personen(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetilas() {
		return "�̸� : " + name + " ��ȭ��ȣ : " + tel + " �ּ� : " + address;
	}
}
