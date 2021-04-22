package com.cg.nsa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="officer10")
@PrimaryKeyJoinColumn(name="userId")

public class Officer extends User 
{
	//@Id
	@Column(name="name")
	@NotEmpty(message="name should not be empty")
	private String name;
	@NotEmpty(message="state should not be empty")
	@Column(name="state")
	private String state;
	
	
	public Officer(String userId, String password, String role, String name, String state) {
		super(userId, password, role);
		this.name = name;
		this.state = state;
	}

	public Officer(String userId, String password, String role) {
		super(userId, password, role);
	}
	
	public Officer() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Officer [name=" + name + ", state=" + state + "]";
	}
	
	
}
