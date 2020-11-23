package tag_7_step1;

public class Room {

	private String number;
	private int price;
	
	public Room(String number, int price) {
		super();
		this.number = number;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
