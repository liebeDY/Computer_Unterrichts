package tag_7_step2;

public class TestOverriding {

	public static void main(String[] args) {
		
		Student s = new Student("������", "010-1111-1111", "����", "112");
		System.out.println(s.getDetails());
		
		Teacher t = new Teacher("�迬��", "010-2222-2222", "�Ⱦ�", "����");
		System.out.println(t.getDetails());
	}

}
