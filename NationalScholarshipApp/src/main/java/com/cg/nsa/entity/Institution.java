package com.cg.nsa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;

/**
 * @author Sushma S
 * Version: 1.0
 * Description: This is the entity class - Institution
 * Created date: 19-04-2021
 */

@Entity
@Table(name="institution10")
@PrimaryKeyJoinColumn(name="userId")  
public class Institution extends User
{
	@Column(name = "code")
	@Range(min = 1, message = "Please enter a valid code")
	private int code;
	
	@NotEmpty(message = "Category cannot be empty")
	@Column(name = "category")
	private String category;	//	Government/Private/Autonomous
	
	@Column(name = "type")
	@NotEmpty(message = "Institution type cannot be empty")
	private String type;		// Medical/Law/Engineering
	
	@Column(name = "name")
	@NotEmpty(message = "Institution name cannot be empty")
	private String name;
	
	@Column(name = "university")
	@NotEmpty(message = "University cannot be empty")
	private String university;		// 	University affiliated with
	
	@Column(name = "address")
	@NotEmpty(message = "Address cannot be empty")
	private String address;
	
	@Column(name = "city")
	@NotEmpty(message = "City cannot be empty")
	private String city;
	
	@Column(name = "state")
	@NotEmpty(message = "State cannot be empty")
	private String state;
	
	@Column(name = "yearOpen")
	@Range(min = 1945, max = 2020, message = "Please enter a valid inaugral year")
	private int yearOpen;
	
	@Column(name = "telephone")
	@Size(min = 10, max = 10, message = "Please enter a valid telephone number")
	private String telephone;
	
	@Column(name = "principal")
	@NotEmpty(message = "Principal name cannot be empty")
	private String principal;
	
	@Column(name = "status")
	private String status;		// Pending/Approved/Rejected
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "institutionCode")
	private List<Student> studentList;

	public Institution() {
		// TODO Auto-generated constructor stub
	}
	
	public Institution(String userId, String password, String role,
			@Range(min = 1, message = "Please enter a valid code") int code,
			@NotEmpty(message = "Category cannot be empty") String category,
			@NotEmpty(message = "Institution type cannot be empty") String type,
			@NotEmpty(message = "Institution name cannot be empty") String name,
			@NotEmpty(message = "University cannot be empty") String university,
			@NotEmpty(message = "Address cannot be empty") String address,
			@NotEmpty(message = "City cannot be empty") String city,
			@NotEmpty(message = "State cannot be empty") String state,
			@Range(min = 1945, max = 2020, message = "Please enter a valid inaugral year") int yearOpen,
			@Size(min = 10, max = 10, message = "Please enter a valid telephone number") String telephone,
			@NotEmpty(message = "Principal name cannot be empty") String principal, String status,
			List<Student> studentList) {
		super(userId, password, role);
		this.code = code;
		this.category = category;
		this.type = type;
		this.name = name;
		this.university = university;
		this.address = address;
		this.city = city;
		this.state = state;
		this.yearOpen = yearOpen;
		this.telephone = telephone;
		this.principal = principal;
		this.status = status;
		this.studentList = studentList;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getYearOpen() {
		return yearOpen;
	}

	public void setYearOpen(int yearOpen) {
		this.yearOpen = yearOpen;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Institution [code=" + code + ", category=" + category + ", type=" + type + ", name=" + name
				+ ", university=" + university + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", yearOpen=" + yearOpen + ", telephone=" + telephone + ", principal=" + principal + ", status="
				+ status + ", studentList=" + studentList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((principal == null) ? 0 : principal.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((studentList == null) ? 0 : studentList.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		result = prime * result + yearOpen;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Institution other = (Institution) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (code != other.code)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (principal == null) {
			if (other.principal != null)
				return false;
		} else if (!principal.equals(other.principal))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (studentList == null) {
			if (other.studentList != null)
				return false;
		} else if (!studentList.equals(other.studentList))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		if (yearOpen != other.yearOpen)
			return false;
		return true;
	}
	
	
	
	
}
