package com.vmware.cloud.demo.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {
	
    @Id
    @Column(name = "id", nullable = false)
    String id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "gender", nullable = true)
    String gender;

    @Column(name = "email", nullable = true)
    String email;

    @Column(name = "phone", nullable = true)
    String phone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
