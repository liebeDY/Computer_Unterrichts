package tag_4_class;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p = new Product();
		
		p.name = "¶ó¸é";
		p.Co = 12121;
		p.price = 1000;
		
		System.out.println(p.name);
		System.out.println(p.Co);
		System.out.println(p.price);
	}
}
