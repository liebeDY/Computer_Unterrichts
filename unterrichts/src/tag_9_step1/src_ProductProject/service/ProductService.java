package service;

import java.util.ArrayList;

import vo.ProductVo;

public class ProductService {

	private ArrayList<ProductVo> list = new ArrayList<ProductVo>();
	
	public void addProductVo(ProductVo productVo) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			ProductVo Mem = list.get(i);
			if (productVo.equals(Mem.getId())) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			list.add(productVo);
		} else {
			System.out.println("이미 등록된 상품 입니다.");
		}
	}
	
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
//			System.out.println();
		}
	}
	
	// id로 검색 후 해당 객체 return
	public ProductVo findProductVo(String id) {
		ProductVo pro = null;
		
		for (int i = 0; i < list.size(); i++) {
			ProductVo pro1 = list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			} 
		}
		return pro;
	}
	
	// id로 검색 후 해당 객체 삭세
	public void deleteProductVo(String id) {
		for (int i = 0; i < list.size(); i++) {
			ProductVo pro1 = list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}
	
	public boolean updateProductVo(ProductVo productVo) {
		boolean flag = false;
		
		for (int i = 0; i < list.size(); i++) {
			ProductVo Mem = list.get(i);
			if (Mem.getId().equals(productVo.getId())) {
				list.set(i, productVo);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
