package tag_7_step1;

public class Car {

	private String model;
	private String color = "white";
	
	public Car() {
		super();
	}
	
	// ������ �����ε�
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println(model + " " + color);
	}
	
}
