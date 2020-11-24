package test;

import service.ProductService;
import vo.ProductVo;

public class TestProductService {

	public static void main(String[] args) {

		ProductService service = new ProductService();
		service.addProductVo(new ProductVo("A", "��ǰ1", "Gucci", 5000 ));
		service.addProductVo(new ProductVo("B", "��ǰ2", "Apple", 25000 ));
		service.addProductVo(new ProductVo("C", "��ǰ3", "Samsung", 35000 ));
		service.addProductVo(new ProductVo("D", "��ǰ4", "Prada", 15000 ));
		
		System.out.println("---- printAll -----");
		service.printAll();
		System.out.println();
		
		System.out.println("---- findProductVo -----");
		
		ProductVo vo = service.findProductVo("F");
		if (vo != null) {
			System.out.println(vo);
		} else {
			System.out.println("��ǰ ����");
		}
		System.out.println();
		
		System.out.println("----- deleteProductVo -----");
		service.deleteProductVo("D");
		service.printAll();
		
	}

}
