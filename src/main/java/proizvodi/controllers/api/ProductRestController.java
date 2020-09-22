package proizvodi.controllers.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import proizvodi.entities.Product;
import proizvodi.entities.User;
import proizvodi.services.ProductService;
import proizvodi.services.UserService;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserService userService;
	
	//dodavanje proizvoda
	@PostMapping("/product")
	public ResponseEntity<HttpStatus> addProduct(@RequestBody Product product) {
		productService.save(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);	
	}
	//ispisivanje svih proizvoda
	@GetMapping("/product")
	public Collection<Product> getAllProducts(){
		return productService.getAll();
		
	}
	// spring.jpa.hibernate.ddl-auto = create
	//dodavanje proizvoda korisniku
	//npr product/1/user/2 bi dodao product sa id 1 korisniku sa id 2
	@PostMapping("/product/{productId}/user/{userId}")
	public ResponseEntity<HttpStatus> getAllProducts(@PathVariable int productId, @PathVariable int userId){
		Product product = productService.getById(productId);
		User user = userService.getById(userId);
		user.addProduct(product);
		product.addUser(user);
		
		userService.save(user);
		productService.save(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		
	}
	@GetMapping("/product/user")
	public Collection<Product> getAllProductsUser(){
		return productService.getAllProductsWithUsers();
	}
	
	
	
	

}
