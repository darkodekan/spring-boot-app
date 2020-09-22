package proizvodi.controllers.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proizvodi.entities.User;
import proizvodi.services.UserService;

@RestController
public class UserRestController {
	@Autowired
	UserService userService;
	
	//dodavanje korisnika
	@PostMapping("/user")
	public ResponseEntity<HttpStatus> createUser(@RequestBody User user){
		if(userService.existsByUsername(user.getUsername())){
			return new ResponseEntity<HttpStatus>(HttpStatus.NOT_ACCEPTABLE);
		}
		userService.save(user);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);	
	}
	//prikazivanje svih korisnika
	@GetMapping("/user")
	public Collection<User> getAllUsers() {
		return userService.getAll();
		
	}
	
	//brisanje korisnika preko id
	@DeleteMapping("/user/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable Integer id){
		if(userService.existsById(id)) {
			userService.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}
	
	//prikazivanje korisnika sa id 
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id){
		return userService.getById(id);	
	}
	

}
