package test;

import service.MemberService;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.addMemberVO(new MemberVo("java", "김연아", "010-1", "서울"));
		service.addMemberVO(new MemberVo("oracle", "홍길동", "010-2", "구로"));
		service.addMemberVO(new MemberVo("JSP", "김민수", "010-3", "안양"));
		service.addMemberVO(new MemberVo("Ajax", "박지성", "010-4", "파주"));
		service.addMemberVO(new MemberVo("Spring", "손연재", "010-5", "수원"));
	
		service.printAll();
		
		MemberVo vo = service.findMemberVO("java");
		
		if (vo != null) {
			System.out.println(vo);
		} else {
			System.out.println("회원이 아닙니다");
		}
		
		
		service.deleteMemberVO("Ajax");
		service.printAll();
		
		
		boolean result = service.updateMemberVo(new MemberVo("Spring", "류현진", "010-6", "인천"));
		
		if (result) {
			System.out.println("수정 완료");
		} else {
			System.out.println("상품이 없어서 수정 불가");
		}
		service.printAll();
		
	}

}
