package proizvodi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class User {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@Column()
	@Temporal(TemporalType.DATE)
	Date dateOfRegistration;

	public User(String username, String password, Date dateOfRegistration) {
		this.username = username;
		this.password = password;
		this.dateOfRegistration = dateOfRegistration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	
	
	
	
	
	
}
