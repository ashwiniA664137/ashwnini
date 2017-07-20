package com.Controller;

public class UserPojo {
int Id;
String Name;

String Username;
String Password;
String ConfirmPass;
String Gender;
int Age;




public UserPojo(int id, String name, String username,
		String password, String confirmPass, String gender) {
	super();
	Id = id;
	Name = name;
	//Dob = dob;
	Username = username;
	Password = password;
	ConfirmPass = confirmPass;
	Gender = gender;
}
public String getConfirmPass() {
	return ConfirmPass;
}
public void setConfirmPass(String confirmPass) {
	ConfirmPass = confirmPass;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}


public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public UserPojo() {
	super();
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
@Override
public String toString() {
	return "UserPojo [Id=" + Id + ", Name=" + Name + ", Username=" + Username
			+ ", Password=" + Password + ", ConfirmPass=" + ConfirmPass
			+ ", Gender=" + Gender + ", Age=" + Age + "]";
}






}
