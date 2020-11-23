package tag_7_step3;

public class Picachu extends Overr {
public int cnt;
	
	public Picachu(String name) {
		this.name = name;
		race = "Picachu";
		age = 0;
		power = 100;
		energy = 300;
		cnt = 0;
		System.out.println("피카츄가 만들어졌습니다.");
	}
	
	public void eat() {
		energy += 15; //에너지 15씩 증가
		cnt++; // cnt는 1증가
		aging();// cnt++; cnt는 1씩
		// aging()메서드 호출
	}
	
	public void sleep() {
		energy += 5;
		cnt++; // cnt는 1증가
		aging();
	}

	public void exercise() {
		energy -= 10;
		power += 10;
		cnt++; // cnt는 1증가
		aging();
	}
	
	public void aging() {
		// cnt가 3증가할 때마다 1살증가
		if (cnt >= 3) {
			age++;
			cnt = 0;
		}
	}
}
