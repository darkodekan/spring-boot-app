package proizvodi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Product {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	
	@Column
	private String productName;
	
	@Column
	private double productPrice;
	
	@Column
	private int productQuantity;
	
	@ManyToMany
	@JoinTable(name="Log", joinColumns=@JoinColumn(name="bookId"), inverseJoinColumns=@JoinColumn(name="productId", insertable=false, updatable=false))
	List<User> users = new ArrayList<>();

	public Product(String productName, double productPrice, int productQuantity, List<User> users) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.users = users;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	

	

}
