package com.jwt.demo;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
public class UserData {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int uid;
  private String name;
  private String email;
  private String password;
  private String roles;
public UserData(int uid, String name, String email, String password, String roles) {
	super();
	this.uid = uid;
	this.name = name;
	this.email = email;
	this.password = password;
	this.roles = roles;
}
public UserData() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}
  
  
  
  
}
 
