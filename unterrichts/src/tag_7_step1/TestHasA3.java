package tag_7_step1;

public class TestHasA3 {

	public static void main(String[] args) {
		
		Hotel h = new Hotel("¼­¿ï", new Room("202", 10000));
		
		System.out.println(h.getAddress());
		System.out.println(h.getRoom().getNumber());
		System.out.println(h.getRoom().getPrice());
		System.out.println(h.getRoom());
	}
}
