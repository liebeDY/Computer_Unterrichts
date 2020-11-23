package tag_7_step1;

public class TestCar {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.printInfo();
		
		Car car2 = new Car("k5", "red");
		car2.printInfo();
		
		System.out.println("car1 林家蔼: " + car1);
		System.out.println("car2 林家蔼: " + car2);
		
		car1 = car2;
		
		car1.printInfo();
		
		System.out.println("car1 林家蔼: " + car1);
		System.out.println("car2 林家蔼: " + car2);
	}
}
