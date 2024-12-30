package com.cricket.ipl;

import lombok.Data;

@Data
public class User {
private String name,email,mobile,pass;

public User(String name,String email,String mobile,String pass) {			//constructor
	this.name= name;
	this.email= email;
	this.mobile= mobile;
	this.pass = pass;
}

public String getName() {				//getter
	return name;
}

public void setName(String name) {			//setter
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
}
