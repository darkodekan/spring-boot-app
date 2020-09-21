package proizvodi.repositories;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proizvodi.entities.Product;
import proizvodi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	

}
