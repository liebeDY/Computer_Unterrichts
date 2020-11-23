package tag_7_step3;

public class Lee extends Overr {
public int cnt;
	
	//생성자
	public Lee(String name) {
		this.name = name; // 이름으로 초기화
		race = "Leesanghae";
		age = 0;
		power = 150;
		energy =200;
		cnt = 0;
		System.out.println("이상해가 만들어졌습니다.");
	}
	
	public void eat() {
		energy += 15;
		cnt++; // cnt는 1증가
		aging();
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
