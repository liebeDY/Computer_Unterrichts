package tag_7_step1;

public class Car {

	private String model;
	private String color = "white";
	
	public Car() {
		super();
	}
	
	// 생성자 오버로딩
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println(model + " " + color);
	}
	
}
