package test;

import service.MemberService;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		service.addMemberVO(new MemberVo("java", "�迬��", "010-1", "����"));
		service.addMemberVO(new MemberVo("oracle", "ȫ�浿", "010-2", "����"));
		service.addMemberVO(new MemberVo("JSP", "��μ�", "010-3", "�Ⱦ�"));
		service.addMemberVO(new MemberVo("Ajax", "������", "010-4", "����"));
		service.addMemberVO(new MemberVo("Spring", "�տ���", "010-5", "����"));
	
		service.printAll();
		
		MemberVo vo = service.findMemberVO("java");
		
		if (vo != null) {
			System.out.println(vo);
		} else {
			System.out.println("ȸ���� �ƴմϴ�");
		}
		
		
		service.deleteMemberVO("Ajax");
		service.printAll();
		
		
		boolean result = service.updateMemberVo(new MemberVo("Spring", "������", "010-6", "��õ"));
		
		if (result) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("��ǰ�� ��� ���� �Ұ�");
		}
		service.printAll();
		
	}

}
