package proizvodi.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class User {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateOfRegistration;
	
	@ManyToMany(mappedBy="users")
	private List<Product> products = new ArrayList<>();

	public User(String username, String password, Date dateOfRegistration, List<Product> products) {
		super();
		this.username = username;
		this.password = password;
		this.dateOfRegistration = dateOfRegistration;
		this.products = products;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	} 

	
	
	
	
	
	
	
}
