package tag_7_step2;

class Animal {
	
	int age = 1;
	private String card = "카드";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}

class Person extends Animal {
	/*
	 * super 는 부모를 가르키는 키워드
	 * super.변수 / super.메서드로 부모 멤버 사용 가능
	 * 메서드, 변수등을 멤머라고 함
	 * 디폴트 접근 제어자는 같은 패키지에서는 접근 가능 
	 */
	
	public void info() {
		System.out.println("부모 변수에 접근 테스트 : " + super.age);
		System.out.println("부모 메서드에 접근 테스트 : " + super.getCard());
	}
}

public class TestSuper2 {

	public static void main(String[] args) {

		// 자식으로 객체 생성
		Personen p = new Personen();
		
		p.info();
	}

}
