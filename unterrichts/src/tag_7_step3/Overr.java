package tag_7_step3;

public class Overr {
	// 3가지 포켓몬에게 상속 해줄 것임
	public String race; //종족
	public String name; //이름
	public int age; //나이
	public int power; //파워
	public int energy; //에너지

	public Overr() {
		System.out.println("Overr 클래스");
	}

	public void eat() {
		energy += 15; //에너지 15씩 증가
		// cnt++; cnt는 1씩
		// aging()메서드 호출
	}
	
	public void sleep() {
		energy += 5;
	}

	public void exercise() {
		energy -= 10;
		power += 10;
	}

	public void print() { //현재 캐릭터 상태값 출력
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}
