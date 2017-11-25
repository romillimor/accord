package org.rom.testmart;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.rom.testsmart.business.ProductServiceImpl;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", 
serviceName="TestMartCatalogService", targetNamespace="https://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@WebMethod(exclude=true)
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProduct(String category,String product) {
		return productService.addProduct(category, product);
	}

}