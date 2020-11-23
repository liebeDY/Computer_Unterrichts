package tag_7_step1;

public class TestMemberVO {

	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO("basic", "a", 1);
		
		vo.setId("java");
		System.out.println(vo.getId());
		
		vo.setPassword("asdf");
		System.out.println(vo.getPassword());
		
		vo.setMoney(200);
		System.out.println(vo.getMoney());
	}

}
