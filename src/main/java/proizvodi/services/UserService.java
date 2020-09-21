package proizvodi.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proizvodi.entities.User;
import proizvodi.repositories.UserRepository;
import proizvodi.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	public Collection<User> getAll(){
		return userRepository.findAll();
	}
	
	public User getById(Integer id) {
		return userRepository.getOne(id);
	}
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}
	
	

}
