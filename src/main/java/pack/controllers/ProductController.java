package pack.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dtos.ProductDto;
import service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	private ProductService productservice;

	@GetMapping(value = "/get")
	public ProductDto getproduct() {
		System.out.println("im inside get product");
		ProductDto pd = new ProductDto();
		pd.setId(20);
		pd.setName("Iohone 11");
		pd.setDescription("this is latest iphone");

		return pd;

	}

	@GetMapping(value = "")
	public ProductDto getProductById(@RequestParam(value = "id") Integer productId) {
		return productservice.getProductById(productId);

	}
 
	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

}
