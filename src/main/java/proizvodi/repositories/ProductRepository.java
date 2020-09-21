package proizvodi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proizvodi.entities.Product;
import proizvodi.entities.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
