package service;

import dtos.ProductDto;
import utillpacakge.InMemoryDatabase;

public class ProductService {

	public ProductDto getProductById(Integer id) {
		return InMemoryDatabase.productList.get(id);

}
}