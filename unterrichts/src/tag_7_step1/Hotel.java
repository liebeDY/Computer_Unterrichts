package tag_7_step1;

public class Hotel {

	private String address;
	private Room room;
	
	public Hotel(String address, Room room) {
		super();
		this.address = address;
		this.room = room;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
}
