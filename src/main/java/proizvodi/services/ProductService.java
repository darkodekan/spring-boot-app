package proizvodi.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proizvodi.entities.Product;
import proizvodi.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void save(Product product) {
		productRepository.save(product);
	}
	public Collection<Product> getAll(){
		return productRepository.findAll();
	}
	
	public Product getById(Integer id) {
		return productRepository.getOne(id);
	}
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
	}
	public boolean existsById(Integer id) {
		return productRepository.existsById(id);
	}
	public Collection<Product> getAllProductsWithUsers(){
		List<Product> allProducts = productRepository.findAll();
		ArrayList<Product> productsWithUsers = new ArrayList<>();
		for(Product product : allProducts) {
			if(!product.getUsers().isEmpty()) {
				productsWithUsers.add(product);
			}
		}
		return productsWithUsers;
		
	}

}
