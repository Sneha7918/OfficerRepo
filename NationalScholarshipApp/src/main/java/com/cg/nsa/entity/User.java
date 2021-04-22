package com.cg.nsa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Table(name="user10")
@Inheritance(strategy = InheritanceType.JOINED)
public class User 
{
	@Id
	@Column(name="userId")
	@NotEmpty(message="userId should not be empty")
	private String userId;	
	@Column(name="password")
	@NotEmpty(message="password should not be empty")
	private String password;
	@Column(name="role")
	@NotEmpty(message="role should not be empty")

	private String role;
	
	public User(String userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
