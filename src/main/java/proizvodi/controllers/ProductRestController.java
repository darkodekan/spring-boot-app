package proizvodi.controllers;

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
	
	@PostMapping("/product")
	public ResponseEntity<HttpStatus> addProduct(@RequestBody Product product) {
		
		productService.save(product);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);	

		
	}
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
	

}
