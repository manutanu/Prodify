package com.prodify.security.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="user_name")
	private String user_name ;
	
	@Column(name="user_password")
	private String user_password ;
	
	@Column(name="user_email")
	private String user_email;
	
	@ManyToMany(mappedBy="users")
	private List<Role> roles;
	
	

	public User() {
		
	}

	public User(User u) {
		this.roles=u.roles;
		this.user_email=u.user_email;
		this.user_id=u.user_id;
		this.user_name=u.user_name;
		this.user_password=u.user_password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}
