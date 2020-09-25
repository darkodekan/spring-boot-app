package proizvodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import proizvodi.entities.Product;
import proizvodi.entities.User;
import proizvodi.repositories.ProductRepository;
import proizvodi.repositories.UserRepository;

@SpringBootApplication
public class ProizvodiApplication implements CommandLineRunner {
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	/*
	 @Autowired
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProizvodiApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception {
        /*userRepository.save(new User("darko", bCryptPasswordEncoder.encode("darko")));*/
		User user1 = new User("andreja", "andreja");
		User user2 = new User("admin", "admin");
		
		userRepository.save(user1);
		userRepository.save(user2);
		
		user1.setUserId(1);
		user2.setUserId(2);
		
		Product product1 = new Product("Pepsi", 80, 23);
		Product product2 = new Product("Smoki", 30, 12);
		Product product3 = new Product("Red Bull", 170, 7);
		Product product4 = new Product("Blender", 3000, 3);
		Product product5 = new Product("Bicikl", 19000, 21);
		Product product6 = new Product("Viski", 700, 2);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);
		
		product1.setProductId(1);
		product2.setProductId(2);
		product3.setProductId(3);
		product4.setProductId(4);
		product5.setProductId(5);
		product6.setProductId(6);


		

		user1.addProduct(product1);
		user1.addProduct(product2);
		user1.addProduct(product3);
		user1.addProduct(product4);
		user1.addProduct(product5);
		
		user2.addProduct(product1);
		user2.addProduct(product2);
		user2.addProduct(product6);
		
		
		
		product1.addUser(user1);
		product2.addUser(user1);
		product3.addUser(user1);
		product4.addUser(user1);
		product5.addUser(user1);
		
		product1.addUser(user2);
		product2.addUser(user2);
		product6.addUser(user2);
		
		
		userRepository.save(user1);
		userRepository.save(user2);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);

		
		





    }
}
