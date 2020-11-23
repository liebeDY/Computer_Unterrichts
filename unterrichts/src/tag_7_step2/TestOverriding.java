package tag_7_step2;

public class TestOverriding {

	public static void main(String[] args) {
		
		Student s = new Student("아이유", "010-1111-1111", "서울", "112");
		System.out.println(s.getDetails());
		
		Teacher t = new Teacher("김연아", "010-2222-2222", "안양", "수학");
		System.out.println(t.getDetails());
	}

}
