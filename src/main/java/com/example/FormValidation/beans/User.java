package com.example.FormValidation.beans;


import java.util.Date;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	@NotNull
	@Size(min=3, max=20)
	private String name;
	
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	private String gender;
	
	@Size(min=8, max=19)
	private String password;
	
	@NotBlank
	private String profession;
	
	@Size(max=100)
	private String note;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date birthday;
	
	@AssertTrue
	private boolean married;
	
	@Min(value=20_000)
	@Max(value=30_000)
	private long income;
	public User() {
		super();
	}
	public User(String name, String email, String gender, String password, String profession, String note,
			Date birthday, boolean married, long income) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.profession = profession;
		this.note = note;
		this.birthday = birthday;
		this.married = married;
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", gender=" + gender + ", password=" + password
				+ ", profession=" + profession + ", note=" + note + ", birthday=" + birthday + ", married=" + married
				+ ", income=" + income + "]";
	}
	

}
