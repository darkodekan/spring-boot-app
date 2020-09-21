package proizvodi.services;

import java.util.Collection;

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

}
